package Demo;
import java.util.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class characterName extends DungeonMasterGuide{
    //Constructor
    characterName(){
        
    }
        public void raceName(Stage primaryStage) {
    //pane for RadioButtons
    BorderPane pane = new BorderPane();
    HBox paneForRadioButtons = new HBox(20);
    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
    paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: black");
    
    //buttons for races
    RadioButton human = new RadioButton("Human");
	RadioButton elf = new RadioButton("Elf");
    RadioButton dwarf = new RadioButton("Dwarf");
    RadioButton halfling = new RadioButton("Halfling");
	RadioButton gnome = new RadioButton("Gnome");
    RadioButton dragonborn = new RadioButton("Dragonborn");
    RadioButton teifling = new RadioButton("Teifling");
   
    //Toggle group button
    ToggleGroup raceGroup = new ToggleGroup();
    human.setToggleGroup(raceGroup);
    elf.setToggleGroup(raceGroup);
    dwarf.setToggleGroup(raceGroup);
    halfling.setToggleGroup(raceGroup);
    gnome.setToggleGroup(raceGroup);
    dragonborn.setToggleGroup(raceGroup);
    teifling.setToggleGroup(raceGroup);
    paneForRadioButtons.getChildren().addAll(human, elf, dwarf, halfling, gnome, dragonborn, teifling);
			pane.setTop(paneForRadioButtons);
    
//Create pane for race and gender buttons
    HBox centerPane = new HBox(20);
    centerPane.setPadding(new Insets(10, 10, 10, 10));
    pane.setCenter(centerPane);
     
        
    //Human button
    human.setOnAction(e -> {
        {
        if (human.isSelected())
            centerPane.getChildren().clear();
            Button male = new Button("Male");
            Button female = new Button("Female");
            centerPane.getChildren().addAll(male, female);

    //Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
    //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHumanName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHumanName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
        });
    }
});

//Elf action button
    elf.setOnAction(e -> {
    {
    if (elf.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

    //Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
    //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateElfName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
    //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateElfName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});
    //Dwarf button
    dwarf.setOnAction(e -> {
    {
    if (dwarf.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateDwarfName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateDwarfName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});

//Halfing button
    halfling.setOnAction(e -> {
    {
    if (halfling.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHalflingName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHalflingName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});

//Gnome button
    halfling.setOnAction(e -> {
    {
    if (halfling.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHalflingName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateHalflingName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});

//Gnome button
    gnome.setOnAction(e -> {
    {
    if (gnome.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateGnomeName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateGnomeName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});

//Dragonborn button
    dragonborn.setOnAction(e -> {
    {
    if (dragonborn.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateDragonbornName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateDragonbornName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});

//Teifling button
    teifling.setOnAction(e -> {
    {
    if (teifling.isSelected())
        centerPane.getChildren().clear();
        Button male = new Button("Male");
        Button female = new Button("Female");
        centerPane.getChildren().addAll(male, female);

//Add action listeners to "Male" and "Female" buttons
    male.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateTeiflingName("Male");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
});
    female.setOnAction(event -> {
        //Clear centerPane and display generated name
        centerPane.getChildren().clear();
        String name = generateTeiflingName("Female");
        centerPane.getChildren().add(new Text("Your NPC name:\n" + name));
    });
}
});
    
//Back button
Button backButton = new Button("Back to Main Menu");
backButton.setOnAction(e -> {
    DungeonMasterGuide mainMenu = new DungeonMasterGuide();
    mainMenu.start(primaryStage);
});
centerPane.getChildren().add(backButton);

    //Create the scene
    Scene scene = new Scene(pane, 700, 250);
    primaryStage.setScene(scene);
}
    private String generateHumanName(String gender) {
        Random random = new Random();
         //Origin for these selected Surnames for humans come from Tehyrian/Chondathan and Illuskan    
             String humanMale [] = {"Theo", "Aeson", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Bor", "Pavel", "Sergor", "Grigor", "Fodel", "Glar", "Igan", "Kosef", "Pavel"};
             String humanFemale [] = {"Arveene", "Esvele", "Jhessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tesseie", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Thola", "Nulara", "Selise", "Immith"};
             String humanSurname [] = {"Amblecrown", "Buckman", "Dundragon", "Evenwood", "Greycastle", "Tallstag", "Brightwood", "Helder", "Hornraven", "Lackman"};
             String firstName = gender.equals("Male") ? humanMale[random.nextInt(humanMale.length)] : humanFemale[random.nextInt(humanFemale.length)];
             String surname = humanSurname[random.nextInt(humanSurname.length)];
             return firstName + " " + surname;
         }
        private String generateElfName(String gender) {
            Random random = new Random();
        //Elves use family names with meaning
            String elfMale [] = {"Adran", "Aelar", "Aramil", "Arannis", "Berrian", "Carric", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Immeral", "Ivellios", "Mindartis", "Paelias", "Peren", "Quarion", "Soveliss", "Thamior", "Theren"};
            String elfFemale [] = {"Adrie", "Althaea", "Anastrianna", "Birel", "Caelynn", "Drusilia", "Felosial", "Ielenia", "Keyleth", "Leshanna", "Lia", "Meriele", "Naivara", "Quelenna", "Sariel", "Silaqui", "Theirastra", "Thia", "Valanthe", "Xanaphia"};
            String elfFamily [] = {"Amakiir (Gemflower)", "Amastacia (Starflower)", "Galanodel (Moonwhisper)", "Holimion (Diamonddew)", "Ilphelkiir (Gemblossom)", "Liadon (Silverfrond)", "Meliamne (Oakenheel)", "Nailo (Nightbreeze)", "Siannodel (Moonbrook)", "Xiloscient (Goldpetal)"};
            String firstName = gender.equals("Male") ? elfMale[random.nextInt(elfMale.length)] : elfFemale[random.nextInt(elfFemale.length)];
            String surname = elfFamily[random.nextInt(elfFamily.length)];
            return firstName + " " + surname;        
        }
        private String generateDwarfName(String gender) {
            Random random = new Random();
         //Dwarves us clan names.
            String dwarfMale [] = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Harbek", "Kildrak", "Morgran", "Rangrim", "Taklinn", "Thorin", "Tordek", "Travok"};
            String dwarfFemale [] = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Liftrasa", "Mardred", "Torbera", "Vistra", "Riswynn", "Falkrunn"};
            String dwarfClan [] = {"Balderk", "Battlehammer", "Brawnanvil", "Dankil", "Fireforge", "Frostbeard", "Gorunn", "Holderhek", "Ironfist", "Loderr"};
            String firstName = gender.equals("Male") ? dwarfMale[random.nextInt(dwarfMale.length)] : dwarfFemale[random.nextInt(dwarfFemale.length)];
            String surname = dwarfClan[random.nextInt(dwarfClan.length)];
            return firstName + " " + surname;        
        }
        private String generateHalflingName(String gender) {
            Random random = new Random();
         //Halflings use family names
            String halflingMale [] = {"Alton", "Ander", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby", "Teret", "Zalmin", "Norwrick", "Elras"};
            String halflingFemale [] = {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna", "Jillie", "Kelalyn"};
            String halflingFamily [] = {"Brushgather", "Goodbarrell", "Greenbottle", "High-Hill", "Hilltopple", "Leagallow", "Tealeaf", "Thorngage", "Tosscobble", "Underbough"};
            String firstName = gender.equals("Male") ? halflingMale[random.nextInt(halflingMale.length)] : halflingFemale[random.nextInt(halflingFemale.length)];
            String surname = halflingFamily[random.nextInt(halflingFamily.length)];
            return firstName + " " + surname;        
        }
        private String generateGnomeName(String gender) {
            Random random = new Random();
        //Gnomes use clan names
            String gnomeMale [] = {"Alston", "Alvyn", "Boddynock", "Brocc", "Burgell", "Dimble", "Eldon", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Namfoodle", "Orryn", "Seebo", "Warryn", "Zook"};
            String gnomeFemale [] = {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket"};
            String gnomeClan [] = {"Beren", "Daergel", "Folkor", "Garrick", "Nackle", "Murnig", "Ningel", "Timbers", "Turen", "Raulnor"};
            String firstName = gender.equals("Male") ? gnomeMale[random.nextInt(gnomeMale.length)] : gnomeFemale[random.nextInt(gnomeFemale.length)];
            String surname = gnomeClan[random.nextInt(gnomeClan.length)];
            return firstName + " " + surname;        
        }
        private String generateDragonbornName(String gender) {
            Random random = new Random();
            //Dragonborn uses clan names
            String dragonbornMale [] = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Heskan", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Durnehviir", "Mirmulnir", "Vulthuryol", "Shalrid", "Odahviing"};
            String dragonbornFemale [] = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Viinturuth", "Surina", "Thava", "Nahagliiv", "Tirrhok", "Shalrid", "Ember"};
            String dragonbornClan [] = {"Clethtinthiallor", "Daardendrian", "Delmirev", "Drachedandion", "Fenkenkabradon", "Kepeshkomilik", "Kimbatuul", "Myastan", "Nemmonis", "Turnuroth"};
            String firstName = gender.equals("Male") ? dragonbornMale[random.nextInt(dragonbornMale.length)] : dragonbornFemale[random.nextInt(dragonbornFemale.length)];
            String surname = dragonbornClan[random.nextInt(dragonbornClan.length)];
            return firstName + " " + surname;        
        }
        private String generateTeiflingName(String gender) {
            Random random = new Random();
            //teiflings don't carry a last name
            String tieflingMale [] = {"Akmenos", "Amnon", "Barakas", "Damakos", "Ekemon", "Iados", "Kairon", "Leucis", "Melech", "Mordai", "Morthos", "Pelaios", "Skamos", "Therai", "Ernon", "Iamir", "Kyxes", "Shazire", "Nephus", "Amthos"};
            String tieflingFemale [] = {"Akta", "Anakis", "Bryseis", "Criella", "Damaia", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Orianna", "Phelaia", "Rieta", "Salista", "Afza", "Inkaria", "Nithza", "Riyola", "Zabis", "Natcyra"};
            String firstName = gender.equals("Male") ? tieflingMale[random.nextInt(tieflingMale.length)] : tieflingFemale[random.nextInt(tieflingFemale.length)];
            return firstName;        
        }
    
    }