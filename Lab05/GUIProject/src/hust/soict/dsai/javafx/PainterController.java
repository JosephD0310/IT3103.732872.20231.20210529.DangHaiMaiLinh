package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    
    @FXML
    private RadioButton pen;
    
    @FXML
    private RadioButton eraser;
    
    @FXML
    void toolSelection() {
    	if (pen.isSelected()) {
    		drawingAreaPane.setOnMouseDragged(event -> drawingAreaMouseDrag(event, Color.BLACK));
    	}
    	else if (eraser.isSelected()) {
    		drawingAreaPane.setOnMouseDragged(event -> drawingAreaMouseDrag(event, Color.WHITE));
    	}
    }

    private void drawingAreaMouseDrag(MouseEvent event, Color color) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, color);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
}
