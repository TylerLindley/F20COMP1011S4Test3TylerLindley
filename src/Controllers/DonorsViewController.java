package Controllers;

import Models.BloodDonor;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class DonorsViewController implements Initializable {

    @FXML
    private ListView<BloodDonor> eligibleDonorListView;

    @FXML
    private CheckBox aPosCheckBox;

    @FXML
    private Label dataUploadDateLabel;

    @FXML
    private Label rowsReturnedLabel;

    @FXML
    private CheckBox eligibleDonorCheckBox;

    @FXML
    private CheckBox aNegCheckBox;

    @FXML
    private CheckBox abPosCheckBox;

    @FXML
    private CheckBox abNegCheckBox;

    @FXML
    private CheckBox bPosCheckBox;

    @FXML
    private CheckBox bNegCheckBox;

    @FXML
    private CheckBox oPosCheckBox;

    @FXML
    private CheckBox oNegCheckBox;

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private NumberAxis numberAxis;

    private List<CheckBox> checkBoxes;

    @FXML
    private void checkBoxChanged()
    {
        System.out.println("method 'checkBoxChanged()' was called");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //add CheckBox objects to ArrayList for easier handling
        checkBoxes = Arrays.asList(aPosCheckBox,aNegCheckBox,abPosCheckBox,abNegCheckBox,
                bPosCheckBox, bNegCheckBox, oPosCheckBox,oNegCheckBox);
    }
}
