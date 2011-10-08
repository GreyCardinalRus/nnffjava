package gc.ann.encog;

import org.encog.ml.data.basic.BasicMLDataSet;
import java.util.*;
import org.jcq2k.*;
import org.jcq2k.test.ICQMessagingTest;
import org.jcq2k.util.joe.StringUtil;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.util.csv.CSVFormat;
import org.encog.util.simple.TrainingSetUtil;
import org.encog.engine.network.activation.ActivationTANH;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.Train;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
import org.encog.persist.EncogDirectoryPersistence;

/**
 * The console application that can be used to test functionality of the
 * ICQ2KMessagingNetwork and ICQMessagingNetwork plugins.
 * <p>
 * 
 * @see org.jcq2k.icq2k.ICQ2KMessagingNetwork
 */
public class ForexEncogICQ {
	/*
	 * private final static org.log4j.Category CAT = org.log4j.Category
	 * .getInstance(ForexEncogICQ.class.getName());
	 */public static ICQMessagingTest cfg = new ICQMessagingTest();
	private MessagingNetwork plugin;
	static BasicNetwork network;
	String loginId;
	String password;
	{
		try {
			String className = ICQMessagingTest.REQPARAM_MESSAGING_NETWORK_IMPL_CLASS_NAME
					.trim();
			// CAT.info("Instantiating class \"" + className + "\"...");
			plugin = (MessagingNetwork) Class.forName(className).newInstance();
			plugin.init();
			loginId = "" + ICQMessagingTest.REQPARAM_SRC_LOGIN_ID;
			password = ICQMessagingTest.REQPARAM_SRC_PASSWORD;
		} catch (Throwable tr) {
			System.out.print("exception" + tr);
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
		// System.out.print(dbg.toString());
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
			System.out.print("exception " + tr);
		}
	}

	void logout() {
		try {
			plugin.logout(getMyLoginId());
		} catch (Throwable tr) {
			System.out.print("exception " + tr);
		}
	}

	public static double IDEAL[][] = { { 0.0 } };
	public static double INPUT[][] = { { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 } };;
	public static String smbl = "";
	public static String DoIt = "";

	public static void main(java.lang.String[] args) {
		try {
			// System.err.println("logging is done using log4j.");
			System.out.print("Run...");
			new ForexEncogICQ().run();
		} catch (Throwable tr) {
			System.out.print("exception " + tr);
			System.exit(1);
		}
	}

	public void run() {
		try {
			// start logging in
			plugin.addMessagingNetworkListener(new MessagingNetworkListener() {
				public void messageReceived(byte networkId, String from,
						String to, String text) {
					System.out.print("\r\nIncoming message from "
							+ from
							+ (text == null ? ": null (BUGGG!!)" : " ("
									+ text.length() + " chars):\r\n\"" + text
									+ "\"\r\n"));
					if (text != null) {
						String[] result = text.split(",");
						smbl = result[0];
						for (int x = 1; x < result.length; x++)
							INPUT[0][x - 1] = Double.valueOf(result[x]);
						BasicMLDataSet inputSet = new BasicMLDataSet(INPUT,
								IDEAL);
						String dataDir = "c:\\Program Files\\MetaTrader 5\\MQL5\\Files\\";
						final File networkFile = new File(dataDir, "Easy_"+smbl+".eg");
						try {
							network = (BasicNetwork) EncogDirectoryPersistence
									.loadObject(networkFile);
							} 
						catch (Exception e) 
							{
							// TODO: handle exception

							final MLDataSet trainingSet = TrainingSetUtil.loadCSVTOMemory(
									CSVFormat.DECIMAL_POINT, dataDir
											+ "Easy_"+smbl+"_train_data.csv", true, 16, 1);
							network = new BasicNetwork();
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 16));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 16));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 8));
							network.addLayer(new BasicLayer(new ActivationTANH(), true, 1));

							network.getStructure().finalizeStructure();
							network.reset();
							// EncogPersisted
							System.out.println();
							System.out.println("Training Network");
							// train the neural network
							final Train train = new ResilientPropagation(network, trainingSet);
							int epoch = 1;
							do {
								train.iteration();
								System.out.println("Epoch #" + epoch + " Error:"
										+ train.getError() * 100 + "%");
								epoch++;
							} while (train.getError() > 0.015);
							EncogDirectoryPersistence.saveObject(networkFile, network);
							System.out.println("Neural Network Saved:");
							}
						
						for (MLDataPair pair : inputSet) {
							final MLData output = network.compute(pair
									.getInput());
							DoIt = "None";
							if (-0.66 > output.getData(0))
								DoIt = "!Sell " + result[0];
							else if (-0.33 > output.getData(0))
								DoIt = "!CloseBuy " + result[0];
							else if (0.33 > output.getData(0))
								DoIt = "None " + result[0];
							else if (0.66 < output.getData(0))
								DoIt = "Buy " + result[0];
							else if (0.33 < output.getData(0))
								DoIt = "CloseSell " + result[0];
							{
								try {
									if(!DoIt.startsWith( "None"))
									plugin.sendMessage(getMyLoginId(), from,
											DoIt + "  " + output.getData(0));
								} catch (Throwable tr) {
									System.out.print("exception " + tr);
								}

							}
						}
					}
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
					System.out.print(s);
					// log(s);
				}

				public void statusChanged(byte networkId, String srcLoginId,
						String dstLoginId, int status, int reasonCategory,
						String reasonMessage) {
					// String status_s = "invalid: " + status + " (BUGGG!)";
					switch (status) {
					case MessagingNetwork.STATUS_OFFLINE:
						// status_s = "offline";
						break;
					case MessagingNetwork.STATUS_ONLINE:
						// status_s = "online";
						break;
					case MessagingNetwork.STATUS_BUSY:
						// status_s = "busy";
						break;
					}
				}
			});
			login();
			plugin.sendMessage(getMyLoginId(), "36770049",
					"Foresexpert started");
		} catch (Throwable tr) {
			System.out.print("exception " + tr);
		}
	}
}
