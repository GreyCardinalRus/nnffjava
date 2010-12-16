package gc.nn.gng;


/**
 * A class representing a node in the grid.
 *
 */
class GridNodeGNG {
  NodeGNG node;
  int index;
  int tau;

  /**
   * Construct the default grid node.
   */
  GridNodeGNG() {
	tau = 0;
	index = -1;
  }

  /**
   * Construct the grid node and sets the index and node.
   */
  GridNodeGNG(int index, NodeGNG node) {
	tau = 0;
	this.index = index;
	this.node = node;
  }

}
