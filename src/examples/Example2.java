package examples;

import java.util.Arrays;

import pyplot4j.style.LegendLocation;
import pyplot4j.util.MathUtils;
import pyplot4j.xy.XYPlot;
import pyplot4j.xy.XYSubPlot;

public class Example2 {

	public static void main(String[] args) {
		// step 0
		double[] x = MathUtils.linspace(-2.0*Math.PI, 2.0*Math.PI, 1000) ;
		double[] y1 = Arrays.stream(x).map(Math::sin).toArray() ;
		double[] y2 = Arrays.stream(x).map(Math::cos).toArray() ;
		double[] y3 = Arrays.stream(x).map(t -> t*Math.sin(t)).toArray() ;
		double[] y4 = Arrays.stream(x).map(t -> t*Math.cos(t)).toArray() ;
		// step 1
		XYSubPlot plt = new XYSubPlot() ;
		plt.subplot(2, 2, 1).grid(true).xlabel("x values").ylabel("y1 values").title("first subplot!!")
		   .legend(true, LegendLocation.upperRight)
		   .plot(x, y1).color("b").linestyle("-").linewidth(2.0).label("y=sin(x)") ;
		// step 2
		XYPlot subplot = plt.subplot(2, 2, 3).grid(false).xlabel("x values").ylabel("y2 values").title("second subplot!!").legend(true) ;
		subplot.plot(x, y2).color("r").linestyle("--").linewidth(3.0).label("y=cos(x)") ;
		subplot.plot(x, y3).color("b").linestyle("-").linewidth(2.0).label("y=x*sin(x)") ;
		// step 3
		plt.subplot(1, 2, 2).plot(x, y4).color("g").linestyle("-").linewidth(3.0).label("y=x*cos(x)") ;
		// step 4
		plt.tightLayout() ;
		plt.show();

	}

}
