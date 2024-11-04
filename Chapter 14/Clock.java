package Demo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;


public class HelloWorld extends Application {
public static void main(String[] args) {
        launch(args);
    }
    
    // @Override
    // public void start(Stage primaryStage) {
    //     Clock myClock= new Clock(1,1,1);
    //     //myClock.paintClock();
    //     primaryStage.setScene(new Scene(myClock, 300, 350));
    //     primaryStage.show();
        

        @Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a clock and a label
		Clock clock = new Clock((int)(Math.random() * 12), 
			((int)(Math.random() * 2) == 1 ? 30 : 0), 0);
		String timeString = clock.getHour() + ":" + clock.getMinute()
			+ ":" + clock.getSecond();
		clock.setSecondHandVisible(false); // Make second hand invisible
		Label time = new Label(timeString);

		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(time);
		BorderPane.setAlignment(time, Pos.TOP_CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 350); 
		primaryStage.setTitle("Exercise_14_28"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
    }
}

 class Clock extends Pane {
    private int hour;
    private int minute;
    private int second;
    private boolean secondHandVisible;
    private boolean minuteHandVisible;
    private boolean hourHandVisible;
    // Clock pane's width and height
    private double h = 350;
    private double w = 300;
    
    //Construct a clock with specified hour, minute, and second
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        hourHandVisible = minuteHandVisible = secondHandVisible = true;
		paintClock();
    }
    //Return hour
    public int getHour() {
        return hour;
    }
    //Set a new hour
    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }
    //Return minute
    public int getMinute() {
        return minute;
    }
    //Set a new minute
    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }
    //Return Second
    public int getSecond(){
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }
    /** Return clock pane's width */
	public double getW() {
		return w;
	}
/** Set clock pane's width */
public void getW(double w) {
    this.w = w;
    paintClock();
}

/** Return clock pane's height */
public double getH() {
    return h;
}

/** Set clock pane's heigt */
public void setH(double h) {
    this.h = h;
    paintClock();
}


public boolean isHourHandVisible() {
    return hourHandVisible;
}

public void setHourHandVisible(boolean hourHandVisible) {
    this.hourHandVisible = hourHandVisible;
    paintClock(); // Repaint the clock
}
public boolean isMinuteHandVisible() {
    return minuteHandVisible;
}
public void setMinuteHandVisible(boolean minuteHandVisible) {
    this.minuteHandVisible = minuteHandVisible;
    paintClock();
}

public boolean isSecondHandVisible() {
    return secondHandVisible;
}
public void setSecondHandVisible(boolean secondHandVisible) {
    this.secondHandVisible = secondHandVisible;
        paintClock();
}

    //Set the current time for the clock
    public void setCurrentTime() {
        //Construct a calendar for the current date ane time
        Calendar calendar = new GregorianCalendar();
        //Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        paintClock();
        //Repaint clock
    }
    //Paint the clock
    protected void paintClock() {
        //Initialize clock paramters
        double clockRadius = Math.min(getW(), getH()) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;
        //Draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
        Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
        Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
        Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

        //Draw second hand
        double sLength = clockRadius * 1;
        double secondX = centerX - sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        sLine.setStroke(Color.RED);
        
        //Draw minute hand
        double mLength = clockRadius * 0.85;
        double xMinute = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, xMinute, minuteY);
        mLine.setStroke(Color.BLUE);
        //Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);
        getChildren().clear();
        getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
        // if(secondHandVisible)
        // getChildren().add(sLine);
        // if(minuteHandVisible)
        // getChildren().add(mLine);
        // if(hourHandVisible)
        // getChildren().add(hLine);

    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paintClock();
        
    }
}
