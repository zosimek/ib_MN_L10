package edu.ib;

public class Function implements ODE{
//    @Override
//    public double f(double t, double x){
//        return -2 * t * t * t + 12 * t * t - 20 * t + 8.5;
//    }

    @Override
    public double f(double t, double x) {return (-30 / (1 - t*t))+(2 * t/(1 - t*t))*x-x*x;
    }
}
