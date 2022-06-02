package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class PoundConverter extends BaseUnitConverter {

    // Sets multiplier.
    public PoundConverter(){
        this.MULTIPLIER = new BigDecimal(0.453592);
    }

    @Override
    public String getName() {
        return "Pound";
    }

}
