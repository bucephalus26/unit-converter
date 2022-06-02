package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class PintConverter extends BaseUnitConverter {

    public PintConverter(){
        this.MULTIPLIER = new BigDecimal(0.473176);
    }

    @Override
    public String getName() {
        return "Pint";
    }

}
