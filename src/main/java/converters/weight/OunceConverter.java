package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class OunceConverter extends BaseUnitConverter {

    // Sets multiplier.
    public OunceConverter(){
        this.MULTIPLIER = new BigDecimal(0.0283495);
    }

    @Override
    public String getName() {
        return "Ounce";
    }

}
