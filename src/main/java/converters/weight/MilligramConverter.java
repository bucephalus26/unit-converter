package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class MilligramConverter extends BaseUnitConverter {

    // Sets multiplier.
    public MilligramConverter(){
        this.MULTIPLIER = new BigDecimal(0.000001);
    }

    @Override
    public String getName() {
        return "Milligram";
    }

}
