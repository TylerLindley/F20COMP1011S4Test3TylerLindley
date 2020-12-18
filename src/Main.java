//Tyler Lindley - 200382154
import Utilties.ReadingJSONFile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    //Adding an icon to the GUI.
    Image logo = new Image("/views/icon.png");

    public static void main(String[] args) {
        ReadingJSONFile.getDonors();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/donorsView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(logo);
        stage.setTitle("Blood Donor List");
        stage.show();
    }
}
