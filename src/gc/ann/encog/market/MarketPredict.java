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

import org.encog.Encog;



/**
 * Use the saved market neural network, and now attempt to predict for today, and the
 * last 60 days and see what the results are.
 */
public class MarketPredict {
		
	public static void main(String[] args)
	{		
		if( args.length<1 ) {
			System.out.println("MarketPredict [data dir] [generate/train/incremental/evaluate]");
		}
		else
		{
			File dataDir = new File(args[0]);
			if( args[1].equalsIgnoreCase("generate") ) {
				MarketBuildTraining.generate(dataDir);
			} 
			else if( args[1].equalsIgnoreCase("train") ) {
				MarketTrain.train(dataDir);
			} 
			else if( args[1].equalsIgnoreCase("evaluate") ) {
				MarketEvaluate.evaluate(dataDir);
			} else if( args[1].equalsIgnoreCase("prune") ) {
				MarketPrune.incremental(dataDir);
			} 
			Encog.getInstance().shutdown();
		}
	}
	
}
