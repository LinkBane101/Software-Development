package Demo;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HelloWorld extends Application {
   @Override //Override teh start method in the Application class
   public void start(Stage primaryStage) {
       //create pane
       Pane pane = new Pane();
       //Create a rectangle
       Rectangle rectangle = new Rectangle(0, 0, 25, 50);
       rectangle.setFill(Color.ORANGE);
       //Create a pentagon
       // Create a scene and place it in the stage
		
     // Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITESMOKE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
        Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

        PathTransition pt = new PathTransition();
        pt.setNode(rectangle);
        
       
		
		double centerX = 400 / 2, centerY = 400 / 2;
		double radius = Math.min(400, 400) * 0.4;

		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		
        int s = 5;
        // polygon.setRotate(22.5);
        
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}     


        //set transition duration
        pt.setDuration(Duration.millis(4000));
        //set path in transition
        pt.setPath(polygon);
       //Set orientation
       pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
       //set cycle count indefinite
       pt.setCycleCount(Timeline.INDEFINITE);
       //set auto revers true
       pt.setAutoReverse(true);
       //play animation
       pt.play(); //Start animation
       //pause animation
        //set node in transition
        polygon.setOnMousePressed(e -> pt.pause());
        //resume animation
        polygon.setOnMouseReleased(e -> pt.play());
        //create a scene and place it in the stage

		
		pane.getChildren().add(polygon); 
        pane.getChildren().add(rectangle);
        pt.pause();
        pt.play();
        
	}
	
	// @Override
	// public void setWidth(double width) {
	// 	super.setWidth(width);
	// 	paint();
	// }
	
	// @Override
	// public void setHeight(double height) {
	// 	super.setHeight(height);
	// 	paint();

    //     //Set text
 
    public static void main(String[] args) {
        launch(args);
    }

    }

//        class MyPolygon extends StackPane {
//         private void paint() {
       
// }
