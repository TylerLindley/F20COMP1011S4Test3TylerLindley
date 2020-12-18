//Tyler Lindley - 200382154
import Models.BloodDonor;
import Models.JsonFileResult;
import Utilties.ReadingJSONFile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main extends Application {
    //Adding an icon to the GUI.
    Image logo = new Image("/views/icon.png");

    public static void main(String[] args) {
        ArrayList<JsonFileResult> donors = ReadingJSONFile.getDonors();

        /* Map<String, Long> bloodTypeCount = donors.stream()
                .map(JsonFileResult::getBloodType)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())); */ //Couldn't figure out this error.

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
