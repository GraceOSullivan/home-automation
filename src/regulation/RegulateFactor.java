package regulation;

import misc.Printer;

class RegulateFactor implements Factor {
    @Override
    public double regulateFactorIfNeeded(Instrument instrument) {
        Printer.getInstance().print("Regulating...");
        return instrument.getPerfectFactorStat();
}
}