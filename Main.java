package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) { 
		Application.launch(args);
		
		
}
	
	
	@Override
	public void start(Stage Stage)throws Exception{
		
		Group root = new Group();
		Scene scene = new Scene(root);
		
		Image icon = new Image("butterfly.png");
		Stage.getIcons().add(icon);
		Stage.setWidth(1024);
		Stage.setHeight(768);
		Stage.setResizable(false);
//		Stage.setFullScreen(true);
		
		
		Text text = new Text();
		text.setText("bobo ka");
		text.setX(200);
		text.setY(200);
		text.setFont(Font.font("Aesthetic",50));
		text.setFill(Color.RED);
		
		Line line = new Line();
		line.setStartX(200); 
		line.setStartY(200);         
		line.setEndX(500); 
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.BEIGE);
		line.setOpacity(0.5);
		line.setRotate(45);
		
		
		// wings
		
		//left wing
		
		//top part
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				281.0, 294.0,
				375.0, 100.0,
				492.0, 331.0
				);
		triangle.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel = new Ellipse();
		ellipsel.setCenterX(334.0);
		ellipsel.setCenterY(145.78);
		ellipsel.setRadiusX(66);
		ellipsel.setRadiusY(60);
		ellipsel.setFill(Color.DARKBLUE);
		ellipsel.setRotate(45);
		
		Ellipse ellipsel2 = new Ellipse();
		ellipsel2.setCenterX(290.89 );
		ellipsel2.setCenterY(235.56 );
		ellipsel2.setRadiusX(65);
		ellipsel2.setRadiusY(59);
		ellipsel2.setFill(Color.DARKBLUE);
		
		//lower part
		Polygon triangle2 = new Polygon();
		triangle2.getPoints().setAll(
				233.0, 453.0,
				415.0, 576.0,
				492.0, 331.0
				);
		triangle2.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel3 = new Ellipse();
		ellipsel3.setCenterX(749.41);
		ellipsel3.setCenterY(503.52);
		ellipsel3.setRadiusX(65);
		ellipsel3.setRadiusY(59);
		ellipsel3.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel4 = new Ellipse();
		ellipsel4.setCenterX(661.41);
		ellipsel4.setCenterY(561.52);
		ellipsel4.setRadiusX(65);
		ellipsel4.setRadiusY(59);
		ellipsel4.setFill(Color.DARKBLUE);
				
		
		
		
		// right wing
		
		// TOP PART
		Polygon triangle3 = new Polygon();
		triangle3.getPoints().setAll(
				524.0, 331.0,
				640.0, 100.0,
				722.0, 294.0
				);
		triangle3.setFill(Color.DARKBLUE);
		
		Ellipse ellipser = new Ellipse();
		ellipser.setCenterX(688.0);
		ellipser.setCenterY(145.78);
		ellipser.setRadiusX(66);
		ellipser.setRadiusY(60);
		ellipser.setFill(Color.DARKBLUE);
		ellipser.setRotate(45);
		
		Ellipse ellipser2 = new Ellipse();
		ellipser2.setCenterX(715.31);
		ellipser2.setCenterY(235.14);
		ellipser2.setRadiusX(65);
		ellipser2.setRadiusY(59);
		ellipser2.setFill(Color.DARKBLUE);
		
		
		// LOWER PART
		
		Polygon triangle4 = new Polygon();
		triangle4.getPoints().setAll(
				600.0, 576.0,
				772.0, 448.0,
				524.0, 331.0
				);
		triangle4.setFill(Color.DARKBLUE);
		
		Ellipse ellipser3 = new Ellipse();
		ellipser3.setCenterX(265.41);
		ellipser3.setCenterY(504.52);
		ellipser3.setRadiusX(65);
		ellipser3.setRadiusY(59);
		ellipser3.setFill(Color.DARKBLUE);
		
		Ellipse ellipser4 = new Ellipse();
		ellipser4.setCenterX(350.41);
		ellipser4.setCenterY(566.52);
		ellipser4.setRadiusX(65);
		ellipser4.setRadiusY(59);
		ellipser4.setFill(Color.DARKBLUE);
		
		//body
		Ellipse ellipseb = new Ellipse();
		ellipseb.setCenterX(507.50);
		ellipseb.setCenterY(352.50);
		ellipseb.setRadiusX(23);
		ellipseb.setRadiusY(50);
		ellipseb.setFill(Color.DARKBLUE);
		
		
		//Second layer
		
		//LEFT WING
		//top part
				Polygon trianglelightblueL = new Polygon();
				trianglelightblueL.getPoints().setAll(
						306.50, 288.50,
						480.50, 320.50,
						380.50, 135.50 //-10 to x  -34 to y  (395.50, 169.50)
						);
				trianglelightblueL.setFill(Color.SKYBLUE);
				
				Ellipse ellipselightblueL = new Ellipse();
				ellipselightblueL.setCenterX(335.10); //(+1.10)
				ellipselightblueL.setCenterY(150.32); //(+4.54) 
				ellipselightblueL.setRadiusX(61); //(-5)
				ellipselightblueL.setRadiusY(55); //(-5)
				ellipselightblueL.setFill(Color.SKYBLUE);
				ellipselightblueL.setRotate(45);
			
				Ellipse ellipselightblueL2 = new Ellipse();
				ellipselightblueL2.setCenterX(298.89); //-10
				ellipselightblueL2.setCenterY(237.18); //-15
				ellipselightblueL2.setRadiusX(65);
				ellipselightblueL2.setRadiusY(54); //-5
				ellipselightblueL2.setFill(Color.SKYBLUE);
				
		//lowerpart
				Polygon trianglelowSkyblueL = new Polygon();
				trianglelowSkyblueL.getPoints().setAll(
						253.0, 453.0,
						410.0, 550.0,
						482.0, 341.0
						);
				trianglelowSkyblueL.setFill(Color.SKYBLUE);
				
				Ellipse ellipselowskyBlueL = new Ellipse();
				ellipselowskyBlueL.setCenterX(265.41);
				ellipselowskyBlueL.setCenterY(504.52);
				ellipselowskyBlueL.setRadiusX(55);
				ellipselowskyBlueL.setRadiusY(49);
				ellipselowskyBlueL.setFill(Color.SKYBLUE);
				

				
		// RIGHT WING
		
		// TOP PART
				Polygon triangletopskyBlueR = new Polygon();
				triangletopskyBlueR.getPoints().setAll(
						538.0, 320.0,
						630.0, 135.0,
						719.0, 284.0
						);
				triangletopskyBlueR.setFill(Color.SKYBLUE);
				
				

				
		// LOWER PART
				Polygon trianglelowskyBlueR = new Polygon();
				trianglelowskyBlueR.getPoints().setAll(
						607.0, 555.0,
						760.0, 450.0,
						533.0, 343.0
						);
				trianglelowskyBlueR.setFill(Color.SKYBLUE);
			
		
		// THIRD LAYER
				
				//LEFT WINGS UPPER PART
				Polygon triangleyellowgreenL = new Polygon();
				triangleyellowgreenL.getPoints().setAll(
						326.50, 283.50, //(-5 to y) (+10 to x)
						470.50, 312.50, // (-10 to x (-8 to y))
						395.50, 183.50 // (+14)
						);
				triangleyellowgreenL.setFill(Color.GREENYELLOW);
				
				Ellipse ellipseyellowgreenL = new Ellipse();
				ellipseyellowgreenL.setCenterX(336.10); //(+1.10)
				ellipseyellowgreenL.setCenterY(154.86); //(+4.54) 
				ellipseyellowgreenL.setRadiusX(56); //(-5)
				ellipseyellowgreenL.setRadiusY(50); //(-5)
				ellipseyellowgreenL.setFill(Color.GREENYELLOW);
				ellipseyellowgreenL.setRotate(45);
				
				Ellipse ellipseyellowgreenL2 = new Ellipse();
				ellipseyellowgreenL2.setCenterX(293.89); //-5
				ellipseyellowgreenL2.setCenterY(237.18); 
				ellipseyellowgreenL2.setRadiusX(53); // -12
				ellipseyellowgreenL2.setRadiusY(49); //-5
				ellipseyellowgreenL2.setFill(Color.GREENYELLOW);
				
			
				
				
		
				
		// FORTH LAYER
				Polygon triangleorangeL = new Polygon();
				triangleorangeL.getPoints().setAll(
						336.50, 278.50, //(-5 to y) (+10 to x)
						460.50, 304.50, // (-10 to x (-8 to y))
						395.50, 193.50 // (+14 to y)
						);
				triangleorangeL.setFill(Color.ORANGE);
				
				Ellipse ellipseorangeL = new Ellipse();
				ellipseorangeL.setCenterX(337.10); //(+1.10)
				ellipseorangeL.setCenterY(157.4); //(+4.54) 
				ellipseorangeL.setRadiusX(51); //(-5)
				ellipseorangeL.setRadiusY(45); //(-5)
				ellipseorangeL.setFill(Color.ORANGE);
				ellipseorangeL.setRotate(45);
				
				Ellipse ellipseorangeL2 = new Ellipse();
				ellipseorangeL2.setCenterX(295.89); //-5
				ellipseorangeL2.setCenterY(237.18); 
				ellipseorangeL2.setRadiusX(45); // -12
				ellipseorangeL2.setRadiusY(44); //-5
				ellipseorangeL2.setFill(Color.ORANGE);
				
		// FIFTH LAYER
				Polygon triangleyellowL = new Polygon();
				triangleyellowL.getPoints().setAll(
						346.50, 273.50, //(-5 to y) (+10 to x)
						450.50, 296.50, // (-10 to x (-8 to y))
						395.50, 207.50 // (+14 to y)
						);
				triangleyellowL.setFill(Color.YELLOW);
				
				
				Ellipse ellipseyellowL = new Ellipse();
				ellipseyellowL.setCenterX(338.10); //(+1.10)
				ellipseyellowL.setCenterY(158.94); //(+4.54) 
				ellipseyellowL.setRadiusX(46); //(-5)
				ellipseyellowL.setRadiusY(40); //(-5)
				ellipseyellowL.setFill(Color.YELLOW);
				ellipseyellowL.setRotate(45);
				
				Ellipse ellipseyellowL2 = new Ellipse();
				ellipseyellowL2.setCenterX(295.89); //-5
				ellipseyellowL2.setCenterY(237.18); 
				ellipseyellowL2.setRadiusX(40); // -12
				ellipseyellowL2.setRadiusY(39); //-5
				ellipseyellowL2.setFill(Color.YELLOW);
		
		
		
		// first layer
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(triangle);
		root.getChildren().add(triangle2);
		root.getChildren().add(triangle3);
		root.getChildren().add(triangle4);
		root.getChildren().add(ellipsel);
		root.getChildren().add(ellipsel2);
		root.getChildren().add(ellipsel3);
		root.getChildren().add(ellipsel4);
		root.getChildren().add(ellipser);
		root.getChildren().add(ellipser2);
		root.getChildren().add(ellipser3);
		root.getChildren().add(ellipser4);
		root.getChildren().add(ellipseb);
		
		//second layer
		
		//LEFT PART
		root.getChildren().add(trianglelightblueL);
		root.getChildren().add(ellipselightblueL);
		root.getChildren().add(ellipselightblueL2);
		
		root.getChildren().add(trianglelowSkyblueL);
		root.getChildren().add(ellipselowskyBlueL);
		
		// RIGHT PART
		root.getChildren().add(triangletopskyBlueR); 
		
		
		
		root.getChildren().add(trianglelowskyBlueR);
		
		
		// THIRD LAYER
		root.getChildren().add(triangleyellowgreenL);
		root.getChildren().add(ellipseyellowgreenL);
		root.getChildren().add(ellipseyellowgreenL2);
		
		//FORTH
		root.getChildren().add(triangleorangeL);
		root.getChildren().add(ellipseorangeL);
		root.getChildren().add(ellipseorangeL2);
		
		
		//FIFTH
		root.getChildren().add(triangleyellowL);
		root.getChildren().add(ellipseyellowL);
		root.getChildren().add(ellipseyellowL2);
		
		Stage.setTitle("Nery, Thea Andrea");
		Stage.setScene(scene);
		Stage.show();
		
	}
}

