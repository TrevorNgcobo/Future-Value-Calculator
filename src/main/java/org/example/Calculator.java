package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    double calculateFV(double presentV, double intRate, int y)
    {
      double pv = presentV;
      double ir = intRate;
      double convertedRate = intRate/100; //Convert interest rate from percentage to decimal
      int years = y;
      double result;

      result = pv * Math.pow((1+convertedRate), years); //Formal equation FV = PV(1+r)^n) where n=years; r= interest rate
      return result;
    }

    List<FututeValue> fvList(double presentV, double intRate, int y)
    {
        List list = new ArrayList<FututeValue>();

        for (int i =0; i<y; i++)
        {
            double fvCalculated = calculateFV(presentV, intRate, i+1);
            FututeValue fv = new FututeValue(i+1, presentV,fvCalculated,intRate);
            list.add(fv);
        }
        return  list;
    }

    public static void main(String[] args) {
        Calculator cltr = new Calculator();
        List<FututeValue> lst = cltr.fvList(23000, 6.4, 3);

        for(FututeValue fv : lst)
        {
            System.out.println("Year : " + fv.getYears() + ", " + "Future Value : " + fv.getFutureValue());
        }

    }
}
