package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MillimeterConverter extends BaseUnitConverter {

    public MillimeterConverter(){
        this.MULTIPLIER = new BigDecimal(.001);
    }

    @Override
    public String getName() {
        return "Millimeter";
    }

}
