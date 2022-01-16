package edu.ib;

public class Euler implements ODEStep{
    @Override
    public double step(double x, double t, double h, ODEEquation ode) {
        return ode.f(x, t) * h + x;
    }
}
