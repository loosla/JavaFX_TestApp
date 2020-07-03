package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Control;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

import java.util.List;

public class SearchUI {
    private TextField textArea;
    private Button buttonSubmit;
    private HBox hbox;

    public SearchUI() {
        this.hbox = new HBox();
        this.textArea = new TextField("Search");
        this.buttonSubmit = new Button();

        this.hbox.setPadding(new Insets(100, 12, 15, 110));
        this.hbox.setSpacing(10);
        this.textArea.setMaxWidth(200);
        this.buttonSubmit.setText("Submit");
    }

    public void addActions () {
        actionSearchButton(this.buttonSubmit, this.textArea);
        actionOnTextField(this.textArea);
    }

    public TextField getTextArea () {
        return this.textArea;
    }

    public Button getButton () {
        return this.buttonSubmit;
    }

    public HBox getHBox () {
        return this.hbox;
    }

    public void setBox (HBox hbox) {
        this.hbox = hbox;
    }

    public HBox alignPageElements () {
        this.hbox.getChildren().addAll(this.textArea, this.buttonSubmit);
        return this.hbox;
    }

    public void addPageElement (Control elem) {
        this.hbox.getChildren().addAll(elem);
    }

    public void actionSearchButton (Button button, TextField text) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(text.getText());
                Record record = new Record();
                List list = record.generateTestList();

                System.out.println("Record #0: ");
                System.out.println(list.get(0).toString());
                System.out.println("Label: ");

            }
        });
    }

    public void actionOnTextField (TextField text) {
        text.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                text.setText("");
            }
        });
    }

}
