package converters.energy;

import converters.BaseUnitConverter;

import java.math.BigDecimal;

// Joule class - standardised base unit for energy
public class JouleConverter extends BaseUnitConverter {

        // Sets multiplier. Joule is the standardised unit of energy, so its multiplier is 1
        public JouleConverter(){
            this.MULTIPLIER = new BigDecimal(1);
        }

        @Override
        public String getName() {
            return "Joule";
        }

}


