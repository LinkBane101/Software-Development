
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
    
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 450, 200);
        HBox paneForRadioButtons = new HBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("BLack");
        Text text = new Text("Programming is Fun!");
        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbOrange, rbYellow, rbBlack);
        pane.setTop(paneForRadioButtons);
        Pane textPane = new Pane();
        textPane.getChildren().add(text);
        text.setLayoutX(100);
        text.setLayoutY(100);
        pane.setCenter(textPane);
        HBox paneForButtons = new HBox(20);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        btLeft.setOnAction(e -> {
            if(text.getLayoutX() < 5){
                // do nothing
            } else {
                text.setLayoutX(text.getLayoutX() - 5);
            }
        });
        btRight.setOnAction(e -> {
            text.setX(text.getX() < 220 ? text.getX() + 10 : text.getX());
            text.setX(text.getX());
        });
        paneForButtons.getChildren().addAll(btLeft,btRight);
        pane.setBottom(paneForButtons);
        //System.out.println(paneForRadioButtons + " " + paneForButtons);
        //group radio buttons
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        //handle radio Button
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });
        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });
        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });
        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });
        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });
        if (text.getX() > 20)


        //Create a scene and place it in the stage
        
        primaryStage.setTitle("ButtonDemo"); //Set the stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display Stage
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
