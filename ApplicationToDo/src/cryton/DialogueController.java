package cryton;

import cryton.datamodel.ToDoData;
import cryton.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogueController {
    @FXML
    private TextField shortDescriptionDialog;

    @FXML
    private TextArea fullDescriptionDialog;

    @FXML
    private DatePicker dateDialog;

    public ToDoItem processResults(){
        String shortDescription = shortDescriptionDialog.getText().trim();
        String fullDescription = fullDescriptionDialog.getText().trim();
        LocalDate date = dateDialog.getValue();

        ToDoItem temp = new ToDoItem(shortDescription, fullDescription, date);
        ToDoData.getInstance().addTodoItem(temp);
        return temp;
    }
}
