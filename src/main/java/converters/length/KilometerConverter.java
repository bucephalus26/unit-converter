package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KilometerConverter extends BaseUnitConverter {


    public KilometerConverter(){
        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Kilometer";
    }

}
