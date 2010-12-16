package gc.nn.gng;


/**
 * A class which implements a double linked list and a priority queue.
 *
 */
public class ListGNG {

  /**
   * Head of the list.
   *
   */
  public ListElem head;
  /**
   * Number of elements in the list.
   *
   */
  int numElems;

  /**
   * Construct the default list.
   */
  public ListGNG() {
    head = new ListElem();
    head.left = null;
    head.right = null;
    numElems = 0;
  }

  /**
   * Returns the first element in the list or null.
   *
   */
  public ListElem first() {
    return head.right;
  }

  /**
   * Returns the last element in the list or null.
   *
   */
  public ListElem last() {
    return head.left;
  }

  /**
   * Begin of list.
   * Returns true, if p is the first element of the list.
   *
   */
  public boolean bol(ListElem p) {
    return (head.right == p);
  }

  /**
   * End of list.
   * Returns true, if p is the last element of the list.
   *
   */
  public boolean eol(ListElem p) {
    return (head.left == p);
  }

  /**
   * Inserts an element into the list after position p.
   *
   * @param elem 	The element to be inserted.
   * @param p 		The position.
   */
  public void insert(HalfEdgeVoronoi elem, ListElem p) {
    ListElem q = new ListElem(null, null, elem);

    if ( eol(p) || empty() ) {
      p.right = q;
      q.left = p;
      q.right = null;
      head.left = q;
    } else {
      q.left = p;
      q.right = p.right;
      p.right.left = q;
      p.right = q;
    }
    numElems++;
  }

  /**
   * Deletes the element at position p.
   *
   * @param p 		The position.
   */
  public void delete(ListElem p) {
    if ( numElems == 1 ) {
      head.left = head.right = null;
    } else if ( eol(p) ) {
      head.left = p.left;
      p.left.right = null;
    } else {
      p.left.right = p.right;
      p.right.left = p.left;
    }
    p = null;
    numElems--;
  }

  /**
   * Find an element; returns the position p or null.
   *
   * @param elem 	The element to be searched.
   * @return 		The position.
   */
  public ListElem find(HalfEdgeVoronoi elem) {
    ListElem	p;
    p = first();

    while (p != null) {
      if (p.elem == elem)
	return(p);
      p = next(p);
    }
    return(null);
  }

  /**
   * Returns the next element of p.
   *
   * @param p 		The position.
   */
  public ListElem next(ListElem p) {
    return(p.right);
  }

  /**
   * Returns the previous element of p.
   *
   * @param p 		The position.
   */
  public ListElem previous(ListElem p) {
    return(p.left);
  }

  /**
   * Returns true if the list is empty.
   */
  public boolean empty() {
    return(numElems == 0);
  }

  /**
   * Prints the list.
   */
  public void print() {
    ListElem	p;

    if ( empty() ) {
      System.out.println("EMPTY");
      return;
    }

    System.out.println("Number of Elements: " + numElems);

    p = first();

    do {
      p.print();
      p = next(p);
    } while ( p != null );
  }

  /**
   * Inserts an element into the sorted list.
   *
   * @param elem 	The element to be inserted.
   */
  public void PQinsert(HalfEdgeVoronoi elem) {
    // Find the right position
    ListElem	p;
    p = first();

    if ( p == null )
      p = head;
    else {
      while (p != null) {
		if (p.elem.greaterThan(elem)) 
		  break;
		p = next(p);
      }
      if (p == null)
		p = last();
      else
		p = previous(p);
    }

    insert(elem, p);
  }

  /**
   * Same as delete.
   *
   * @param p 		The position.
   */
  public void PQdelete(HalfEdgeVoronoi elem) {
    // Find the right position
    ListElem	p;
    p = find(elem);

    if (p == null)
      return;

    delete(p);
  }

  /**
   * Returns the coordinates of the minimum of the sorted
   *  list (priority queue).
   *
   * @return 	The coordinates of the minimum element.
   */
  public FPoint PQ_min() {
    ListElem p = first();
    FPoint fp = new FPoint(p.elem.vertex.coord.x, p.elem.ystar);
    return(fp);
  }

  /**
   * Remove first element (minimum) from the list and return it.
   *
   * @return 	The minimum element.
   */
  public HalfEdgeVoronoi PQextractmin() {
    ListElem p = first();
    HalfEdgeVoronoi min;

    min = p.elem;
    delete(p);
    return(min);
  }

}
