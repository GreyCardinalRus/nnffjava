package gc.ann.encog;

/*
 * Encog(tm) Examples v3.0 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/

 * Copyright 2008-2011 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */

//import java.io.File;

//import org.encog.ml.data.MLData;
//import org.encog.ml.data.MLDataPair;
//import gc.ann.encog.market.Config;

import gc.ann.encog.market.Config;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.util.csv.CSVFormat;
//import org.encog.util.simple.EncogUtility;
import org.encog.util.simple.TrainingSetUtil;
//import org.encog.neural.prune.PruneIncremental;
//import org.encog.persist.EncogDirectoryPersistence;
//import org.encog.persist.EncogPersistor;
//import org.encog.persist.;

import org.encog.engine.network.activation.ActivationTANH;
//import org.encog.neural.data.NeuralData;
//import org.encog.neural.data.NeuralDataPair;
//import org.encog.neural.data.NeuralDataSet;
//import org.encog.neural.data.basic.BasicNeuralDataSet;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.Train;
//import org.encog.neural.networks.training.genetic.NeuralGeneticAlgorithm;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
//import org.encog.neural.networks.training.propagation.back.Backpropagation;
import org.encog.persist.EncogDirectoryPersistence;

/**
 * XOR: This example is essentially the "Hello World" of neural network
 * programming. This example shows how to construct an Encog neural network to
 * predict the output from the XOR operator. This example uses resilient
 * propagation (RPROP) to train the neural network. RPROP is the best general
 * purpose supervised training method provided by Encog.
 * 
 * For the XOR example with RPROP I use 4 hidden neurons. XOR can get by on just
 * 2, but often the random numbers generated for the weights are not enough for
 * RPROP to actually find a solution. RPROP can have issues on really small
 * neural networks, but 4 neurons seems to work just fine.
 * 
 * This example reads the XOR data from a CSV file. This file should be
 * something like:
 * 
 * 0,0,0 1,0,1 0,1,1 1,1,0
 */
public class ForexEncog {

	public static void main(final String args[]) throws InterruptedException {
		String dataDir = "c:\\Program Files\\MetaTrader 5\\MQL5\\Files\\";
		final File networkFile = new File(dataDir, "Easy_EURUSD.eg");
		BasicNetwork network;
		try {
			network = (BasicNetwork) EncogDirectoryPersistence
					.loadObject(networkFile);
		} catch (Exception e) {
			// TODO: handle exception

			final MLDataSet trainingSet = TrainingSetUtil.loadCSVTOMemory(
					CSVFormat.DECIMAL_POINT, dataDir
							+ "Easy_EURUSD_train_data.csv", true, 16, 1);
			network = new BasicNetwork();
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 16));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 16));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 8));
			network.addLayer(new BasicLayer(new ActivationTANH(), true, 1));

			// network.setLogic(new FeedforwardLogic());
			network.getStructure().finalizeStructure();
			network.reset();
			// EncogPersisted
			System.out.println();
			System.out.println("Training Network");
			// train the neural network
			final Train train = new ResilientPropagation(network, trainingSet);
			// final Train train = new Backpropagation(network, trainingSet);
			// final NeuralGeneticAlgorithm train = new
			// NeuralGeneticAlgorithm(network, trainingSet);
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
		// test the neural network
		//File resultFile ;//= new File(dataDir, Config.NETWORK_FILE);
		//MLDataSet trainingSet;
		//while(true)
		{
			Thread.sleep(4000);
		try
		{
			//resultFile = new File(dataDir, "Easy_EURUSD_result_data.csv");
			//if (!resultFile.exists()) 
			{
				MLDataSet trainingSet = TrainingSetUtil.loadCSVTOMemory(
				CSVFormat.DECIMAL_POINT, dataDir
						+ "Easy_EURUSD_prediction_data.csv", true, 16, 1);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dataDir+"\\Easy_EURUSD_result_data.csv",true)));
            //OracleDummy_fc.mqh
            //BufferedWriter fod = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dataDir+"\\OracleDummy_fc.mqh",true)));
            FileOutputStream fileOut = new FileOutputStream(dataDir+"\\OracleDummy_fc.mqh");
            BufferedOutputStream buffer = new BufferedOutputStream(fileOut);
            DataOutputStream fod = new DataOutputStream(buffer);
            fod.writeBytes("double od_forecast(datetime time,string smb)  \r");
            fod.writeBytes(" {\r");
            for (MLDataPair pair : trainingSet) 
			 {
			 final MLData output = network.compute(pair.getInput());
			 if((-0.66>output.getData(0))||(0.66<output.getData(0)))
				 {
					 //(pair.getInput().getData(0)*3.5+1);//
				 System.out.println("actual="
				 + output.getData(0) + ",ideal="
				 + pair.getIdeal().getData(0)+" "+(int)(0.5+(pair.getInput().getData(0)+1)*3.5)
				 +" "+(int)(0.5+(pair.getInput().getData(1)+1)*12)
				 +" "+(int)(0.5+(pair.getInput().getData(2)+1)*30));
				 out.write(Double.toString(output.getData(0)));
				 out.write("\n");                                      //"2011.09.28 18:14:00"
				 fod.writeBytes("  if(smb==\"EURUSD\" && time==StringToTime(\"2011.09.28 "+(int)(0.5+(pair.getInput().getData(1)+1)*12)+":"+(int)(0.5+(pair.getInput().getData(2)+1)*30)+":00\")) return("+output.getData(0)+");\r");
				 }
			 }
            
            trainingSet.close();
            fod.writeBytes("  return(0);\r");
            fod.writeBytes(" }\r");
            fod.close();
            //File f=new File(dataDir	+ "Easy_EURUSD_prediction_data.csv");
            //if(!f.delete()) System.out.print("Err delete \n");
	        out.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
		//System.out.println("Neural Network Results:");
		// for (MLDataPair pair : trainingSet) {
		// final MLData output = network.compute(pair.getInput());
		// System.out.println(pair.getInput().getData(0) + ","
		// + pair.getInput().getData(1) + ", actual="
		// + output.getData(0) + ",ideal="
		// + pair.getIdeal().getData(0));
		// }
	}
}
