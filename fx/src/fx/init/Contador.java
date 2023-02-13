package fx.init;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		
		Button btnIncremento = new Button("+");
		Button btnDecremento = new Button("-");
		
		HBox boxBtns = new HBox();

		boxBtns.setAlignment(Pos.CENTER);
		boxBtns.setSpacing(10);
		boxBtns.getChildren().add(btnIncremento);
		boxBtns.getChildren().add(btnDecremento);
		
		btnIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
		});
		
		btnDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText(Integer.toString(contador));
		});

		VBox boxPrincipal = new VBox();
		
		boxBtns.setAlignment(Pos.CENTER);
		boxBtns.setSpacing(10);
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBtns);
		
		Scene cena = new Scene(boxPrincipal, 400, 400);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
