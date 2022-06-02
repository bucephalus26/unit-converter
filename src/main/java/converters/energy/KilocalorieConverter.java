package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilocalorieConverter extends BaseUnitConverter {

    // Sets multiplier.
    public KilocalorieConverter(){
        this.MULTIPLIER = new BigDecimal(4184);
    }

    @Override
    public String getName() {
        return "Kilocalorie";
    }

}