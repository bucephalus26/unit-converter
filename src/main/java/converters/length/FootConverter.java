package converters.length;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class FootConverter extends BaseUnitConverter {

    // Converting from foot to meter or from meter to foot, the multiplier is 0.3048
    public FootConverter(){
        this.MULTIPLIER = new BigDecimal(0.3048);
    }

    @Override
    public String getName() {
        return "Foot";
    }

}
