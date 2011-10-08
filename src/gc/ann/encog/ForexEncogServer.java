package gc.ann.encog;

import java.io.*;
import java.net.*;
import org.encog.ml.data.basic.BasicMLDataSet;
import java.util.*;
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

public class ForexEncogServer {
	public static double IDEAL[][] = { { 0.0 } };
	public static double INPUT[][] = { { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 } };;
	public static String smbl = "",tf="",DoIt = "";

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Server side");
		BufferedReader in = null;
		PrintWriter out = null;
		BasicNetwork network;
		ServerSocket servers = null;
		Socket fromclient = null;

		// create server socket
		try {
			servers = new ServerSocket(7777);
		} catch (IOException e) {
			System.out.println("Couldn't listen to port 7777");
			System.exit(-1);
		}

		try {
			System.out.print("Waiting for a client...");
			fromclient = servers.accept();
			System.out.println("Client connected");
		} catch (IOException e) {
			System.out.println("Can't accept");
			System.exit(-1);
		}

		in = new BufferedReader(new InputStreamReader(
				fromclient.getInputStream()));
		out = new PrintWriter(fromclient.getOutputStream(), true);
		String input, output;

		System.out.println("Wait for messages");
		while ((input = in.readLine()) != null) {
			if (input.equalsIgnoreCase("!Exit"))
				break;
			if (input.startsWith("ENCOG,")) {
				// format ENCOG,PAIR,TF,DATA1,DATA2,...
				String[] result = input.split(",");
				if(result.length<3)
				{
					out.println("Error format " );
					continue;
				}
				smbl = result[1]; tf=result[2];
				String dataDir = "c:\\Program Files\\MetaTrader 5\\MQL5\\Files\\";
				final File networkFile = new File(dataDir, "Easy_"+smbl+"_"+tf+".eg");
				try {
					network = (BasicNetwork) EncogDirectoryPersistence
							.loadObject(networkFile);
					} 
				catch (Exception e) 
					{
						out.println("Network "+dataDir+ "\\Easy_"+smbl+"_"+tf+".eg"+" open failed " );
					 continue;
					}
				if(network.getInputCount()!=(result.length-3))
				{ 
					out.println("Size input ("+(result.length-3)+") != network input size ("+network.getInputCount() +")");
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
					out.println(DoIt);
				}
				//delete(network);
			} else
				out.println("S ::: " + input);
			System.out.println(input);
		}
		System.out.println("Server shutdown...");
		out.close();
		in.close();
		fromclient.close();
		servers.close();
	}
}
