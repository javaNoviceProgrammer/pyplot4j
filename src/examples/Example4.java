package examples;

import pyplot4j.contour.ContourPlot;
import pyplot4j.contour.MeshGrid;
import pyplot4j.util.MathUtils;
import static java.lang.Math.* ;

public class Example4 {

	public static void main(String[] args) {
// step 1
double[] x = MathUtils.linspace(-2.0*PI, 2.0*PI, 200) ;
double[] y = MathUtils.linspace(-PI, PI, 100) ;
// step 2
MeshGrid grid = (xi, yj) -> sin(xi)*cos(yj) ;
// step 3
ContourPlot plt = new ContourPlot("A contour plot from java!!!") ;
plt.contour(x, y, grid)
   .clabel().levels(MathUtils.linspace(-1.0, 1.0, 15))
   .color("r").fmt("%.2f");
// step 4
plt.xlabel("x values").ylabel("y values").grid(true, "major", "both") ;
// step 5
plt.show();
	}

}
