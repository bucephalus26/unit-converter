package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Kilogram class
public class KilogramConverter extends BaseUnitConverter {

    // Sets multiplier. Kilogram is the standardised unit of weight, so its multiplier is 1
    public KilogramConverter(){
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Kilogram";
    }

}
