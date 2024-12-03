package Demo;
import java.util.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 public class DungeonMasterGuide extends Application{
    @Override
        public void start(Stage primaryStage) {   
            // Create a scene and place it in the stage
            BorderPane pane = new BorderPane();
            HBox paneForRadioButtons = new HBox(20);
            paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
            paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: black");
            Text text = new Text("Welcome fearless Dungeon Master! \nTo your helpful guide!");
            // pane.setTop(paneForRadioButtons);
            //Pane textPane = new Pane();
            pane.setCenter(text);
            text.setLayoutX(100);
            text.setLayoutY(100);
            
			RadioButton rbNPC = new RadioButton("Naming NPC");
			RadioButton rbEncounter = new RadioButton("Wilderness Encounter");
			RadioButton rbCR = new RadioButton("Challenge Rating");
			ToggleGroup group = new ToggleGroup();
			rbNPC.setToggleGroup(group);
			rbEncounter.setToggleGroup(group);
			rbCR.setToggleGroup(group);
			paneForRadioButtons.getChildren().addAll(rbNPC, rbEncounter, rbCR);
			pane.setBottom(paneForRadioButtons);
			rbNPC.setToggleGroup(group);
			rbEncounter.setToggleGroup(group);
			rbCR.setToggleGroup(group);
			// pane.setCenter(textPane);
            Scene scene = new Scene(pane, 500, 250);
        
        

            primaryStage.setTitle("Dungeon Master Help guide"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage
            //creating the place to direct
            characterName character = new characterName();
            // Tundra tundra = new Tundra();

            //Choosing where to go
            rbNPC.setOnAction(e -> {
            if (rbNPC.isSelected()) {
                character.raceName(primaryStage);
            }
        });
		rbEncounter.setOnAction(e -> {
            if (rbEncounter.isSelected()) {
				Tundra tundra = new Tundra();
				tundra.displayEncounters(primaryStage);
            }
        });
	
	}
			

        
	public static void main(String[] args) {
		launch(args);
		// System.out.println("Welcome fearless Dungeon Master! To your helpful guide!");
		// System.out.println("Press 0 for NPC Naming");
		// System.out.println("Press 1 for Wilderness encounter");
		// System.out.println("Press 2 for calculating challenge rating");
		// System.out.print("Pick your poison: ");
    }
       


		
	
	
	public static void challenge() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many players are there: ");
		int player = input.nextInt();
		double total1 = 0;
		double total2 = 0;
		//takes the total level of each player, totals it up, and then averages it.
		for (int i = 0; i < player; i++){
			System.out.print("Input a character's level: ");
			double level = input.nextInt();
			total1 = total1 + level;}
		double average = total1 / player;
		System.out.print("How many monsters are there: ");
		double monster = input.nextInt();
	//takes each challenge rating (CR) and totals it up
		for (int i = 0; i < monster; i++){
			System.out.print("Input the monster's CR: ");
			double cr = input.nextInt();
			total2 = total2 + cr;}
		int result = (int) ((average / total2) * 10);
		System.out.println(result);
		if (result <= 4)
			System.out.println("Deadly");
		 else if(result < 8 && result > 4){
			System.out.println("Hard");}
		 else if(result >= 8 && result <= 12){
			System.out.println("Medium");}
			else if(result > 12){
			System.out.println("Easy");}
		return;
	}
}