package gc.ann.gng;


/**
 * A class representing a halfedge in the Voronoi diagram
 *
 */
public class HalfEdgeVoronoi {
  public HalfEdgeVoronoi ELleft;
  public HalfEdgeVoronoi ELright;
  public EdgeVoronoi ELedge = null;
  public SiteVoronoi vertex = null;
  public int ELpm = -1;
  public int ELrefcnt = -1;
  public float ystar = -1.0f;

  public HalfEdgeVoronoi() {
    ELedge = new EdgeVoronoi();
    vertex = new SiteVoronoi();
    ELpm = 0;
    ystar = 0.0f;
  }

  public HalfEdgeVoronoi(EdgeVoronoi e, int pm) {
    ELedge = e;
    ELpm = pm;
    vertex = null;
    ELrefcnt = 0;
  }

  /**
   * Returns whether this edge is greater than the passed edge.
   *
   * @param HalfEdgeVoronoi he	 	The edge to compare this edge to.
   */
  public boolean greaterThan(HalfEdgeVoronoi he) {
    return ystar > he.ystar;
  }
  
  /**
   * Returns whether this edge is equal to the passed edge.
   *
   * @param HalfEdgeVoronoi he	 	The edge to compare this edge to.
   */
  public boolean equal(HalfEdgeVoronoi he) {
    return ystar == he.ystar;
  }
  
  /**
   * Prints this edge.
   */
  public void print() {
    System.out.println("HE: ystar = " + ystar + ", ELpm = " + ELpm);
  }

}
