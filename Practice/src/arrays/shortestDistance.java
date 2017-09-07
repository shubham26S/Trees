package arrays;
import java.util.*;
public class shortestDistance{
  public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    x.add(0);
    x.add(1);
    x.add(1);
    y.add(0);
    y.add(1);
    y.add(2);
    shortestDistance sdf = new shortestDistance();
    System.out.println(sdf.coverPoints(x,y));
  }

  public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
    int count = 0;
    for(int i = 1; i < X.size(); i++){
          int distX = Math.abs (X.get(i) - X.get(i-1));
          int distY = Math.abs (Y.get(i) - Y.get(i-1));
          count += Math.max(distX, distY);
    }
    return count;
  }
}
