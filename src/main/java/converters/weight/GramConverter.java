package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class GramConverter extends BaseUnitConverter {

    // Sets multiplier.
    public GramConverter(){
        this.MULTIPLIER = new BigDecimal(0.001);
    }

    @Override
    public String getName() {
        return "Gram";
    }

}
