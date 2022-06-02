package converters;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


 // This abstract class represents each type of unit conversions - length, volume, speed, temperature...

public abstract class UnitTypeConverter {

    // Represents the standard base unit for each Unit Type
    private String standardBaseUnit;

    // HashMap of all the conversions within the unit type
    private Map<String, BaseUnitConverter> baseUnitConverters= new HashMap<>();

    // Returns a Map of all conversions
    public Map<String, BaseUnitConverter> getBaseUnitConvertersMap(){
        return baseUnitConverters;
    }

    // returns a list of all possible conversions for option selection
    public List<BaseUnitConverter> getBaseUnitConverterslist(){
        return new ArrayList<BaseUnitConverter>(baseUnitConverters.values());
    }

    // Returns name of unit type
    public abstract String getUnitType();

    // Constructor. Accepts and assigns the standard base unit, and a map of all conversions within unit type
    protected UnitTypeConverter(String standardBaseUnit, Map<String, BaseUnitConverter> baseUnitConverters){
        this.standardBaseUnit = standardBaseUnit;
        this.baseUnitConverters = baseUnitConverters;
    }

    // Converts between units.
    public BigDecimal convert(BigDecimal value, BaseUnitConverter from, BaseUnitConverter to){

        // If converting to same unit, return original value. No need to convert. Return value as is.
        if(from.getName().equals(to.getName())){
            return value.setScale(4, RoundingMode.HALF_UP);

        // If converting from standardised base unit, we only need one conversion
        } else if (from.getName().equals(standardBaseUnit)){
            BigDecimal fromBase = baseUnitConverters.get(to.getName()).convertFromBase(value);
            return fromBase.setScale(4, RoundingMode.HALF_UP);
        }

        // If we are not converting from out base unit...
        else {
            // Then first convert to our base unit.
            BigDecimal base = baseUnitConverters.get(from.getName()).convertToBase(value);

            // If we are converting to our base unit, we can just return this value
            if(to.getName().equals(standardBaseUnit)){
                return base.setScale(4, RoundingMode.HALF_UP);

            // Else, we need to convert from our base unit to unit we are converting to
            } else {
                BigDecimal fromBase = baseUnitConverters.get(to.getName()).convertFromBase(value);
                return fromBase.setScale(4, RoundingMode.HALF_UP);
            }
        }
    }

}
