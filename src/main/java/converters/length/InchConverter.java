package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class InchConverter extends BaseUnitConverter {


    public InchConverter(){
        this.MULTIPLIER = new BigDecimal(0.0254);
    }

    @Override
    public String getName() {
        return "Inch";
    }

}
