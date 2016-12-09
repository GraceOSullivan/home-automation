package regulation;

import misc.Number;

public abstract class Instrument extends Number {
    private double currentFactorStat;
    private double lowerBoundary;
    private double upperBoundary;
    private double perfectFactorStat;

    double getPerfectFactorStat() {
        return perfectFactorStat;
    }

    void setPerfectFactorStat(double perfectFactorStat) {
        this.perfectFactorStat = perfectFactorStat;
    }

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

    void setCurrentFactorStat(double currentFactorStat) {
        this.currentFactorStat = currentFactorStat;
    }

    double getCurrentFactorStat() {
        return this.currentFactorStat;
    }

    public abstract void displayCurrentFactorStat();

    public void regulateFactorIfNeeded() {
        Context context = determineContext();
        setCurrentFactorStat(context.executeStrategy(this));
    }

    private Context determineContext() {
        if (getCurrentFactorStat() <= getLowerBoundary() || getCurrentFactorStat() >= getUpperBoundary())
            return new Context(new RegulateFactor());
        else
            return new Context(new DontRegulateFactor());
    }
}