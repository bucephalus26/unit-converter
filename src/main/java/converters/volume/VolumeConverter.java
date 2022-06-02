package converters.volume;

import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.length.FootConverter;
import converters.length.KilometerConverter;
import converters.length.MeterConverter;
import converters.length.MillimeterConverter;

import java.util.HashMap;

public class VolumeConverter extends UnitTypeConverter {

    private static BaseUnitConverter literConverter = new LiterConverter();
    private static BaseUnitConverter gallonConverter = new GallonConverter();
    private static BaseUnitConverter cupConverter = new CupConverter();
    private static BaseUnitConverter fluidOunceConverter = new FluidOunceConverter();
    private static BaseUnitConverter kilometerConverter = new KiloliterConverter();
    private static BaseUnitConverter millimeterConverter = new MilliliterConverter();
    private static BaseUnitConverter pintConverter = new PintConverter();
    private static BaseUnitConverter quartConverter = new QuartConverter();
    private static BaseUnitConverter tablespoonConverter = new TablespoonConverter();
    private static BaseUnitConverter teaspoonConverter = new TeaspoonConverter();

    public VolumeConverter() {
        super("Liter", new HashMap<String, BaseUnitConverter>() {
            {
                 put(literConverter.getName(), literConverter);
                put(gallonConverter.getName(), gallonConverter);
                put(cupConverter.getName(), cupConverter);
                put(fluidOunceConverter.getName(), fluidOunceConverter);
                put(kilometerConverter.getName(), kilometerConverter);
                put(millimeterConverter.getName(), millimeterConverter);
                put(pintConverter.getName(), pintConverter);
                put(quartConverter.getName(), quartConverter);
                put(tablespoonConverter.getName(), tablespoonConverter);
                put(teaspoonConverter.getName(), teaspoonConverter);
            }
        });
    }

    @Override
    public String getUnitType() {
        return "Volume";
    }



}
