package Demo;
import java.io.File;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
 
public class HelloWorld extends Application {
    public Timeline animation;
   
    public Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
    
    public MediaPlayer mediaPlayer = new MediaPlayer(media);
    @Override
    public void start(Stage primaryStage) {
        TextField count = new TextField();
        // BorderPane pane = new BorderPane();
        StackPane pane = new StackPane(count);
        // Scene scene = new Scene(pane, 450, 200);
        
        //Text fields
        Text text = new Text();
        count.setAlignment(Pos.CENTER);
        count.setFont(Font.font(60));
        count.setPrefColumnCount(4);
        
        //Set to loop
        //mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        
        //Show text
        Pane textPane = new Pane();
        textPane.getChildren().add(text);
        text.setLayoutX(100);
        text.setLayoutY(100);
        
        //animation timeline
        animation = new Timeline(
			new KeyFrame(Duration.millis(1000), e -> {
                if (Integer.parseInt(count.getText()) > 0) {
                    mediaPlayer.pause();
                    mediaPlayer.seek(Duration.ZERO);
                    count.setText(String.valueOf(
                        Integer.parseInt(count.getText()) - 1));
                }
                if (count.getText().equals("0")) {
                    animation.pause();
                    mediaPlayer.play();
                }
            }));
		    animation.setCycleCount(Timeline.INDEFINITE);

		count.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				animation.play();
			}
		});


        // paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        // paneForTextField.setStyle("-fx-border-color: green");
        // paneForTextField.setLeft(new Label());
        // TextField tf = new TextField();
        // tf.setAlignment(Pos.BOTTOM_RIGHT);
        // paneForTextField.setCenter(tf);
        // pane.setTop(paneForTextField);
        // tf.setOnAction(e -> text.setText(tf.getText()));
        // Pane textPane = new Pane();
        // textPane.getChildren().add(text);
        // text.setLayoutX(100);
        // text.setLayoutY(100);
        // pane.setCenter(textPane);
        
        //Create a scene
        Scene scene = new Scene(pane);
		primaryStage.setTitle("CountDown"); // Set the Stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
    }
    // private void run() {
	// 	if (Integer.parseInt(count.getText()) > 0) {
	// 		mediaPlayer.pause();
	// 		mediaPlayer.seek(Duration.ZERO);
	// 		count.setText(String.valueOf(
	// 			Integer.parseInt(count.getText()) - 1));
	// 	}
	// 	if (count.getText().equals("0")) {
	// 		animation.pause();
	// 		mediaPlayer.play();
	// 	}
	// }

    public static void main(String[] args) {
        launch(args);
    }
}