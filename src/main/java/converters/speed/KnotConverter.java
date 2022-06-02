package converters.speed;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class KnotConverter extends BaseUnitConverter {

    // Sets multiplier.
    public KnotConverter(){
        this.MULTIPLIER = new BigDecimal(0.514444);
    }

    @Override
    public String getName() {
        return "Knot";
    }

}
