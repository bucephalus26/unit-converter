package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Kilojoule class
public class KilojouleConverter extends BaseUnitConverter {

        // Sets multiplier.
        public KilojouleConverter(){
            this.MULTIPLIER = new BigDecimal(1000);
        }

        @Override
        public String getName() {
            return "Kilojoule";
        }

}


