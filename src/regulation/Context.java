package regulation;

class Context {
    private final Factor factor;

    Context(Factor factor) {
        this.factor = factor;
    }

    double executeStrategy(Instrument instrument) {
        return this.factor.regulateFactorIfNeeded(instrument);
    }
}
