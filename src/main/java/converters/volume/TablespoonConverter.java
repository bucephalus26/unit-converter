package converters.volume;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

public class TablespoonConverter extends BaseUnitConverter {

    public TablespoonConverter(){
        this.MULTIPLIER = new BigDecimal(0.0147868);
    }

    @Override
    public String getName() {
        return "Tablespoon";
    }

}
