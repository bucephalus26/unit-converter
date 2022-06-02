package converters.weight;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.energy.GramcalorieConverter;
import converters.length.FootConverter;
import converters.length.MeterConverter;

import java.util.HashMap;

// Contains a list of different types of length conversions
public class WeightConverter extends UnitTypeConverter {

    // Conversions
    // BaseUnitConverter implemented as own type
    private static BaseUnitConverter kilogramConverter = new KilogramConverter();
    private static BaseUnitConverter gramConverter = new GramConverter();
    private static BaseUnitConverter milligramConverter = new MilligramConverter();
    private static BaseUnitConverter poundConverter = new PoundConverter();
    private static BaseUnitConverter ounceConverter = new OunceConverter();
    private static BaseUnitConverter metricTonConverter = new MetricTonConverter();

    // Constructor
    // Super takes in standard base unit and a map of all the units
    public WeightConverter() {
        super("Kilogram", new HashMap<String, BaseUnitConverter>() {
            {
                 put(kilogramConverter.getName(), kilogramConverter);
                put(gramConverter.getName(), gramConverter);
                put(milligramConverter.getName(), milligramConverter);
                put(poundConverter.getName(), poundConverter);
                put(ounceConverter.getName(), ounceConverter);
                put(metricTonConverter.getName(), metricTonConverter);
            }
        });
    }

    // Displays on options
    @Override
    public String getUnitType() {
        return "Weight";
    }



}
