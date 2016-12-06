package regulation;

class KeepFactorUnchanged implements Factor {
    @Override
    public double regulateFactorIfNeeded(Instrument instrument) {
        displayFactorUnchanged();
        return instrument.getFactorStat();
    }
}
