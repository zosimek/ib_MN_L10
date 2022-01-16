package edu.ib;

public interface ODEEquation {
    double f(double x, double t);
    // dx/dt = f(x, t)
}
