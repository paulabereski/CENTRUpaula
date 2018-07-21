package sample.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private Button responsabiliWelcomeButton;

    @FXML
    private Button BeneficiariWelcomeButton;

    @FXML
    private Button iesireWelcomeButton;


    @FXML
    void initialize() {
        responsabiliWelcomeButton.setOnAction(e -> {
            try {
                responsabiliScreenButtonPushed(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        BeneficiariWelcomeButton.setOnAction(e -> {
            try {
                beneficiariScreenButtonPushed(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        iesireWelcomeButton.setOnAction(e -> {
            System.out.println("Butonul Iesire a fost apasat");
            Platform.exit();
        });
    }

    public void beneficiariScreenButtonPushed(ActionEvent event) throws IOException {
        Parent beneficiariParent = FXMLLoader.load(getClass().getResource("../view/beneficiari.fxml"));
        Scene beneficiariScene = new Scene(beneficiariParent, 700, 600);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(beneficiariScene);
        window.show();
    }

    public void responsabiliScreenButtonPushed(ActionEvent event) throws IOException {
        Parent responsabiliParent = FXMLLoader.load(getClass().getResource("../view/responsabili.fxml"));
        Scene beneficiariScene = new Scene(responsabiliParent, 700, 600);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(beneficiariScene);
        window.show();
    }
}

