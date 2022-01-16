package edu.ib;

public class ODESolver {
    public void euler(double a, double b, double h, double x0, ODE ode){
        double result = x0;
        double t = a;
        while(t <= b){
            System.out.println(t + "\t" + result);
            result += ode.f(t, result) * h;
            t += h;
        }
    }

    public void eulerModified(double a, double b, double h, double x0, ODE ode){
        double result = x0;
        for (double t = a; t <= b; t += h){
            System.out.println(t + "\t" + result);
            double xMid = result + ode.f(t, result) * h/2;
            result += ode.f(t + h/2, xMid) * h;

        }
    }
}

