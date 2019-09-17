/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moq;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author pc
 */
public  class  guiNumbers {
    UnOrderedArray o1=new UnOrderedArray(100);
    displayU d1=new displayU(o1);
    deleteUnOrder de1=new deleteUnOrder(o1);
    InsertUnOrder i1=new InsertUnOrder(o1);
    OrderedArray o2=new OrderedArray(100);
    display d2=new display(o2);
    deleteOrder de2=new deleteOrder(o2);
    InsertOrder i2=new InsertOrder(o2);
    
    
    public void getRoot(Stage primaryStage)
            
    {
 
		///////// scene 1 //////////////////
		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,click,showMyArray,order,unor;
                b1=new Button(); b2=new Button();   b3=new Button();  b4=new Button();   b5=new Button()  ;order=new Button()  ;unor=new Button()  ;
                b6=new Button();  b7=new Button(); b8=new Button();  b9=new Button();  b0=new Button();    bd=new Button(); click=new Button();showMyArray=new Button();
                b1.setText("   1    "); b2.setText("   2    "); b3.setText("   3    ");b4.setText("   4    ");  b5.setText("   5    ");
                b6.setText("   6    "); b7.setText("   7    ");   b8.setText("   8    "); b9.setText("   9    "); b0.setText("   0    ");
                bd.setText(" delete ");click.setText("insert");showMyArray.setText("show My Array");order.setText(" Order ");unor.setText("Unorder ");
                Label label1,label11;
		Label T1;
		
		
		label1 =new Label();
		label11=new Label();
                label11.setText("this program is testing on arrays");
                label1.setText("enter your number and press click to enter in array your max size is 100");
		T1= new Label();
                Label msg;
		 Button delete;
		
		delete=new Button();
		
		msg =new Label();
		
		
		delete.setText("Delete");
		
    Image image=new Image(getClass().getResourceAsStream("grape.png"),1200,1200,false,false);
    
    ImageView BackGround=new ImageView(image);
    BackGround.setX(0);
    BackGround.setY(0);
    BackGround.setFitHeight(600);
    BackGround.setFitWidth(600);
    BackGround.setPreserveRatio(true);
    Image image1=new Image(getClass().getResourceAsStream("BackGround.png"),1200,1200,false,false);
   
    ImageView BackGround1=new ImageView(image1);
    BackGround1.setX(0);
    BackGround1.setY(0);
    BackGround1.setFitHeight(800);
    BackGround1.setFitWidth(800);
    BackGround1.setPreserveRatio(true);
  //  Group root=new Group(BackGround);
   
     //   Scene scene = new Scene(root, 550, 550);
   //   Canvas can=new Canvas(500,500);
   //   root.getChildren().add(can);
    //  GraphicsContext gc =can.getGraphicsContext2D();
    
     
  
         
        StackPane root = new StackPane();
         root.setMargin(order, new Insets(200, 50, 10, 0));
         root.setMargin(unor, new Insets(200, 180, 10, 0));
        root.setMargin(b1, new Insets(0,180 , 10, 0));
        root.setMargin(b2, new Insets(0, 90, 10, 0));
        root.setMargin(b3, new Insets(0, 0, 10, 0));
        root.setMargin(b4, new Insets(50, 180, 10, 0));
        root.setMargin(b5, new Insets(50, 90, 10, 0));
        root.setMargin(b6, new Insets(50, 0, 10, 0));
        root.setMargin(b7, new Insets(100, 180, 10, 0));
        root.setMargin(b8, new Insets(100, 90, 10, 0));
        root.setMargin(b9, new Insets(100, 0, 10, 0));
        root.setMargin(b0, new Insets(150, 180, 10, 0));
        root.setMargin(bd, new Insets(150, 80, 10, 0));
        root.setMargin(label1, new Insets(0, 0, 100, 30));
        root.setMargin(label11, new Insets(0, 20, 340, 30));
        root.setMargin(T1, new Insets(0, 0, 200, 30));
         root.setMargin(click, new Insets(100, 180, 350, 0));
         root.setMargin(showMyArray, new Insets(100, 180, 350, 0));
          root.setMargin(msg, new Insets(500, 10, 280, 30));
           root.setMargin(delete, new Insets(100, 180, 250, 0));
            root.setMargin(showMyArray, new Insets(100, 180, 300, 0));
           root.getChildren().addAll( BackGround1,BackGround);
        root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,label1,label11,click,T1,delete,msg,showMyArray,order,unor);
     
     b1.setVisible(false);
      b2.setVisible(false);
       b3.setVisible(false);
        b4.setVisible(false);
         b5.setVisible(false);
          b6.setVisible(false);
           b7.setVisible(false);
            b8.setVisible(false);
             b9.setVisible(false);
              b0.setVisible(false);
               bd.setVisible(false);
                  click.setVisible(false);
                   delete.setVisible(false);
                    showMyArray.setVisible(false);
                    
          b1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            label11.setText("");
                            
				if(T1.getText().equals("")) {
                            
                                    T1.setText("1");}
                                else
                                {
                                    String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+1;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                }}		
			});
       
                
                
                  b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              
				if(T1.getText().equals("")) {
                            
                                    T1.setText("2");}
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+2;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                            
                                }
                });
                    b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("3");}
                            
                                else
                                {
                                
                                     String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+3;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                
                                }
                });
                      b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("4");}
                            
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+4;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                }
                });
                        b5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("5");}
                            
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+5;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                }
                });
                          b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("6");}
                            
                                
                        else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+6;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                        } });
                            b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                   T1.setText("7");}
                         
                                
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+7;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                              b8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
			if(T1.getText().equals("")) {
                            
                                   T1.setText("7");}
                         
                                
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+8;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                                b9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("9");}
                            
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    if(y==0)
                                    {
                                     String z=String.valueOf(y);
                                     
                                    T1.setText(z);
                                    
                                    }
                                    y=y*10+9;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                    
                        
                        }
                                
                                
                                }
                });
                                  b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("0");}
                            
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+0;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                }
                });
                                   bd.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             
					  label11.setText("");
				
                        
                               String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    
                                    y=y/10;
                                    
                                    
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                    if(y==0)
                                    {T1.setText("");
                                    }
                                    
                                    }
                        
					
			});
                                   unor.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{order.setVisible(false);
                        unor.setVisible(false);
                              b1.setVisible(true);
      b2.setVisible(true);
       b3.setVisible(true);
        b4.setVisible(true);
         b5.setVisible(true);
          b6.setVisible(true);
           b7.setVisible(true);
            b8.setVisible(true);
             b9.setVisible(true);
              b0.setVisible(true);
               bd.setVisible(true);
                  click.setVisible(true);
                   delete.setVisible(true);
                    showMyArray.setVisible(true);
                        click.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                          delete.setVisible(true);
                          int value=Integer.valueOf(T1.getText());
                i1.insert(value);
                T1.setText("");
            }
        });
           showMyArray.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                          T1.setText("");
                   if(o1.getNumberOFElement()==0)
                       msg.setText("your array is empty");
                   else if(o1.getNumberOFElement()==o1.getA().length)
                       msg.setText("your array is full");
                   else
                  d1.prin(msg);
            }
        });
            delete.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                   
                            int y=Integer.valueOf(T1.getText());
                   if(de1.delete(y)==false)
                   {msg.setText("your number isnot found");
                       T1.setText("");}
                   else
                       { msg.setText("your number deleted");
                         de1.delete(y);
            }}
        });
                        
                        }		
			});
                             order.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{order.setVisible(false);
                        unor.setVisible(false);
                                            b1.setVisible(true);
      b2.setVisible(true);
       b3.setVisible(true);
        b4.setVisible(true);
         b5.setVisible(true);
          b6.setVisible(true);
           b7.setVisible(true);
            b8.setVisible(true);
             b9.setVisible(true);
              b0.setVisible(true);
               bd.setVisible(true);
                  click.setVisible(true);
                   delete.setVisible(true);
                    showMyArray.setVisible(true);
                            click.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                          int value=Integer.valueOf(T1.getText());
                i2.insert(value);
                T1.setText("");
            }
        });
           showMyArray.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                          T1.setText("");
                   if(o2.getNumberOFElement()==0)
                       msg.setText("your array is empty");
                   else if(o2.getNumberOFElement()==o2.getA().length)
                       msg.setText("your array is full");
                   else
                  d2.prin(msg);
            }
        });
            delete.setOnAction(new EventHandler<ActionEvent>() {
                      public void handle(ActionEvent event) {
                   
                            int y=Integer.valueOf(T1.getText());
                   if(de2.delete(y)==false)
                   {msg.setText("your number isnot found");
                       T1.setText("");}
                   else
                       { msg.setText("your number deleted");
                         de2.delete(y);
            }}
        });     
                        
                        }		
			});
                         
               
                        
                        
                      
           
        
        Scene scene = new Scene(root, 600,600);
        
        primaryStage.setTitle("arrays");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
         