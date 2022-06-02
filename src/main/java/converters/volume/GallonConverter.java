package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class GallonConverter extends BaseUnitConverter {

    public GallonConverter(){
        this.MULTIPLIER = new BigDecimal(3.785);
    }

    @Override
    public String getName() {
        return "Gallon";
    }

}
