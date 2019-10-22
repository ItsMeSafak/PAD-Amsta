package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.controllers.EndController;
import sample.controllers.GameController;
import sample.controllers.LoginController;
import sample.data.DBController;
import sample.views.EndView;
import sample.views.GameView;
import sample.views.LoginView;

public class Main extends Application {

    @Override
//    public void start(Stage primaryStage) {
//        GameController gameController = new GameController();
//        GameView gameView = new GameView(gameController);
//        gameView.show();
//        primaryStage.show();
//    }

    public void start(Stage thirdStage){
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView(loginController);
        loginView.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
