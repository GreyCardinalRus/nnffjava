package gc.ann.encog;

import java.io.*;
import java.net.*;

public class TestClient {

	 public static void main(String[] args) {//throws IOException {

		    System.out.println("Welcome to Client side");

		    Socket fromserver = null;
		    BufferedReader inu = null;
		    BufferedReader in = null;
		    PrintWriter    out = null;
		    if (args.length==0) {
		      System.out.println("use: client hostname");
		      System.exit(-1);
		    }

		    System.out.println("Connecting to... "+args[0]);

		    try
		    {
			    fromserver = new Socket(args[0],7777);
			    in  = new
			    BufferedReader(new 
			    InputStreamReader(fromserver.getInputStream()));
			    out = new 
			     PrintWriter(fromserver.getOutputStream(),true);
			    inu = new 
			     BufferedReader(new InputStreamReader(System.in));
		    }catch (Exception e) {
			    System.out.println("Server not found "+args[0]);
			      System.exit(-1);
				// TODO: handle exception
			}

		    String fuser,fserver;

		    try {
				
		    while ((fuser = inu.readLine())!=null) {
		      out.println(fuser);
		      fserver = in.readLine();
		      System.out.println(fserver);
		      if (fuser.equalsIgnoreCase("close")) break;
		      if (fuser.equalsIgnoreCase("exit")) break;
		    }

		    out.close();
		    in.close();
		    inu.close();
		    fromserver.close();
			} catch (Exception e) {
			      System.out.println("Connection lost ... "+args[0]);
			      System.exit(-1);
			}
		  }
}
