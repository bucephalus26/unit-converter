package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class FluidOunceConverter extends BaseUnitConverter {

    public FluidOunceConverter(){
        this.MULTIPLIER = new BigDecimal(0.0295735);
    }

    @Override
    public String getName() {
        return "Fluid Ounce";
    }

}
