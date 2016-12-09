package regulation;

import misc.Number;

public abstract class Instrument extends Number {
    private double factorStat;
    private double lowerBoundary;
    private double upperBoundary;

    double getPerfectFactorStat() {
        return perfectFactorStat;
    }

    void setPerfectFactorStat(double perfectFactorStat) {
        this.perfectFactorStat = perfectFactorStat;
    }

    private double perfectFactorStat;

    private double getLowerBoundary() {
        return lowerBoundary;
    }

    void setLowerBoundary(double lowerBoundary) {
        this.lowerBoundary = lowerBoundary;
    }

    private double getUpperBoundary() {
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

    public abstract void displayCurrentFactorStat();

    public void regulateFactorIfNeeded() {
        Context context = determineContext();
        setFactorStat(context.executeStrategy(this));
    }

    private Context determineContext() {
        if (getFactorStat() <= getLowerBoundary() || getFactorStat() >= getUpperBoundary())
            return new Context(new RegulateFactor());
        else
            return new Context(new DontRegulateFactor());
    }
}