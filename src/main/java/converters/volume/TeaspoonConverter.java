package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class TeaspoonConverter extends BaseUnitConverter {

    public TeaspoonConverter(){
        this.MULTIPLIER = new BigDecimal(0.00492892);
    }

    @Override
    public String getName() {
        return "Teaspoon";
    }

}
