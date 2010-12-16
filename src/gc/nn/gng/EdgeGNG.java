package gc.nn.gng;




/**
 * A class representing an edge. 
 *  For example:
 * <pre>
 *    EdgeGNG e = new EdgeGNG();
 *    e.from(Node1);
 *    e.to(Node2);
 * </pre>
 *
 */
class EdgeGNG {
  /**
   * The starting point of the edge
   * @see EdgeGNG
   */
  protected int from = -1;
  /**
   * The end point of the edge
   * @see EdgeGNG
   */
  protected int to = -1;
  /**
   * The age of this edge.
   * @see EdgeGNG
   */
  protected int age = 0;

  /**
   * Replace a node with a new one. This is neccessary after deleting a node
   *  in the static array. In most cases the deleted node will be replaced by
   *  the last node in the static array.
   * 
   * @param old        The index of a node
   * @param newN       The index of a node
   * @see ComputeGNG#deleteNode
   */
  protected void replace(int old, int newN) {
    if (from == old)
      from = newN;
    if (to == old)
      to = newN;
  }
}
