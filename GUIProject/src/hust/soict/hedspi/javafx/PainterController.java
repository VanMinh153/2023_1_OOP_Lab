package hust.soict.hedspi.javafx;


import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author quyetdaika
 */
public class PainterController{
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private VBox painterVbox;
    
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }
    
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }

}
