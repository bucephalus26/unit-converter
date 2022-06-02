package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class WattHourConverter extends BaseUnitConverter {

    // Sets multiplier.
    public WattHourConverter(){
        this.MULTIPLIER = new BigDecimal(3600);
    }

    @Override
    public String getName() {
        return "Watt Hour";
    }

}