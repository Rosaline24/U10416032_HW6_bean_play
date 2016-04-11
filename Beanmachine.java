//modify
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.StrokeType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.animation.*;
import javafx.animation.Timeline;
import javafx.animation.PathTransition;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import java.security.SecureRandom;

public class Beanmachine extends Application{

	//Override the start method in the Application class
	@Override
	public void start(Stage primaryStage){
			
		//line of the outline
		Polyline line1 = new Polyline();
		line1.getPoints().addAll(155d,40d,155d,60d,0d,195d,0d,240d);
		
		Polyline line2 = new Polyline();
		line2.getPoints().addAll(175d,40d,175d,60d,320d,195d,320d,240d);
		
		//Bottom line
		Polyline line3 = new Polyline();
		line3.getPoints().addAll(0d,240d,320d,240d);
		
		//line at the button
		Polyline line4 = new Polyline();
		line4.getPoints().addAll(45d,190d,45d,240d);
		
		Polyline line5 = new Polyline();
		line5.getPoints().addAll(85d,190d,85d,240d);
		
		Polyline line6 = new Polyline();
		line6.getPoints().addAll(125d,190d,125d,240d);
		
		Polyline line7 = new Polyline();
		line7.getPoints().addAll(165d,190d,165d,240d);
		
		Polyline line8 = new Polyline();
		line8.getPoints().addAll(205d,190d,205d,240d);
		
		Polyline line9 = new Polyline();
		line9.getPoints().addAll(245d,190d,245d,240d);
		
		Polyline line10 = new Polyline();
		line10.getPoints().addAll(285d,190d,285d,240d);
		
		
		//adding balls
		Circle b1 = new Circle(4);
		b1.relocate(160d,70d);
		Circle b2 = new Circle(4);
		b2.relocate(140d,90d);
		Circle b3 = new Circle(4);
		b3.relocate(180d,90d);
		Circle b4 = new Circle(4);
		b4.relocate(120d,110d);
		Circle b5 = new Circle(4);
		b5.relocate(160d,110d);
		Circle b6 = new Circle(4);
		b6.relocate(200d,110d);
		Circle b7 = new Circle(4);
		b7.relocate(100d,130d);
		Circle b8 = new Circle(4);
		b8.relocate(140d,130d);
		Circle b9 = new Circle(4);
		b9.relocate(180d,130d);
		Circle b10 = new Circle(4);
		b10.relocate(220d,130d);
		Circle b11 = new Circle(4);
		b11.relocate(80d,150d);
		Circle b12 = new Circle(4);
		b12.relocate(120d,150d);
		Circle b13 = new Circle(4);
		b13.relocate(160d,150d);
		Circle b14 = new Circle(4);
		b14.relocate(200d,150d);
		Circle b15 = new Circle(4);
		b15.relocate(240d,150d);
		Circle b16 = new Circle(4);
		b16.relocate(60d,170d);
		Circle b17 = new Circle(4);
		b17.relocate(100d,170d);
		Circle b18 = new Circle(4);
		b18.relocate(140d,170d);
		Circle b19 = new Circle(4);
		b19.relocate(180d,170d);
		Circle b20 = new Circle(4);
		b20.relocate(220d,170d);
		Circle b21 = new Circle(4);
		b21.relocate(260d,170d);
		Circle b22 = new Circle(4);
		b22.relocate(40d,190d);
		Circle b23 = new Circle(4);
		b23.relocate(80d,190d);
		Circle b24 = new Circle(4);
		b24.relocate(120d,190d);
		Circle b25 = new Circle(4);
		b25.relocate(160d,190d);
		Circle b26 = new Circle(4);
		b26.relocate(200d,190d);
		Circle b27 = new Circle(4);
		b27.relocate(240d,190d);
		Circle b28 = new Circle(4);
		b28.relocate(280d,190d);
		
		Group group = new Group();
		
		//add lines into shape
		group.getChildren().addAll(line1,line2,line3,line4,line5,line6,line7,line8,line9,line10);
		
		//add balls into shape
		group.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28);
		
		Scene scene = new Scene(group, 400, 300);
		//set title
		primaryStage.setTitle("Beam Game");
		//put scene in the stage
		primaryStage.setScene(scene);
		//display the stage
		primaryStage.show();
		
		Circle circle[] = new Circle[8];
		for(int i =0;i<8;++i){
			circle[i] = new Circle(4);
			circle[i].setLayoutX(20+i*40);
			circle[i].setLayoutY(230);
			circle[i].setStroke(Color.BLUE);
			circle[i].setFill(Color.BLUE);
			group.getChildren().add(circle[i]);
		}
		
		Line line11[] = new Line[7];
		for(int i = 0;i<7;++i){
			line11[i] = new Line(45+i*40,200,45+i*40,240);
			line11[i].setStrokeWidth(4);
			line11[i].setStroke(Color.BLACK);
			group.getChildren().add(line11[i]);
		}
		
		

		
		scene.setOnMouseClicked(e ->{
			double x = 165;
			double y = 40;
			
			SecureRandom random = new SecureRandom();
			Circle run = new Circle();
			run.setCenterX(x);
			run.setCenterY(y);
			run.setRadius(4);
			Color color = new Color(random.nextDouble(),random.nextDouble(),random.nextDouble(), 1.0);
			run.setFill(color);
			group.getChildren().add(run);
		});
		
		int location = random.nextInt(128)+1;
		switch(location){
			case1: roll(run,b1,b2,b4,b7,b11,b16,b22);
			break;
			case2: roll(run,b1,b2,b4,b7,b11,b16,b23);
			break;
			case3: roll(run,b1,b2,b4,b7,b11,b17,b23);
			break;
			case4: roll(run,b1,b2,b4,b7,b11,b17,b24);
			break;
			case5: roll(run,b1,b2,b4,b7,b12,b17,b23);
			break;
			case6: roll(run,b1,b2,b4,b7,b12,b17,b24);
			break;
			case7: roll(run,b1,b2,b4,b7,b12,b18,b24);
			break;
			case8: roll(run,b1,b2,b4,b7,b12,b18,b25);
			break;
			case9: roll(run,b1,b2,b4,b8,b12,b17,b23);
			break;
			case10: roll(run,b1,b2,b4,b8,b12,b17,b24);
			break;
			case11: roll(run,b1,b2,b4,b8,b12,b18,b24);
			break;
			case12: roll(run,b1,b2,b4,b8,b12,b18,b25);
			break;
			case13: roll(run,b1,b2,b4,b8,b13,b18,b24);
			break;
			case14: roll(run,b1,b2,b4,b8,b13,b18,b25);
			break;
			case15: roll(run,b1,b2,b4,b8,b13,b19,b25);
			break;
			case16: roll(run,b1,b2,b4,b8,b13,b19,b26);
			break;
			case17: roll(run,b1,b2,b5,b8,b12,b17,b23);
			break;
			case18: roll(run,b1,b2,b5,b8,b12,b17,b24);
			break;
			case19: roll(run,b1,b2,b5,b8,b12,b18,b24);
			break;
			case15: roll(run,b1,b2,b5,b8,b12,b18,b25);
			break;
			case16: roll(run,b1,b2,b5,b8,b13,b18,b24);
			break;
			case17: roll(run,b1,b2,b5,b8,b13,b18,b25);
			break;
			case18: roll(run,b1,b2,b5,b8,b13,b19,b25);
			break;
			case19: roll(run,b1,b2,b5,b8,b13,b19,b26);
			break;
			case20: roll(run,b1,b2,b5,b9,b13,b18,b24);
			break;
			case21: roll(run,b1,b2,b5,b9,b13,b18,b25);
			break;
			case22: roll(run,b1,b2,b5,b9,b13,b19,b26);
			break;
			case23: roll(run,b1,b2,b5,b9,b14,b19,b25);
			break;
			case24: roll(run,b1,b2,b5,b9,b14,b19,b26);
			break;
			case25: roll(run,b1,b2,b5,b9,b14,b20,b26);
			break;
			case26: roll(run,b1,b2,b5,b9,b14,b20,b27);
			break;
			case27: roll(run,b1,b3,b5,b8,b12,b17,b23);
			break;
			case28: roll(run,b1,b3,b5,b8,b12,b17,b24);
			break;
			case29: roll(run,b1,b3,b5,b8,b12,b18,b24);
			break;
			case30: roll(run,b1,b3,b5,b8,b12,b18,b25);
			break;
			case31: roll(run,b1,b3,b5,b8,b13,b18,b24);
			break;
			case32: roll(run,b1,b3,b5,b8,b13,b18,b25);
			break;
			case33: roll(run,b1,b3,b5,b8,b13,b19,b25);
			break;
			case34: roll(run,b1,b3,b5,b8,b13,b19,b26);
			break;
			case35: roll(run,b1,b3,b5,b9,b13,b18,b24);
			break;
			case36: roll(run,b1,b3,b5,b9,b13,b18,b25);
			break;
			case37: roll(run,b1,b3,b5,b9,b13,b19,b25);
			break;
			case38: roll(run,b1,b3,b5,b9,b13,b19,b26);
			break;
			case39: roll(run,b1,b3,b5,b9,b14,b19,b25);
			break;
			case40: roll(run,b1,b3,b5,b9,b14,b19,b26);
			break;
			case41: roll(run,b1,b3,b5,b9,b14,b20,b26);
			break;
			case42: roll(run,b1,b3,b5,b9,b14,b20,b27);
			break;
			case43: roll(run,b1,b3,b6,b9,b13,b18,b24);
			break;
			case44: roll(run,b1,b3,b6,b9,b13,b18,b25);
			break;
			case45: roll(run,b1,b3,b6,b9,b13,b19,b25);
			break;
			case46: roll(run,b1,b3,b6,b9,b13,b19,b26);
			break;
			case47: roll(run,b1,b3,b6,b9,b14,b19,b25);
			break;
			case48: roll(run,b1,b3,b6,b9,b14,b19,b26);
			break;
			case49: roll(run,b1,b3,b6,b9,b14,b20,b26);
			break;
			case50: roll(run,b1,b3,b6,b10,b14,b19,b25);
			break;
			case51: roll(run,b1,b3,b6,b10,b14,b19,b26);
			break;
			case52: roll(run,b1,b3,b6,b10,b14,b20,b26);
			break;
			case53: roll(run,b1,b3,b6,b10,b14,b20,b27);
			break;
			case54: roll(run,b1,b3,b6,b10,b15,b20,b26);
			break;
			case55: roll(run,b1,b3,b6,b10,b15,b20,b27);
			break;
			case56: roll(run,b1,b3,b6,b10,b15,b21,b27);
			break;
			case57: roll(run,b1,b3,b6,b10,b15,b21,b28);
			break;
			
		}
		

		
/*		AnimationTimer timer = new AnimationTimer(){
			@Override
			public void handle(long now){
				int dx = 0, dy = 0;
				
				if(goEast) dx +=1;
				if(goEast) dy -=1;
				
				if(goWest) dx -=1;
				if(goWest) dy -=1;
				
			//	moveballBy( dx, dy);
			}
		};
		timer.start();*/
	}
	
	public static void main(String[] args){
		launch(args);
	}
}	