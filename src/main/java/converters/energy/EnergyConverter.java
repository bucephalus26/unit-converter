package converters.energy;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.length.FootConverter;
import converters.length.MeterConverter;

import java.util.HashMap;

// Contains a list of different types of length conversions
public class EnergyConverter extends UnitTypeConverter {

    // Conversions
    // BaseUnitConverter implemented as own type
    private static BaseUnitConverter jouleConverter = new JouleConverter();
    private static BaseUnitConverter britishThermalUnitConverter = new BritishThermalUnitConverter();
    private static BaseUnitConverter gramcalorieConverter = new GramcalorieConverter();
    private static BaseUnitConverter kilojouleConverter = new KilojouleConverter();
    private static BaseUnitConverter kilocalorieConverter = new KilocalorieConverter();
    private static BaseUnitConverter wattHourConverter = new WattHourConverter();

    // Constructor
    // Super takes in standard base unit and a map of all the units
    public EnergyConverter() {
        super("Joule", new HashMap<String, BaseUnitConverter>() {
            {
                put(britishThermalUnitConverter.getName(),britishThermalUnitConverter);
                put(jouleConverter.getName(),jouleConverter);
                put(gramcalorieConverter.getName(),gramcalorieConverter);
                put(kilojouleConverter.getName(),kilojouleConverter);
                put(kilocalorieConverter.getName(),kilocalorieConverter);
                put(wattHourConverter.getName(),wattHourConverter);
            }
        });
    }

    // Displays on options
    @Override
    public String getUnitType() {
        return "Energy";
    }



}
