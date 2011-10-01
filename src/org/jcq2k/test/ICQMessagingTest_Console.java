package org.jcq2k.test;

import java.util.*;
import org.jcq2k.*;
import org.jcq2k.util.joe.StringUtil;

/**
 * The console application that can be used to test functionality of the
 * ICQ2KMessagingNetwork and ICQMessagingNetwork plugins.
 * <p>
 * 
 * @see org.jcq2k.icq2k.ICQ2KMessagingNetwork
 */
public class ICQMessagingTest_Console {
	private final static org.log4j.Category CAT = org.log4j.Category
			.getInstance(ICQMessagingTest_Console.class.getName());
	public static ICQMessagingTest cfg = new ICQMessagingTest();
	private MessagingNetwork plugin;
	String loginId;
	String password;
	{
		try {
			String className = ICQMessagingTest.REQPARAM_MESSAGING_NETWORK_IMPL_CLASS_NAME
					.trim();
			CAT.info("Instantiating class \"" + className + "\"...");
			plugin = (MessagingNetwork) Class.forName(className).newInstance();
			plugin.init();
			loginId = "" + ICQMessagingTest.REQPARAM_SRC_LOGIN_ID;
			password = ICQMessagingTest.REQPARAM_SRC_PASSWORD;
		} catch (Throwable tr) {
			CAT.error("exception", tr);
			System.exit(1);
		}
	}
	String contactList = null;
	{
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(
				ICQMessagingTest.REQPARAM_CONTACT_LIST_LOGIN_IDS, ",");
		while (st.hasMoreTokens()) {
			sb.append(st.nextToken());
			if (st.hasMoreTokens())
				sb.append("\n");
		}
		contactList = sb.toString();
	}

	String[] getContactList() {
		java.util.List cl = new java.util.LinkedList();
		StringTokenizer st = new StringTokenizer(contactList);
		StringBuffer dbg = new StringBuffer("test app contactlist: ");
		while (st.hasMoreTokens()) {
			String loginId = st.nextToken().trim();
			if (loginId.length() == 0)
				continue;
			dbg.append("'" + loginId + "' ");
			cl.add(loginId);
		}
		CAT.info(dbg.toString());
		return (String[]) cl.toArray(new String[cl.size()]);
	}

	//
	String getMyLoginId() {
		return loginId;
	}

	void login() {
		try {
			plugin.login(getMyLoginId(), password, getContactList(),
					MessagingNetwork.STATUS_ONLINE);
		} catch (Throwable tr) {
			CAT.error("exception", tr);
		}
	}

	void logout() {
		try {
			plugin.logout(getMyLoginId());
		} catch (Throwable tr) {
			CAT.error("exception", tr);
		}
	}

	public static void main(java.lang.String[] args) {
		try {
			// System.err.println("logging is done using log4j.");
			new ICQMessagingTest_Console().run();
		} catch (Throwable tr) {
			CAT.error("exception", tr);
			System.exit(1);
		}
	}

	public void run() {
		try {
			// start logging in
			plugin.addMessagingNetworkListener(new MessagingNetworkListener() {
				public void messageReceived(byte networkId, String from,
						String to, String text) {
					// CAT.info("incoming message from " + from + " to " + to +
					// " (len: " + text.length() + "):\r\n\"" + text + "\"");
					System.out.print("\r\n incoming message from "
							+ from
							//+ " to "
							//+ to
							+ (text == null ? ": null (BUGGG!!)" : " ("
									+ text.length() + " chars):\r\n\"" + text
									+ "\""));
				}

				public void contactsReceived(byte networkId, String from,
						String to, String[] contactsUins, String[] contactsNicks) {
					StringBuffer sb = new StringBuffer(
							"incoming contacts from " + from + " to " + to
									+ ", number of contacts="
									+ contactsNicks.length + ":\r\n");
					int i = 0;
					while (i < contactsNicks.length) {
						sb.append("  nick="
								+ StringUtil
										.toPrintableString(contactsNicks[i])
								+ "\r\n" + "  uin ="
								+ StringUtil.toPrintableString(contactsUins[i])
								+ "\r\n");
						i++;
					}
					String s = sb.toString();
					CAT.info(s);
					// log(s);
				}

				public void statusChanged(byte networkId, String srcLoginId,
						String dstLoginId, int status, int reasonCategory,
						String reasonMessage) {
					//String status_s = "invalid: " + status + " (BUGGG!)";
					switch (status) {
					case MessagingNetwork.STATUS_OFFLINE:
						//status_s = "offline";
						break;
					case MessagingNetwork.STATUS_ONLINE:
						//status_s = "online";
						break;
					case MessagingNetwork.STATUS_BUSY:
						//status_s = "busy";
						break;
					}
					// if (srcLoginId.equals(dstLoginId))
					// System.out.print(srcLoginId +
					// " changed its client status to " + status_s + " [" +
					// (reasonMessage == null ? "no reason given" : "reason: " +
					// reasonMessage) + "]");
					// else
					// System.out.print(srcLoginId + " reports: " + dstLoginId +
					// " changed status to " + status_s);
					// java.awt.Toolkit.getDefaultToolkit().beep();
//					if (getMyLoginId().equals(srcLoginId)
//							&& srcLoginId.equals(dstLoginId)) {
//						switch (status) {
//						case MessagingNetwork.STATUS_OFFLINE:
//							// clientStatus.select("Offline");
//							// enableLoginUI();
//							break;
//						case MessagingNetwork.STATUS_ONLINE:
//							// clientStatus.select("Online");
//							break;
//						case MessagingNetwork.STATUS_BUSY:
//							// clientStatus.select("Busy");
//							break;
//						}
//					}
				}
			});
			login();
			plugin.sendMessage(getMyLoginId(), "36770049",
					"Foresexpert started");
		} catch (Throwable tr) {
			CAT.error("exception", tr);
		}
	}
}