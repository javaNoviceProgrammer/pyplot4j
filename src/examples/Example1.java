package examples;

import java.util.Arrays;

import pyplot4j.util.MathUtils;
import pyplot4j.xy.XYPlot;

public class Example1 {

	public static void main(String[] args) {
		// step 0
		double[] x = MathUtils.linspace(-2.0*Math.PI, 2.0*Math.PI, 1000) ;
		double[] y1 = Arrays.stream(x).map(Math::sin).toArray() ;
		double[] y2 = Arrays.stream(x).map(Math::cos).toArray() ;
		// step 1
		XYPlot plt = new XYPlot("A simple plot from java!!!!") ;
		plt.plot(x, y1).color("b").linestyle("-").linewidth(2.0).label("y=sin(x)") ;
		// step 2
		plt.plot(x, y2).color("r").linestyle("--").linewidth(3.0).label("y=cos(x)") ;
		// step 3
		plt.xlabel("X values").ylabel("Y values").legend(true).grid(true) ;
		// step 4
		plt.show();

	}

}
