package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class QuartConverter extends BaseUnitConverter {

    public QuartConverter(){
        this.MULTIPLIER = new BigDecimal(0.946353);
    }

    @Override
    public String getName() {
        return "Quart";
    }

}
