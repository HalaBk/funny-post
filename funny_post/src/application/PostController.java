package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import service.modele;

import java.net.URL;
import java.util.ResourceBundle;

public class PostController implements Initializable {
	@FXML
	
	private modele modele;
	
	@FXML
	private Button btn_connect;
	
	@FXML
	private Button btn_select;
	
	@FXML
	private ListView<String> listView;
	
	@Override 
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	public void Connect(MouseEvent event) {
		modele = new modele();
		modele.ConnectBDD();
	} 
	public void click_on_select(MouseEvent event) {
		modele = new modele();
		modele.SelectBDD();
	}
}
