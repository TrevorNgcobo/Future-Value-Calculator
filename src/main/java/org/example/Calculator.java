package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    FututeValue calculateFV(double pv, double intRate, int years)
    {
        double convertedRate = intRate/100; //Convert interest rate from percentage to decimal
        double result = pv * Math.pow((1+convertedRate), years); //Formal equation FV = PV(1+r)^n where n=years; r= interest rate
        return new FututeValue(years, pv, result, intRate);
    }

    List<FututeValue> fvList(double presentV, double intRate, int y)
    {
        List list = new ArrayList<FututeValue>();

        for (int i =0; i<y; i++)
        {
            FututeValue fv = calculateFV(presentV, intRate, i+1);
            list.add(fv);
        }
        return  list;
    }

    public static void main(String[] args) {

        List<FututeValue> lst = new Calculator().fvList(450000, 7.8, 2);

        for(FututeValue fv : lst)
        {
            System.out.println("Year : " + fv.getYears() + ", " + "Future Value : " + fv.getFutureValue());
        }
    }
}
