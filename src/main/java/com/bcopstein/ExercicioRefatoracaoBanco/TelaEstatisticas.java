package com.bcopstein.ExercicioRefatoracaoBanco;
 import java.util.List;
import java.util.Map;
 import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 public class TelaEstatisticas {
	private Stage mainStage; 
	private Scene cenaOperacoes;
	private Conta conta;
	private Scene cenaEstatisticas;
	//private Map<Integer, Conta> contas; 
	//private List<Operacao> operacoes; 
 	//private TextField tfContaCorrente;
 	public TelaEstatisticas(Stage anStage, Scene telaOperacoes, Conta conta) {
		mainStage = anStage;
		this.conta = conta;
		this.cenaOperacoes = telaOperacoes;
	}
 	public Scene getTelaEstatisticas() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25,25));
		// grid.setGridLinesVisible(true);
		
		String dadosCorr = conta.getNumero()+" : "+conta.getCorrentista();
        Text scenetitle = new Text(dadosCorr);
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("Conta corrente:");
		grid.add(userName, 0, 1);
 		
		Button btnVoltar = new Button ("voltar");
		grid.add(btnVoltar, 1, 1);
		
		btnVoltar.setOnAction(e->{
        	mainStage.setScene(cenaOperacoes);
        });
		
		cenaEstatisticas = new Scene(grid);
		return cenaEstatisticas;
	}
}
