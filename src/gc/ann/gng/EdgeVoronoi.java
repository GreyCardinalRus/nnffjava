package gc.ann.gng;


/**
 * A class representing an edge in the Voronoi diagram
 *
 */
public class EdgeVoronoi {
  /**
   * One part of line equation.
   * (equation: ax + by = c)
   */
  public float a;
  /**
   * One part of line equation.
   * (equation: ax + by = c)
   */
  public float b;
  /**
   * One part of line equation.
   * (equation: ax + by = c)
   */
  public float c;
  /**
   * The number of the edge
   */
  public int edgenbr = 0;

  /**
   * The sites of the edge
   */
  public SiteVoronoi ep[] = new SiteVoronoi[2];
  /**
   * The next region
   */
  public SiteVoronoi reg[] = new SiteVoronoi[2];

}
