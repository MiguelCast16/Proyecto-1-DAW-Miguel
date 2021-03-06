package View;

import Model.TestConexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;


public class ControladorAnadirCiclo {
	
	@FXML
	public TextField Codigo;
	
	@FXML
	public TextField Nombre;
	
	@FXML
	public TextField Tipo;
	
	@FXML
	public TextField Familia;
	
	@FXML
	public TextField Capacidades;
	
	@FXML
	public TextField Actividades;
	
	@FXML
	public TextField Criterios;
	
	@FXML
	public TextField ClaveFP;
	
	@FXML
	public Button AnadirA;
	
	@FXML
	public Button Limpiar;

	
	
	
	public void AnadirA(ActionEvent event) {
		if(Codigo.getText().equals("")||Tipo.getText().equals("")||Familia.getText().equals("")||Capacidades.getText().equals("")||Actividades.getText().equals("")||Criterios.getText().equals("")||ClaveFP.getText().equals(""))
			{	
				Alert alert = new Alert(AlertType.ERROR); 
			    alert.setTitle("Campos Vacios");
			    alert.setHeaderText("Algunos De Los Campos Estan Vacios");
			    alert.setContentText("Por favor!!! Complete Todos Los Datos De La Tabla");
			
			    alert.showAndWait();
					
			}
		
		else {
			TestConexion uno=new TestConexion();
			String codigo= Codigo.getText();
			int codig = Integer.parseInt(codigo);
			String nombre= Nombre.getText();
			String tipo=Tipo.getText();
			String familia=Familia.getText();
			String capacidades=Capacidades.getText();
			String actividades=Actividades.getText();
			String criterios=Criterios.getText();
			String clave=ClaveFP.getText();
			uno.AnadirCiclo(codig,nombre,tipo,familia,capacidades,actividades,criterios,clave);
			Alert alert = new Alert(AlertType.INFORMATION); 
            alert.setTitle("Ciclo A�adido");
            alert.setHeaderText("Datos De Ciclo Introducidos Correctamente");
            alert.setContentText("El Insert Se Ha Realizado");
            alert.showAndWait();
            Codigo.setText(null);
			Nombre.setText(null);
			Tipo.setText(null);
			Familia.setText(null);
			Capacidades.setText(null);
			Actividades.setText(null);
			Criterios.setText(null);
			ClaveFP.setText(null);
	}
		
	}
	
	public void Limpiar(ActionEvent event) {
			
			Codigo.setText(null);
			Nombre.setText(null);
			Tipo.setText(null);
			Familia.setText(null);
			Capacidades.setText(null);
			Actividades.setText(null);
			Criterios.setText(null);
			ClaveFP.setText(null);
	}
}