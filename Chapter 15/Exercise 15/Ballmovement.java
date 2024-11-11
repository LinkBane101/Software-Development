package Demo;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
// import javafx.scene.paint.Color;
// import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.event.EventHandler;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.geometry.Pos;
// import javafx.geometry.Insets;
//import javafx.scene.layout.Pane;
// import javafx.scene.control.Label;
// import javafx.scene.layout.StackPane;
// import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //Override the start method in the Application class
    public void start(Stage primaryStage) {

        double radius = 20;
        double x = radius, y = radius;
        //double dx = 1, dy = 1;
        Circle circle = new Circle(150, 125, radius);
        BallPane ballPane = new BallPane();
    circle.setFill(Color.GREEN); //set ball color
    ballPane.getChildren().add(circle); // place ball into pane


    // circle.setLayoutX(150);
    // circle.setLayoutY(125);
        Button upButton = new Button("UP");
        upButton.setOnMousePressed(e -> {
            circle.setCenterY(circle.getCenterY() > 20 ? circle.getCenterY() - 10 : 25);
        });
        Button downButton = new Button("DOWN");
        downButton.setOnMousePressed(e -> {
            circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY() < 230 ? circle.getCenterY() + 10 : circle.getCenterY());
        });
        Button leftButton = new Button("LEFT");
        leftButton.setOnMousePressed(e -> {
            circle.setCenterX(circle.getCenterX() > 20 ? circle.getCenterX() - 10 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
        });
        Button rightButton = new Button("RIGHT");
        rightButton.setOnMousePressed(e -> {
            circle.setCenterX(circle.getCenterX() < 280 ? circle.getCenterX() + 10 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
        });
        
        downButton.setLayoutX(0);
        downButton.setLayoutY(200);
        upButton.setLayoutX(50);
        upButton.setLayoutY(200);
        rightButton.setLayoutX(100);
        rightButton.setLayoutY(200);
        leftButton.setLayoutX(150);
        leftButton.setLayoutY(200);
        

        ballPane.getChildren().addAll(rightButton, leftButton, downButton, upButton);
        //Create a scene and place it in the Stage
        Scene scene = new Scene(ballPane, 300, 250);
        primaryStage.setTitle("BounceBallControl");
        primaryStage.setScene(scene);
        primaryStage.show();
        ballPane.requestFocus();
         
    //         if (x < radius || x > getWidth() - radius) {
    //             dx *= -1;
    //             //Change ball move direction
    //         }
    //         if (y < radius || y > getHeight() - radius) {
    //             dy *= -1;
    //             //Change ball move direction
    //         }
    //         x +=dx;
    //         y +=dy;
        }
    }