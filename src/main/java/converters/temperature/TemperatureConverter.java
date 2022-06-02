package converters.temperature;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.length.FootConverter;
import converters.length.MeterConverter;

import java.util.HashMap;

// Contains a list of different types of length conversions
public class TemperatureConverter extends UnitTypeConverter {

    // Conversions
    // BaseUnitConverter implemented as own type
    private static BaseUnitConverter celsiusConverter = new CelsiusConverter();
    private static BaseUnitConverter kelvinConverter = new KelvinConverter();
    private static BaseUnitConverter fahrenheitConverter = new FahrenheitConverter();

    // Constructor
    // Super takes in standard base unit and a map of all the units
    public TemperatureConverter() {
        super("Celsius", new HashMap<String, BaseUnitConverter>() {
            {
                 put(celsiusConverter.getName(), celsiusConverter);
                put(kelvinConverter.getName(), kelvinConverter);
                put(fahrenheitConverter.getName(), fahrenheitConverter);
            }
        });
    }

    // Displays on options
    @Override
    public String getUnitType() {
        return "Temperature";
    }



}
