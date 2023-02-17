package init;

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

	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));

		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");

		if (contador > 0) {
			label.getStyleClass().add("verde");
		} else if (contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");

		labelTitulo.getStyleClass().add("titulo");
		labelNumero.getStyleClass().add("numero");

		Button btnIncremento = new Button("+");
		Button btnDecremento = new Button("-");
		
		btnIncremento.getStyleClass().add("botoes");
		btnDecremento.getStyleClass().add("botoes");
		
		btnIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});

		btnDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});

		HBox boxBtns = new HBox();

		boxBtns.setAlignment(Pos.CENTER);
		boxBtns.setSpacing(10);
		boxBtns.getChildren().add(btnIncremento);
		boxBtns.getChildren().add(btnDecremento);

		VBox boxConteudo = new VBox();

		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBtns);

		String caminhoCss = getClass().getResource("/fx/init/Contador.css").toExternalForm();
		Scene cena = new Scene(boxConteudo, 400, 400);
		cena.getStylesheets().add(caminhoCss);
		cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Rowdies:wght@700&display=swap");

		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
