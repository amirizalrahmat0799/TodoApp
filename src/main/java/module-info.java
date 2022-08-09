module com.mizal.todoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.mizal.todoapp to javafx.fxml;
    exports com.mizal.todoapp;
}