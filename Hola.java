import javafx.application.Application;
import javafx.stage.Stage;

public class Hola extends Application{
	public static void main(String[] args){
		//System.out.println("Hola mundo cool!");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Mi primera ventana");
		stage.show();
	}
}
