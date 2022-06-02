package com.unitconverter;


import converters.BaseUnitConverter;
import converters.UnitTypeConverter;
import converters.energy.EnergyConverter;
import converters.length.LengthConverter;
import converters.speed.SpeedConverter;
import converters.temperature.TemperatureConverter;
import converters.volume.VolumeConverter;
import converters.weight.WeightConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.StringConverter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Controller {


    // Stores UnitTypes
    @FXML
    private ComboBox<UnitTypeConverter> unitTypeMenu;
    @FXML
    private TextField leftTextField;
    @FXML
    private TextField rightTextField;

    // Stores base units
    @FXML
    private ComboBox<BaseUnitConverter> leftUnitMenu;
    @FXML
    private ComboBox<BaseUnitConverter> rightUnitMenu;

    // List of the UnitTypes
    private List<UnitTypeConverter> allUnitTypeConverters = Arrays.asList(
            new LengthConverter(),
            new VolumeConverter(),
            new EnergyConverter(),
            new WeightConverter(),
            new SpeedConverter(),
            new TemperatureConverter()
    );

    @FXML
    public void initialize() {
        // Adds UnitTypes to ComboBox
        unitTypeMenu.getItems().addAll(allUnitTypeConverters);
        unitTypeMenu.getSelectionModel().selectFirst();

        // Converts list to a string for display
        unitTypeMenu.setConverter(new StringConverter<UnitTypeConverter>() {

            // Returns name of unit types
            @Override
            public String toString(UnitTypeConverter converter) {
                return converter.getUnitType();
            }

            @Override
            public UnitTypeConverter fromString(String arg0) {
                return null;
            }
        });


        // Retrieves list of base unit converters for unit type selected, adds to menu
        List<BaseUnitConverter> baseUnitConverters = unitTypeMenu.getValue().getBaseUnitConverterslist();
        leftUnitMenu.getItems().addAll(baseUnitConverters);
        rightUnitMenu.getItems().addAll(baseUnitConverters);

        // Selects first for display on left, second for right
        leftUnitMenu.getSelectionModel().select(0);
        rightUnitMenu.getSelectionModel().select(1);

        // Converts list to a string for display
        StringConverter <BaseUnitConverter> baseUnitStringConverter = new StringConverter<BaseUnitConverter>() {
            @Override
            public String toString(BaseUnitConverter converter) {
                // If null return null, else return converter
                return converter == null? null : converter.getName();
            }

            @Override
            public BaseUnitConverter fromString(String arg0) {
                return null;
            }

        };

        leftUnitMenu.setConverter(baseUnitStringConverter);
        rightUnitMenu.setConverter(baseUnitStringConverter);

    }

    // Method for changing unitTypes
    public void onUnitTypeChange(ActionEvent e){
        ObservableList<BaseUnitConverter> newBaseConverters = FXCollections.observableArrayList(unitTypeMenu.getValue().getBaseUnitConverterslist());

        // Fields are made blank
        leftTextField.setText("");
        rightTextField.setText("");

        leftUnitMenu.setItems(newBaseConverters);
        rightUnitMenu.setItems(newBaseConverters);

        leftUnitMenu.getSelectionModel().select(0);
        rightUnitMenu.getSelectionModel().select(1);
    }

    public void onLeftUnitMenuChange(ActionEvent e){
        convertRightToLeft();
    }

    public void onRightUnitMenuChange(ActionEvent e){
        convertLeftToRight();
    }

    public void onLeftTextFieldChange(KeyEvent e){
        convertLeftToRight();
    }

    public void onRightTextFieldChange(KeyEvent e){
        convertRightToLeft();
    }


    // Conversions of both sides of text fields
    private void convertLeftToRight(){
        // Empty if number is removed
        if(leftTextField.getText().isBlank()){
            rightTextField.setText("");
        } else {

            // Find out what UnitType is being worked with
            UnitTypeConverter unitConverter = unitTypeMenu.getValue();
            BigDecimal leftUnit = new BigDecimal(Double.parseDouble(leftTextField.getText()));
            BigDecimal rightUnit = unitConverter.convert(leftUnit, leftUnitMenu.getValue(), rightUnitMenu.getValue());
            rightTextField.setText(rightUnit.stripTrailingZeros().toPlainString());
        }
    }

    private void convertRightToLeft(){
        if(rightTextField.getText().isBlank()){
            leftTextField.setText("");
        } else {
            UnitTypeConverter unitConverter = unitTypeMenu.getValue();
            BigDecimal rightUnit = new BigDecimal(Double.parseDouble(rightTextField.getText()));
            BigDecimal leftUnit = unitConverter.convert(rightUnit, rightUnitMenu.getValue(), leftUnitMenu.getValue());
            leftTextField.setText(leftUnit.stripTrailingZeros().toPlainString());
        }
    }

}
