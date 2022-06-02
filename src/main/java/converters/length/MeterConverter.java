package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Meter class
public class MeterConverter extends BaseUnitConverter {

    // Sets multiplier. Meter is the standardised unit of length, so its multiplier is 1
    public MeterConverter(){
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Meter";
    }

}
