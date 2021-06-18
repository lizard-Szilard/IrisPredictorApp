/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLController implements Initializable {

	@FXML
	private TextField panjangSepalTextField;
	@FXML
	private TextField lebarSepalTextField;
	@FXML
	private TextField panjangPetalTextField;
	@FXML
	private TextField lebarPetalTextField;
	@FXML
	private TextField jenisBungaIrisTextField;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	private void prediksiButtonPressed(ActionEvent event) {
		double panjangSepal = Double.parseDouble(panjangSepalTextField.getText());
		double lebarSepal = Double.parseDouble(lebarSepalTextField.getText());
		double panjangPetal = Double.parseDouble(panjangPetalTextField.getText());
		double lebarPetal = Double.parseDouble(lebarPetalTextField.getText());
		

		if (panjangSepal >= 4.3 && panjangSepal <= 5.8 && lebarSepal >= 2.3 && lebarSepal <= 4.4 && panjangPetal >= 1.0 && panjangPetal <= 1.9 && lebarPetal >= 0.1 && lebarPetal <= 0.6) {
			jenisBungaIrisTextField.setText("Iris setosa");
		} else if (panjangSepal >= 4.9 && panjangSepal <= 7.9 && lebarSepal >= 2.2 && lebarSepal <= 3.8 && panjangPetal >= 4.5 && panjangPetal <= 6.9 && lebarPetal >= 1.4 && lebarPetal <= 2.5) {
			jenisBungaIrisTextField.setText("Iris Virginica");
		}else if (panjangSepal >= 4.9 && panjangSepal <= 7.0 && lebarSepal >= 2.0 && lebarSepal <= 3.4 && panjangPetal >= 3.0 && panjangPetal <= 5.1 && lebarPetal >= 1.0 && lebarPetal <= 1.8){
			jenisBungaIrisTextField.setText("Iris VersiColor");
		}
	}

}
