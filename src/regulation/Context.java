package regulation;

class Context {
    private final Factor factor;

    Context(Factor factor) {
        this.factor = factor;
    }

    double executeStrategy(double factor) {
        return this.factor.regulateFactor(factor);
    }
}
