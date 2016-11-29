package regulation;

class RegulateTemperature implements Factor {
    @Override
    public double regulateFactor(double factor) {
        displayRegulatingFactor();
        return 15.0;
    }
}