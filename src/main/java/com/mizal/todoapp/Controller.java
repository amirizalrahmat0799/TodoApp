package com.mizal.todoapp;

import com.mizal.todoapp.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card",
                "buy a 30th birthday card for john",
                LocalDate.of(2022, Month.DECEMBER, 30));
        TodoItem item2 = new TodoItem("Doctor appointment",
                "See doctor smith at 123 elm street",
                LocalDate.of(2022, Month.DECEMBER, 14));
        TodoItem item3 = new TodoItem("Finish java course",
                "to get a job eh ese",
                LocalDate.of(2022, Month.DECEMBER, 1));
        TodoItem item4 = new TodoItem("Have savings",
                "for your dreams",
                LocalDate.of(2022, Month.DECEMBER, 2));
        TodoItem item5 = new TodoItem("maybe sleep",
                "take care yourself from heartbreak",
                LocalDate.of(2022, Month.DECEMBER, 31));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
//        System.out.println("The selected item is " + item);
//        StringBuilder sb = new StringBuilder();
//        sb.append(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());



    }
}