
package fahrtenbuch;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Datumsanzeige für die Hauptansicht
public class DatePick extends Application {
    
    

    @Override
    public void start(Stage dateStage) throws Exception {
       DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.of(2018, 8, 24));
        datePicker.setShowWeekNumbers(true);
 
        FlowPane bums = new FlowPane();
        bums.getChildren().add(datePicker);
        bums.setPadding(Insets.EMPTY);
 
        dateStage.setTitle("Datumsanzeige");
        Scene scene = new Scene(bums, 300, 200);
        dateStage.setScene(scene);
        dateStage.show(); 
    }
/*
    private void setValue(LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setShowWeekNumbers(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
  public static void main(String[] args) {
        Application.launch(args);
    }
    
}




/*
public class DatePickerDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.of(2016, 7, 25));
        datePicker.setShowWeekNumbers(true);
 
        FlowPane root = new FlowPane();
        root.getChildren().add(datePicker);
        root.setPadding(new Insets(10));
 
        stage.setTitle("DatePicker (o7planning.org)");
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
*/