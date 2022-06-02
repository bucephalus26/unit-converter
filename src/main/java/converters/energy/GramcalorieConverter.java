package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Gram calorie class
public class GramcalorieConverter extends BaseUnitConverter {

    // Sets multiplier.
    public GramcalorieConverter(){
        this.MULTIPLIER = new BigDecimal(4.184);
    }

    @Override
    public String getName() {
        return "Gram Calorie";
    }

}
