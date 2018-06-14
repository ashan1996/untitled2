package Glory_Game.Glory_GUI_Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignupController {
    Stage stage;
    public void start(Stage primaryStage) throws Exception {
        Parent root1 = FXMLLoader.load(getClass().getResource("user_interfaces/signup.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root1, screenSize.getWidth(), screenSize.getHeight()));
        primaryStage.setScene(new Scene(root1, 1100, 600)) ;
        primaryStage.show();
    }

    public void moveMe () throws Exception {
        selectOnlinePlayerController cc = new selectOnlinePlayerController();
        cc.start(stage);
    }
}
