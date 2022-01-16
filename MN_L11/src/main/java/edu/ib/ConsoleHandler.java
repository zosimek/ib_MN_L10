package edu.ib;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsoleHandler implements StepHandler{
    private static ArrayList<Double> xList = new ArrayList<>();
    private static ArrayList<Double> tList = new ArrayList<>();

    public static double getXValue(int i){
        return xList.get(i);
    }

    public static double getTValue(int i){
        return tList.get(i);
    }

    public static int getNumberOfPoints(){
        return xList.size();
    }


    @Override
    public void update(double x, double t) {
        xList.add(x);
        tList.add(t);
    }

    public void console(){
        System.out.println(Arrays.toString(xList.toArray()));
        System.out.println(Arrays.toString(tList.toArray()));
    }

    public void print2Columns(){
        for(int i = 0; i < xList.size(); i++){
            System.out.println(tList.get(i) + "\t" + xList.get(i));
        }
    }
}
