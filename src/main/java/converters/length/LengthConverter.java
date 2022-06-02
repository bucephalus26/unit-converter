package converters.length;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;

import java.util.HashMap;

// Contains a list of different types of length conversions
public class LengthConverter extends UnitTypeConverter {

    // Conversions
    // BaseUnitConverter implemented as own type
    private static BaseUnitConverter meterConverter = new MeterConverter();
    private static BaseUnitConverter footConverter = new FootConverter();
    private static BaseUnitConverter centimeterConverter = new CentimeterConverter();
    private static BaseUnitConverter inchConverter = new InchConverter();
    private static BaseUnitConverter kilometerConverter = new KilometerConverter();
    private static BaseUnitConverter mileConverter = new MileConverter();
    private static BaseUnitConverter millimeterConverter = new MillimeterConverter();


    // Constructor
    // Super takes in standard base unit and a map of all the units
    public LengthConverter() {
        super("Meter", new HashMap<String, BaseUnitConverter>() {
            {
                 put(meterConverter.getName(), meterConverter);
                put(footConverter.getName(), footConverter);
                put(centimeterConverter.getName(), centimeterConverter);
                put(inchConverter.getName(), inchConverter);
                put(kilometerConverter.getName(), kilometerConverter);
                put(mileConverter.getName(), mileConverter);
                put(millimeterConverter.getName(), millimeterConverter);
            }
        });
    }

    // Displays on options
    @Override
    public String getUnitType() {
        return "Length";
    }



}
