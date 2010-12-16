package gc.nn.gng;


/**
 * A class which represents the elements of the double linked list class
 *  ListGNG.
 *
 */
class ListElem {

  /**
   * The left neighbour.
   */
  ListElem		left;
  /**
   * The right neighbour.
   */
  ListElem		right;
  /**
   * The element is a halfedge.
   */
  HalfEdgeVoronoi	elem;

  /**
   * Constructor, initializes member data.
   */
  ListElem() {
    left = null;
    right = null;
    elem = null;
  }

  /**
   * Constructor, allows setting data.
   *
   * @param HalfEdgeVoronoi elem 	The data elem
   */
  ListElem(HalfEdgeVoronoi elem) {
    left = right = null;
    this.elem = elem;
  }

  /**
   * Constructor, allows setting neighbors and data.
   *
   * @param l 		Left neighbor
   * @param r 		Right neighbor
   * @param elem 	The data elem
   */
  ListElem(ListElem l, ListElem r, HalfEdgeVoronoi elem) {
    left = l;
    right = r;
    this.elem = elem;
  }

  /**
   * Print the element.
   */
  public void print() {
    if(elem != null)
      elem.print();
  }
}
