package regulation;

import misc.Number;

abstract class Instrument extends Number {
    private double factorStat;
    private double lowerBoundary;
    private double upperBoundary;

    double getLowerBoundary() {
        return lowerBoundary;
    }

    void setLowerBoundary(double lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    double getUpperBoundary() {
        return upperBoundary;
    }

    void setUpperBoundary(double upperBoundary) {
        this.upperBoundary = upperBoundary;
    }

    void setFactorStat(double factorStat) {
        this.factorStat = factorStat;
    }

    double getFactorStat() {
        return this.factorStat;
    }

    abstract void displayCurrentFactorStat();
    abstract void regulateFactorIfNeeded();
    abstract Context determineContext(double lowerBoundary, double upperBoundary);
}
