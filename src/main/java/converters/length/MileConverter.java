package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class MileConverter extends BaseUnitConverter {


    public MileConverter(){
        this.MULTIPLIER = new BigDecimal(1609.344);
    }

    @Override
    public String getName() {
        return "Mile";
    }

}
