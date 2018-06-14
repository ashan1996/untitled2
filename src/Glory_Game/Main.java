package Glory_Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Parent root = FXMLLoader.load(getClass().getResource("user_interfaces/sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 1100, 600));
//        primaryStage.show();
//        Parent root1 = FXMLLoader.load(getClass().getResource("signup.fxml"));
//        primaryStage.setTitle("Hello World");
//        //primaryStage.setScene(new Scene(root1, screenSize.getWidth(), screenSize.getHeight()));
//        primaryStage.setScene(new Scene(root1, 1100, 600));
//        primaryStage.show();
       Parent root2 = FXMLLoader.load(getClass().getResource("user_interfaces/MainGame.fxml"));
       primaryStage.setTitle("Hello World");
       primaryStage.setScene(new Scene(root2, 1100, 600));
       primaryStage.show();
//         Parent root3 = FXMLLoader.load(getClass().getResource("user_interfaces/showRoundScores.fxml"));
//         primaryStage.setTitle("Hello World");
//         primaryStage.setScene(new Scene(root3, 1100, 600));
//         primaryStage.show();
//        SignupController sg = new SignupController();
//        sg.start(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
