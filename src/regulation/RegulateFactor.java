package regulation;

class RegulateFactor implements Factor {
    @Override
    public double regulateFactor(Instrument instrument) {
        displayRegulatingFactor();
        return instrument.getPerfectFactorStat();
    }
}