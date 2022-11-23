import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.SplitPane;

import javafx.stage.Stage;

 
public class App extends Application{
   

    @Override
    public void start(Stage primaryStage) {
        try{
        
        /*Button btn = new Button("submit");
        btn.setOnAction(ef -> System.out.println("hello studnt"));
        Button adbtn = new Button("admin login");
        adbtn.setOnAction(e -> {System.out.println("entered admin form");} );
        Button exitbtn = new Button(" exit ");
        exitbtn.setOnAction(e -> { 
            System.out.println("exited");
            System.exit(0);});
         btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                System.out.println("logged in to student portal");
            }
            
        });
        //Line line1 = new Line(100,100,400,100);     
        //Line line2 = new Line(100,500,400,500);  
        //Line line3 = new Line(10,50,10,100);  
        //Line line4 = new Line(150,50,150,100); 
        HBox hroot = new HBox();
        hroot.getChildren().addAll(btn,adbtn);
        VBox vroot =  new VBox();
        vroot.getChildren().addAll(hroot,exitbtn); 
       
        Group root = new Group();
        root.getChildren().addAll(vroot);*/
     
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main2.fxml"));

        SplitPane root1 =  (SplitPane) fxmlLoader.load();
        Scene scene = new Scene(root1);
        primaryStage.setScene(scene);
        primaryStage.setTitle(" STUDENT PORTAL");
        primaryStage.show();

    } 
    catch(Exception e){
        e.printStackTrace();
    }
    
    }
   
    public static void main(String[] args) {
        launch(args);
    }

}
 