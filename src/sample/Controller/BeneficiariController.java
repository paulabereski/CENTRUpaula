package sample.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BeneficiariController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button beneficiariVizualizeazaButton;

    @FXML
    private Button beneficiariIesireButton;

    @FXML
    private Button beneficiariInregistreazaButton;


    @FXML
    void initialize() {
        beneficiariVizualizeazaButton.setOnAction(e -> {
            System.out.println("Butonul Inregistreaza a fost apasat");
        });
        beneficiariInregistreazaButton.setOnAction(e -> {
            System.out.println("Butonul Vizualizeaza a fost apasat");
        });
        beneficiariIesireButton.setOnAction(e -> {
            System.out.println("Butonul Iesire a fost apasat");
            Platform.exit();
        });

    }
}
