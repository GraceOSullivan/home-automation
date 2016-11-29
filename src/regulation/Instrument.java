package regulation;

import misc.Number;

abstract class Instrument extends Number {
    private double factor;
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

    void setFactor(double factor) {
        this.factor = factor;
    }

    double getFactor() {
        return this.factor;
    }

    abstract void displayCurrentFactorStat();
    abstract void regulateFactorIfNeeded();
    abstract Context determineContext(double lowerBoundary, double upperBoundary);
}
