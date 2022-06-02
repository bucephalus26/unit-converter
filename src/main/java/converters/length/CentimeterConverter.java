package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class CentimeterConverter extends BaseUnitConverter {


    public CentimeterConverter(){
        this.MULTIPLIER = new BigDecimal(.01);
    }

    @Override
    public String getName() {
        return "Centimeter";
    }

}
