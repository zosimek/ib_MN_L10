package edu.ib;

public class ODEIntegrator {
    private double tLeft;
    private double tRight;
    private double x0;
    private ODEEquation ode;
    private ODEStep method;
    private StepHandler stepHendler;

    public ODEIntegrator(double tLeft, double tRight, double x0, ODEEquation ode, ODEStep method, StepHandler stepHendler) {
        this.tLeft = tLeft;
        this.tRight = tRight;
        this.x0 = x0;
        this.ode = ode;
        this.method = method;
        this.stepHendler = stepHendler;
    }

    public void integrate(double h) {
        double x = x0;
        double t;
        for (t = tLeft; t < tRight; t += h){
            stepHendler.update(x, t);
            x = method.step(x, t, h, ode);
        }
        stepHendler.update(x, t);
    }
}
