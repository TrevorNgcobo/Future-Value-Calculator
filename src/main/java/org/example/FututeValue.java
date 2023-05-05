package org.example;

import java.util.List;

public class FututeValue
{
    private int years;
    private double presentValue;
    private double futureValue;
    private double interestRate;

    public FututeValue(int years, double presentValue, double futureValue, double interestRate) {
        this.years = years;
        this.presentValue = presentValue;
        this.futureValue = futureValue;
        this.interestRate = interestRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getPresentValue() {
        return presentValue;
    }

    public void setPresentValue(double presentValue) {
        this.presentValue = presentValue;
    }

    public double getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(double futureValue) {
        this.futureValue = futureValue;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "FututeValue{" +
                "years=" + years +
                ", presentValue=" + presentValue +
                ", futureValue=" + futureValue +
                ", interestRate=" + interestRate +
                '}';
    }
}
