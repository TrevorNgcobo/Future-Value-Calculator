package org.example;

import java.util.List;

public class MainClass
{
    private int periodInYears;

    private double presentValue;
    private double interestRate;

    public MainClass() {
    }

    public double calculateFv(double pv, double ir, int period)
    {
        double convertedRate = ir / 100; //converting interest rate from percentage

        double fv = pv * Math.pow((1 + convertedRate), period);  //Fv = Pv(1 + r)^n

        return  fv;
    }

    public List<MainClass> listFutureValues(double pv, double ir, int period)
    {
        MainClass fv = new MainClass();
        int displayPeriod = 1;

        for (int i =0; i<100; i++)
        {
            System.out.println("Year : " + displayPeriod + ", Fv : " + fv.calculateFv(pv, ir, period));
            period++;
            displayPeriod++;
        }

        return  null;
    }

    public static void main(String[] args)
    {
        MainClass mc = new MainClass();
        System.out.println(mc.listFutureValues(2000, 6.1, 1));
    }
}
