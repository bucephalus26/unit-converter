package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class CupConverter extends BaseUnitConverter {

    public CupConverter(){
        this.MULTIPLIER = new BigDecimal(0.24);
    }

    @Override
    public String getName() {
        return "Cup";
    }

}
