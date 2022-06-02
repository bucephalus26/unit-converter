package converters.temperature;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Celsius class
public class CelsiusConverter extends BaseUnitConverter {

    // Sets multiplier. Celsius is the standardised unit of length, so its multiplier is 1
    public CelsiusConverter(){
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Celsius";
    }

}
