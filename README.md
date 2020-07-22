# pyplot4j
A nice __static__ java wrapper for matplotlib.pyplot

## Introduction

The plotting library of _matplotlib_ is one the powerful and easy to use libraries ever created.
Although it is possible to implement a similar library purely in java, it also makes sense to simply use the capabilities of the *matplotlib*.
To this end, this repository aims at providing a java framework that can easily generate the _python_ code necessary for drawing the plots.
After the python code is generated, the framework will execute a terminal (commandline) command **"python file_name.py"** and a window will open with the drawn plots.

The original documentation of **matplotlib** can be found here: [Matplotlib Documentation](https://matplotlib.org/Matplotlib.pdf)

## Current Capabilities
* XYPlot
   * this is similar to executing _plt.plot(x, y, *args, **kwargs)_ in python. XYPlot resembles a _Figure_ object in _matplotlib_.
* XYSubPlot
   * this is similar to executing _plt.subplot(row, column, index)_ first and then _plt.plot(x, y, *args, **kwargs)_ in _matplotlib_.
* PolarPlot
   * this is similar to executing a plot with _projection='polar'_ keyword argument.
* ContourPlot
   * this is similar to executing _plt.contour(X, Y, Z, labels=[])_. The contour labels can be set in a similar way to _plt.clabel(**kwargs)_.
   An interface called "MeshGrid.java" is provided to generate the Z data points.
   ```java
   public interface MeshGrid {
	double value(double x, double y) ;
	}
   ```


## Visual Guide to Matplotlib

![visual guide of plot](./src/resources/pic2.png)

## XYPlot

Here's an example:

![examlpe of xy plot](./src/resources/pic1.png)

## XYSubPlot


## PolarPlot


## ContourPlot


