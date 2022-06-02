package converters.speed;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Meter / Second  class
public class MeterSecondConverter extends BaseUnitConverter {

    // Sets multiplier. Meter / Second is the standardised unit of length, so its multiplier is 1
    public MeterSecondConverter(){
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Meter / Second";
    }

}
