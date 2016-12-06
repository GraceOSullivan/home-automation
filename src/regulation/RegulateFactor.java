package regulation;

class RegulateFactor implements Factor {
    @Override
    public double regulateFactorIfNeeded(Instrument instrument) {
        displayRegulatingFactor();
        return instrument.getPerfectFactorStat();
    }
}