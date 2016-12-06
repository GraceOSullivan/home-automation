package regulation;

import misc.Printer;

class DontRegulateFactor implements Factor {
    @Override
    public double regulateFactorIfNeeded(Instrument instrument) {
        Printer.getInstance().print("Keeping this the same...");
        return instrument.getFactorStat();
    }
}
