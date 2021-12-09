package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private Button Btsalvar;

	@FXML
	private Button Btcancelar;

	@FXML
	private TextField Tfnome;

	@FXML
	private TextField Tfsobrenome;

	@FXML
	private Label Lnome;

	@FXML
	private Label Lsobrenome;

	@FXML
	private Label exibir;
	
	@FXML
	public void onBtTestAction() {

		double nome = Double.parseDouble(Tfsobrenome.getText());
		double sobrenome = Double.parseDouble(Tfsobrenome.getText());
		exibir.setText(String.format("%", nome, sobrenome));
	}

	public void onBtsalvarAction() {
		System.out.println("Você salvou o nome !");
	}


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub

	}

}