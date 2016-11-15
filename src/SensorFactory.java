public class SensorFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(String productType) {
        if (productType.equalsIgnoreCase("BEAM"))
            return new BeamSensor();
        else if (productType.equalsIgnoreCase("CEILING"))
            return new CeilingSensor();
        else if (productType.equalsIgnoreCase("CONTACT"))
            return new ContactSensor();
        else if (productType.equalsIgnoreCase("DOOR"))
            return new DoorSensor();
        else if (productType.equalsIgnoreCase("GAS"))
            return new GasSensor();
        else if (productType.equalsIgnoreCase("GLASS"))
            return new GlassSensor();
        else if (productType.equalsIgnoreCase("MAGNETIC"))
            return new MagneticSensor();
        else if (productType.equalsIgnoreCase("PIR"))
            return new PIRSensor();
        else if (productType.equalsIgnoreCase("SMOKE"))
            return new SmokeSensor();
        else if (productType.equalsIgnoreCase("VIBRATION"))
            return new VibrationSensor();
        else
            return null;
    }
}
