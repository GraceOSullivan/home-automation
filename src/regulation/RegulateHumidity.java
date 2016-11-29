package regulation;

class RegulateHumidity implements Factor {
    @Override
    public double regulateFactor(double factor) {
        displayRegulatingFactor();
        return 35.0;
    }
}