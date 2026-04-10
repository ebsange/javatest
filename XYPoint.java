public class XYPoint {
  private int x;
  private int y;
  
  public XYPoint(int xVal, int yVal)
  {
    x = xVal;
    y = yVal;
  }
  
  public void getPoint()
  {
    System.out.println("(" + x + ", " + y + ")");
  }
}