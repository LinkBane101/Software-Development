package Demo;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class BallPane extends Pane{
public final double radius = 20;
private double x = radius, y = radius;
//private double dx = 1, dy = 1;
private Circle circle = new Circle(x, y, radius);
private Timeline animation;


public BallPane() {
    circle.setFill(Color.WHITE); //set ball color
    //getChildren().add(circle); // place ball into pane
    //Create an animation for moving the ball
    // animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
    // animation.setCycleCount(Timeline.INDEFINITE);
    // animation.play();
    //ballPane.getChildren().add(ballPane);
        //Create a scene and place it in the Stage


    circle.setLayoutX(150);
    circle.setLayoutY(125);
}
//     protected void moveBall() {
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
// }
}