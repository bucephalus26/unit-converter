package converters.speed;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Meter / Hour  class
public class MilesHourConverter extends BaseUnitConverter {

    // Sets multiplier.
    public MilesHourConverter(){
        this.MULTIPLIER = new BigDecimal(0.44704 );
    }

    @Override
    public String getName() {
        return "Meter / Hour";
    }

}
