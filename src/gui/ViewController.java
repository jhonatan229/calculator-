package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private Button testSummer;
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;
	
	
	@FXML
	public void onSumButonAction() {
		try {
		labelResult.setText(String.valueOf( Double.parseDouble(txtNumber1.getText()) * Double.parseDouble(txtNumber2.getText())));
	}catch(NumberFormatException e ) {
		Alerts.showAlert("Error", null, "write only numbers, please", AlertType.ERROR);
	}
		}
	
	@FXML
	public void onTestAlertAction() {
		
	}
	
	

}
