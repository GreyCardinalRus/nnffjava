package gc.ann.encog;

import java.io.*;
import java.net.*;
import org.encog.ml.data.basic.BasicMLDataSet;
import java.io.File;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.neural.networks.BasicNetwork;
import org.encog.persist.EncogDirectoryPersistence;

public class ForexEncogServer extends Thread {
	Socket s;
	int num;
	public static double IDEAL[][] = { { 0.0 } };
	public static double INPUT[][] = { { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 } };;
	public static String smbl = "", tf = "", DoIt = "";

	public ForexEncogServer(int num, Socket s) {
		// �������� ������
		this.num = num;
		this.s = s;

		// � ��������� ����� �������������� ����� (��. �-� run())
		setDaemon(true);
		setPriority(NORM_PRIORITY);
		start();
	}

	public static void main(String[] args) {// throws IOException {
		System.out.println("Welcome to Server side");
		try {
			int i = 0; // ������� �����������

			// ���������� ����� �� ���������, ���� 7777
			ServerSocket server = new ServerSocket(7777, 0,
					InetAddress.getByName("localhost"));

			System.out.println("server is started");

			// ������� ����
			while (true) {
				// ��� ������ �����������, ����� ���� ��������� ���������
				// �������
				// � ����� �������������� ����� � ����������� ������� ��
				// ��������
				new ForexEncogServer(i, server.accept());
				i++;
			}
		} catch (Exception e) {
			System.out.println("init error: " + e);
		} // ����� ����������
	}

	public void run() {
		BufferedReader in = null;
		PrintWriter out = null;
		BasicNetwork network;
		// ServerSocket servers = null;
		// Socket fromclient = null;
		String input = "", output = "";
		// try
		{
			// �� ������ ������� ���� ����� �������� ������ //InputStream in =
			// s.getInputStream();
			// � ������ �� - ����� ������ �� ������� � ������� //OutputStream
			// out = s.getOutputStream();
			System.out.println("Wait for messages");
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = new PrintWriter(s.getOutputStream(), true);
				while (1 == 1) {
					if ("" != output) {
						System.out.println(output);
						out.println(output);
						output = "";
					}
					if ((input = in.readLine()) == null)
						continue;
					if (input.equalsIgnoreCase("!Exit"))
						break;
					if (input.startsWith("ENCOG,")) {
						// format ENCOG,PAIR,TF,DATA1,DATA2,...
						String[] result = input.split(",");
						if (result.length < 3) {
							output = "Error format ";
							continue;
						}
						smbl = result[1];
						tf = result[2];
						String dataDir = "c:\\Program Files\\MetaTrader 5\\MQL5\\Files\\";
						final File networkFile = new File(dataDir, "Easy_"
								+ smbl + "_" + tf + ".eg");
						try {
							network = (BasicNetwork) EncogDirectoryPersistence
									.loadObject(networkFile);
						} catch (Exception e) {
							output = "Network " + dataDir + "\\Easy_" + smbl
									+ "_" + tf + ".eg" + " open failed ";
							continue;
						}
						if (network.getInputCount() != (result.length - 3)) {
							output = "Size input (" + (result.length - 3)
									+ ") != network input size ("
									+ network.getInputCount() + ")";
							continue;
						}
						for (int x = 2; x < result.length; x++)
							INPUT[0][x - 1] = Double.valueOf(result[x]);
						BasicMLDataSet inputSet = new BasicMLDataSet(INPUT,
								IDEAL);
						for (MLDataPair pair : inputSet) {
							final MLData outputEnvog = network.compute(pair
									.getInput());
							DoIt = "None";
							if (-0.66 > outputEnvog.getData(0))
								DoIt = "!Sell " + smbl;
							else if (-0.33 > outputEnvog.getData(0))
								DoIt = "!CloseBuy " + smbl;
							else if (0.33 > outputEnvog.getData(0))
								DoIt = "None " + smbl;
							else if (0.66 < outputEnvog.getData(0))
								DoIt = "!Buy " + smbl;
							else if (0.33 < outputEnvog.getData(0))
								DoIt = "CloseSell " + smbl;
							output = DoIt;
						}
						// delete(network);
					} else
						output = "S ::: " + input;
				}
				System.out.println("Server shutdown...");
				out.close();
				in.close();
				s.close();
				// servers.close();
			} catch (Exception e) {
				System.out.println("Connection close");// TODO: handle exception
			}
		}
	}
}

//
// // ������ ������ � 64 ���������
// byte buf[] = new byte[64*1024];
// // ������ 64�� �� �������, ��������� - ���-�� ������� �������� ������
// int r = is.read(buf);
//
// // ������ ������, ���������� ���������� �� ������� ����������
// String data = new String(buf, 0, r);
//
// // ��������� ������ �� ������ ������:
// data = ""+num+": "+" "+data;
//
// // ������� ������:
// os.write(data.getBytes());
//
// // ��������� ����������
// s.close();
// }
// catch(Exception e)
// {System.out.println("init error: "+e);} // ����� ����������
// }

// // create server socket
// try {
// servers = new ServerSocket(7777);
// } catch (IOException e) {
// System.out.println("Couldn't listen to port 7777");
// System.exit(-1);
// }
//
// try {
// System.out.print("Waiting for a client...");
// fromclient = servers.accept();
// System.out.println("Client connected");
// } catch (IOException e) {
// System.out.println("Can't accept");
// System.exit(-1);
// }
//
// try {
// in = new BufferedReader(new InputStreamReader(
// fromclient.getInputStream()));
// out = new PrintWriter(fromclient.getOutputStream(), true);
// } catch (Exception e) {
// // TODO: handle exception
// }
