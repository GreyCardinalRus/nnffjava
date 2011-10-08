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
	public static String smbl = "";
	public static String DoIt = "";

	 public static void main(String[] args) throws IOException {
		    System.out.println("Welcome to Server side");
		    BufferedReader in = null;
		    PrintWriter    out= null;

		    ServerSocket servers = null;
		    Socket       fromclient = null;

		    // create server socket
		    try {
		      servers = new ServerSocket(7777);
		    } catch (IOException e) {
		      System.out.println("Couldn't listen to port 7777");
		      System.exit(-1);
		    }

		    try {
		      System.out.print("Waiting for a client...");
		      fromclient= servers.accept();
		      System.out.println("Client connected");
		    } catch (IOException e) {
		      System.out.println("Can't accept");
		      System.exit(-1);
		    }

		    in  = new BufferedReader(new 
		     InputStreamReader(fromclient.getInputStream()));
		    out = new PrintWriter(fromclient.getOutputStream(),true);
		    String         input,output;

		    System.out.println("Wait for messages");
		    while ((input = in.readLine()) != null) {
		     if (input.equalsIgnoreCase("exit")) break;
		     out.println("S ::: "+input);
		     System.out.println(input);
		    }
		    System.out.println("Server shutdown...");
		    out.close();
		    in.close();
		    fromclient.close();
		    servers.close();
		  }}
