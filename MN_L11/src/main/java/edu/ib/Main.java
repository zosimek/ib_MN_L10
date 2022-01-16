package edu.ib;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ODEEquation ode1 = (x, t) -> -2 * t*t*t + 12 * t*t - 20 * t + 8.5;

        ConsoleHandler consoleHandler = new ConsoleHandler();
        ODEIntegrator integrator1 = new ODEIntegrator(0, 4, 1, ode1, new Euler(), consoleHandler);
        integrator1.integrate(0.5);
        consoleHandler.console();
        consoleHandler.print2Columns();

        SaveToFileHandler saveToFile = new SaveToFileHandler("L11");
        saveToFile.writeFile();
    }
}
