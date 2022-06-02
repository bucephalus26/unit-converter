package converters;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** This abstract class represents each unit.
 Each UnitType will only know how to convert to one standardised unit. For example, for length types,
 the standardised unit is meter.
 **/

public abstract class BaseUnitConverter {

    // Multiplier - conversion rate to get to and from standardised base unit
    // BigDecimal for precision
    protected BigDecimal MULTIPLIER;


    // Name of type
    public abstract String getName();

    // Methods to convert to standardised type. Accepts BigDecimal. Scale up to 4 decimal places.

    // Returns the BigDecimal multiplied by conversion rate
    public BigDecimal convertToBase(BigDecimal value) {
        return value.multiply(MULTIPLIER).setScale(4, RoundingMode.HALF_UP);
    }

    //Methods to convert from standardised type
    public BigDecimal convertFromBase(BigDecimal value) {
        return value.divide(MULTIPLIER, 4, RoundingMode.HALF_UP);
    }




}
