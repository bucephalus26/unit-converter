package converters.weight;

import converters.BaseUnitConverter;

import java.math.BigDecimal;


public class MetricTonConverter extends BaseUnitConverter {

    // Sets multiplier.
    public MetricTonConverter(){
        this.MULTIPLIER = new BigDecimal(1000);
    }

    @Override
    public String getName() {
        return "Metric Ton";
    }

}
