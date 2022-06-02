package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MilliliterConverter extends BaseUnitConverter {

    public MilliliterConverter(){
        this.MULTIPLIER = new BigDecimal(0.001);
    }

    @Override
    public String getName() {
        return "Milliliter";
    }

}
