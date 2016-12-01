package regulation;

class KeepFactorUnchanged implements Factor {
    @Override
    public double regulateFactor(Instrument instrument) {
        displayFactorUnchanged();
        return instrument.getFactorStat();
    }
}
