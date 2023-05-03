package org.example;

import java.util.List;

public class MainClass
{
    private int periodInYears;
    private double futureValue;

    public MainClass(double presentValue, double interestRate, int periodInYears, double futureValue) {
        this.periodInYears = periodInYears;
        this.futureValue = futureValue;
    }

    public static double calculateFv(double pv, double ir, int period)
    {
        double convertedRate = ir / 100; //converting interest rate from percentage

        double fv = pv * Math.pow((1 + convertedRate), period);  //Fv = Pv(1 + r)^n

        return  fv;
    }

    public List<MainClass> listFutureValues()
    {
        for (int i =0; i<100; i++)
        {

        }

        return  null;
    }

    public static void main(String[] args)
    {
        double val = calculateFv(1050, 6.5, 4);

        System.out.println(val);
    }
}
