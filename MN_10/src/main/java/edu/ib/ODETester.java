package edu.ib;

public class ODETester {
    public static void main(String[] args) {
        ODESolver solver = new ODESolver();
        Function function = new Function();
        solver.euler(0.05, 0.5, 0.01, 19.53, function);
        System.out.println("\n NEXT \n");

        solver.eulerModified(0.05, 0.5, 0.01, 19.53, function);
    }
}

