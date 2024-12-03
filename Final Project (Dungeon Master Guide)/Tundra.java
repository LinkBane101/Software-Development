package Demo;

import java.util.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Tundra extends DungeonMasterGuide {
    Tundra() {
    }

    // Helper method: Generate encounter times
    private List<String> encounterTimes() {
        List<String> encounterTimes = new ArrayList<>();
        String[] time = {
            "One encounter in the morning (dawn to noon)",
            "One encounter in the afternoon (noon to dusk)",
            "One encounter in the evening (dusk to midnight)",
            "One encounter at night (midnight to morning)"
        };
        int numEncounters = (int) (Math.random() * 2) + 1; // 1 or 2 encounters
        for (int i = 0; i < numEncounters; i++) {
            int event = (int) (Math.random() * time.length);
            encounterTimes.add(time[event]);
        }
        return encounterTimes;
    }

    // Helper method: Generate blizzard info
    private List<String> generateBlizzardInfo() {
        List<String> blizzardInfo = new ArrayList<>();
        int blizzard = (int) (Math.random() * 20 + 2);
        int wildernessLevel = (int) (Math.random() * 8 + 1);
        if (blizzard >= wildernessLevel) {
            int snowStart = (int) (Math.random() * 4 + 1);
            int snowEnd = (int) (Math.random() * 4 + 1);
            blizzardInfo.add("Blizzard starts " + snowStart + " hour(s) before the encounter.");
            blizzardInfo.add("Blizzard ends " + snowEnd + " hour(s) after the encounter.");
        } else {
            blizzardInfo.add("No blizzard.");
        }
        return blizzardInfo;
    }


    // Helper method: Generate encounter details
    private List<String> generateEncounter() {
        List<String> encounterDetails = new ArrayList<>();
        String[] wildernessEncounters = {
            "Yeti", "Goliath werebear", "Crag cats", "Coldlight walker",
            "Ice troll", "Frost Druid and friends (Medium)", "Chardalyn berserkers",
            "Frost giant riding a mammoth", "Battlehammer dwarves", "Arveiaturace (ancient white dragon)", 
            "Snowy owlbear (Easy)", "Gnolls (Medium)", "Orcs of the Many-Arrows tribe (Hard)", 
            "Goliath party of 4 (Medium)", "Chwinga (Easy)", "Awakened beast (Easy)", 
            "Icewind Kobolds (Easy)", "Humans (Easy)", "Perytons (Medium)"
        };

         int encounterIndex = (int) (Math.random() * wildernessEncounters.length);
        String selectedEncounter = wildernessEncounters[encounterIndex];
        encounterDetails.add("Encounter: " + selectedEncounter);

//Add specific detail for certain encounters
if (selectedEncounter.equals("Awakened beast (Easy)")){
        String[] awakenedBeast = { 
            "Polar bear", "Arctic fox", "SnowShoe hare", "Snow owl", 
            "Reindeer (Use Elk stat block) with glow-in-the-dark antlers", 
            "Woolly Rhinoceros", "Saber-toothed tiger", "Wolf"
        };
        //Awakened Beast
        int beastIndex = (int) (Math.random() * awakenedBeast.length);
        encounterDetails.add("Awakened Beast: " + awakenedBeast[beastIndex]);
    }
    else if (selectedEncounter.equals("Frost Druid and friends (Medium)")){

        String[] frostDruidFriends = {
            "Awakened tree (Coniferous only)", "Awakened Mountain goat", 
            "Awakened reindeer with glow-in-the-dark antlers", "Awakened walrus"
        };

        //Frost Druid and Friends
    int numFriends = (int) (Math.random() * 4) + 1;
    encounterDetails.add("The Frost Druid is accompanied by: \n");
    for (int i = 0; i < numFriends; i++) {
        int friendIndex = (int) (Math.random() * frostDruidFriends.length);
        encounterDetails.add("- " + frostDruidFriends[friendIndex]);
    }}
else if (selectedEncounter.equals("Goliath party of 4 (Medium)")) {
        String[] goliathChallenges = {"Tug o' War", "Hand Standing", "Shrub pulling", 
        "Boulder Roll"};
        //Goliath Party of 4
        int challengeIndex = (int) (Math.random() * goliathChallenges.length);
        encounterDetails.add("The Goliath party issues a challenge: " + 
        goliathChallenges[challengeIndex]);
}
else if (selectedEncounter.equals("Herd of beasts (Easy)")) {
encounterDetails.add("The herd includes a mix of reindeer, elk, and mammoths.");
}
    else if (selectedEncounter.equals("Yeti")) {
        //Yeti
        int yetiType = (int) (Math.random() * 6);
        if (yetiType < 3) {
            int totalYetis = (int) (Math.random() * 4) + 1;
            encounterDetails.add("There are " + totalYetis + " Yetis.");
        }
        else if (yetiType < 5) {
            encounterDetails.add("It's an Abominable Yeti (Hard).");
        }
        else{
            encounterDetails.add("It's just a Yeti Tyke (Easy)");
        }
    }
    //return final encounter details
    return encounterDetails;
}
    // Main method to display all information
    public void displayEncounters(Stage primaryStage) {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Generate results
        List<String> encounterTimes = encounterTimes();
        List<String> blizzardInfo = generateBlizzardInfo();
        List<String> encounterDetails = generateEncounter();

        // Add results to layout
        layout.getChildren().add(new Text("Encounter Times:"));
        for (String time : encounterTimes) {
            layout.getChildren().add(new Text("- " + time));
        }

        layout.getChildren().add(new Text("\nBlizzard Info:"));
        for (String blizzard : blizzardInfo) {
            layout.getChildren().add(new Text("- " + blizzard));
        }

        layout.getChildren().add(new Text("\nEncounter Details:"));
        layout.getChildren().add(new Text("- " + encounterDetails));


        //Back button
        Button backButton = new Button("Back to Main Menu");
        backButton.setOnAction(e -> {
            DungeonMasterGuide mainMenu = new DungeonMasterGuide();
            mainMenu.start(primaryStage);
        });
        layout.getChildren().add(backButton);

        // Display scene
        Scene scene = new Scene(layout, 600, 300);
        primaryStage.setTitle("Tundra Encounters");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
