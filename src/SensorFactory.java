public class SensorFactory {
    public Sensor getSensor(String sensorType) {
        if (sensorType.equalsIgnoreCase("BEAM"))
            return new BeamSensor();
        else if (sensorType.equalsIgnoreCase("CEILING"))
            return new CeilingSensor();
        else if (sensorType.equalsIgnoreCase("CONTACT"))
            return new ContactSensor();
        else if (sensorType.equalsIgnoreCase("DOOR"))
            return new DoorSensor();
        else if (sensorType.equalsIgnoreCase("GAS"))
            return new GasSensor();
        else if (sensorType.equalsIgnoreCase("GLASS"))
            return new GlassSensor();
        else if (sensorType.equalsIgnoreCase("MAGNETIC"))
            return new MagneticSensor();
        else if (sensorType.equalsIgnoreCase("PIR"))
            return new PIRSensor();
        else if (sensorType.equalsIgnoreCase("SMOKE"))
            return new SmokeSensor();
        else if (sensorType.equalsIgnoreCase("VIBRATION"))
            return new VibrationSensor();
        else
            return null;
    }
}
