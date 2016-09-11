package sample;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by vladislav on 11.09.16.
 */
public class MainForm extends Group {
    private NumberTextField aParamNumberField;
    private NumberTextField r0Param;
    private NumberTextField mParam;
    private NumberTextField queLength;
    private NumberTextField cParam;
    private Button button = new Button("Submit");
    private TextArea textArea = new TextArea();
    private HBox hBox = new HBox(10);
    private VBox vBox = new VBox(10);
    private Model model;
    private Controller controller;

    public MainForm(){
        aParamNumberField = new NumberTextField();
        queLength = new NumberTextField();
        r0Param = new NumberTextField();
        mParam = new NumberTextField();
        aParamNumberField.setPromptText("a");
        r0Param.setPromptText("R0");
        mParam.setPromptText("m");
        cParam = new NumberTextField();
        cParam.setPromptText("c");
        queLength.setPromptText("Que length");
        textArea.setMinWidth(70);
        textArea.setMinHeight(100);
        textArea.setEditable(false);
        vBox.getChildren().addAll(queLength, aParamNumberField, r0Param, mParam, cParam, button);
        hBox.getChildren().addAll(vBox, textArea);
        getChildren().addAll(hBox);
        controller = new Controller(model = new Model());
        button.setOnMouseClicked(event -> {
            model.setaParamValue(aParamNumberField.getText());
            model.setQueLength(queLength.getText());
            model.setMParamValue(mParam.getText());
            model.setR0ParamValue(r0Param.getText());
            model.setCParamValue(cParam.getText());
            try {
                controller.execute();
                textArea.clear();
                for(int value:model.getValues()){
                    textArea.setText(textArea.getText()+", \n"+value);
                }
            } catch (InvalidParameterException ignored) {
            }

        });
    }
}
