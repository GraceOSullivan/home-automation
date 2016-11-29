package regulation;

class KeepFactorUnchanged implements Factor {
    @Override
    public double regulateFactor(double factor) {
        displayFactorUnchanged();
        return factor;
    }
}
