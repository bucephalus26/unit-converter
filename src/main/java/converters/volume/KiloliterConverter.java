package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class KiloliterConverter extends BaseUnitConverter {

    public KiloliterConverter(){
        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Kiloliter";
    }

}
