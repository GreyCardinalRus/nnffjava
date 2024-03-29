/*
 * Encog(tm) Examples v2.4
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 * 
 * Copyright 2008-2010 by Heaton Research Inc.
 * 
 * Released under the LGPL.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 * 
 * Encog and Heaton Research are Trademarks of Heaton Research, Inc.
 * For information on Heaton Research trademarks, visit:
 * 
 * http://www.heatonresearch.com/copyright.html
 */

package gc.ann.encog.market;

import java.io.File;

import org.encog.ConsoleStatusReportable;
import org.encog.engine.network.activation.ActivationTANH;
import org.encog.ml.data.MLDataSet;
//import org.encog.neural.data.NeuralDataSet;
import org.encog.neural.pattern.FeedForwardPattern;
import org.encog.neural.prune.PruneIncremental;
import org.encog.persist.EncogDirectoryPersistence;
import org.encog.util.simple.EncogUtility;

public class MarketPrune {

	public static void incremental(File dataDir) {
		File file = new File(dataDir, Config.TRAINING_FILE);

		if (!file.exists()) {
			System.out.println("Can't read file: " + file.getAbsolutePath());
			return;
		}

		MLDataSet training = EncogUtility.loadEGB2Memory(file);

		FeedForwardPattern pattern = new FeedForwardPattern();
		pattern.setInputNeurons(training.getInputSize());
		pattern.setOutputNeurons(training.getIdealSize());
		pattern.setActivationFunction(new ActivationTANH());

		PruneIncremental prune = new PruneIncremental(training, pattern, 100, 1, 10,
				new ConsoleStatusReportable());

		prune.addHiddenLayer(5, 50);
		prune.addHiddenLayer(0, 50);

		prune.process();

		File networkFile = new File(dataDir, Config.NETWORK_FILE);
		EncogDirectoryPersistence.saveObject(networkFile, prune.getBestNetwork());

	}
}
