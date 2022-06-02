package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// British thermal unit class
public class BritishThermalUnitConverter extends BaseUnitConverter {

    // Sets multiplier.
    public BritishThermalUnitConverter(){
        this.MULTIPLIER = new BigDecimal(1055.06);
    }

    @Override
    public String getName() {
        return "British Thermal Unit";
    }

}