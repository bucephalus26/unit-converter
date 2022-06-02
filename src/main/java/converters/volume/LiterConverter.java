package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class LiterConverter extends BaseUnitConverter {

    public LiterConverter(){
        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Liter";
    }

}
