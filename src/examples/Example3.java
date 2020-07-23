package examples;

import java.util.Arrays;

import pyplot4j.polar.PolarPlot;
import pyplot4j.util.MathUtils;
import static java.lang.Math.* ;

public class Example3 {

	public static void main(String[] args) {
		// step 0
		double[] theta = MathUtils.linspace(-2.0*Math.PI, 2.0*Math.PI, 1000) ;
		double[] r1 = Arrays.stream(theta).map(t -> abs(sin(t))).toArray() ;
		double[] r2 = Arrays.stream(theta).map(t -> abs(cos(t))).toArray() ;
		// step 1
		PolarPlot plt = new PolarPlot("A polar plot from java!!!!") ;
		plt.plot(theta, r1).color("b").linestyle("-").linewidth(2.0).label("y=sin(x)") ;
		// step 2
		plt.plot(theta, r2).color("r").linestyle("--").linewidth(3.0).label("y=cos(x)") ;
		// step 3
		plt.tightLayout() ;
		// step 4
		plt.show();
	}

}
