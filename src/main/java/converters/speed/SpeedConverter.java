package converters.speed;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.length.FootConverter;
import converters.length.MeterConverter;

import java.util.HashMap;

// Contains a list of different types of length conversions
public class SpeedConverter extends UnitTypeConverter {

    // Conversions
    // BaseUnitConverter implemented as own type
    private static BaseUnitConverter meterSecondConverter = new MeterSecondConverter();
    private static BaseUnitConverter milesHourConverter = new MilesHourConverter();
    private static BaseUnitConverter knot = new KnotConverter();

    // Constructor
    // Super takes in standard base unit and a map of all the units
    public SpeedConverter() {
        super("Meter / Second", new HashMap<String, BaseUnitConverter>() {
            {
                 put(meterSecondConverter.getName(), meterSecondConverter);
                put(milesHourConverter.getName(), milesHourConverter);
                put(knot.getName(), knot);
            }
        });
    }

    // Displays on options
    @Override
    public String getUnitType() {
        return "Speed";
    }



}
