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

import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.util.csv.CSVFormat;
import org.encog.util.simple.EncogUtility;
import org.encog.util.simple.TrainingSetUtil;
//import org.encog.neural.prune.PruneIncremental;
//import org.encog.persist.EncogDirectoryPersistence;
//import org.encog.persist.EncogPersistor;
//import org.encog.persist.;

import org.encog.engine.network.activation.ActivationTANH;
import org.encog.neural.data.NeuralData;
import org.encog.neural.data.NeuralDataPair;
import org.encog.neural.data.NeuralDataSet;
import org.encog.neural.data.basic.BasicNeuralDataSet;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.Train;
import org.encog.neural.networks.training.genetic.NeuralGeneticAlgorithm;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
import org.encog.neural.networks.training.propagation.back.Backpropagation;

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

	public static void main(final String args[]) {
		// Prpototype_EURUSD_train_data.csv
		final MLDataSet trainingSet = TrainingSetUtil.loadCSVTOMemory(CSVFormat.DECIMAL_POINT,
		//		"j:\\data\\xor.csv", true, 2, 1);
		"j:\\data\\Prpototype_EURUSD_train_data.csv", true, 14, 1);
		// final BasicNetwork network = EncogUtility.simpleFeedForward(2, 4, 0,
		// 1,
		// true);
		BasicNetwork network = new BasicNetwork();
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 14));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 28));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 16));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 8));
		network.addLayer(new BasicLayer(new ActivationTANH(), true, 1));

		//network.setLogic(new FeedforwardLogic());
		network.getStructure().finalizeStructure();
		network.reset();
		// EncogPersisted
		System.out.println();
		System.out.println("Training Network");
		// train the neural network
		final Train train = new ResilientPropagation(network, trainingSet);
//		final Train train = new Backpropagation(network, trainingSet);
//		final NeuralGeneticAlgorithm train = new NeuralGeneticAlgorithm(network, trainingSet);
		int epoch = 1;
		do {
			train.iteration();
			System.out
					.println("Epoch #" + epoch + " Error:" + train.getError()*100+"%");
			epoch++;
		} while (train.getError() > 0.01);
		// test the neural network
//		System.out.println("Neural Network Results:");
//		for (MLDataPair pair : trainingSet) {
//			final MLData output = network.compute(pair.getInput());
//			System.out.println(pair.getInput().getData(0) + ","
//					+ pair.getInput().getData(1) + ", actual="
//					+ output.getData(0) + ",ideal="
//					+ pair.getIdeal().getData(0));
//		}
	}
}
