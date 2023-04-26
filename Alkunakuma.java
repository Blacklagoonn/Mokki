import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VN extends Application {
    BorderPane alku = new BorderPane();
    Pane naytto = new Pane();
    VBox valikko = new VBox();
    VBox napit = new VBox();
    Button aloitusBtn = new Button("Aloitus");
    Button varausBtn = new Button("Varaukset");
    Button laskuBtn = new Button("Laskutus");
    Button asiakasBtn = new Button("Asiakkaat");
    Button alueBtn = new Button("Alueet");
    Button mokkiBtn = new Button("Mökit");
    Button palveluBtn = new Button("Palvelut");

    public VN() {
    }
    public void start(Stage stage) {
        ImageView vnlogo = new ImageView(new Image("/VN-logo.png", 230.0, 230.0, true, false));
        vnlogo.preserveRatioProperty().set(true);
        this.napit.getChildren().addAll(new Node[]{this.aloitusBtn, this.varausBtn, this.laskuBtn, this.asiakasBtn, this.alueBtn, this.mokkiBtn, this.palveluBtn});
        this.napit.setSpacing(5.0);
        this.napit.setPadding(new Insets(0.0, 0.0, 0.0, 50.0));
        this.valikko.setStyle("-fx-background-color: #608643;");
        this.valikko.getChildren().addAll(new Node[]{vnlogo, this.napit});
        this.valikko.setSpacing(30.0);
        this.valikko.setPadding(new Insets(30.0, 0.0, 0.0, 0.0));
        this.valikko.setAlignment(Pos.TOP_CENTER);
        this.valikko.setMinWidth(250.0);
        this.valikko.setPrefWidth(350.0);
        this.valikko.setMaxWidth(400.0);
        this.naytto.setStyle("-fx-background-color: #FBF4D9;");
        this.alku.setLeft(this.valikko);
        this.alku.setCenter(this.naytto);
        Scene scene = new Scene(this.alku, 1280.0, 720.0);
        this.valikko.getStylesheets().add(VN.class.getResource("tyylittely.css").toExternalForm());
        stage.setTitle("Village Newbies hallintajärjestelmä");
        stage.setScene(scene);
        stage.show();
        stage.getIcons().add(new Image("/VN-logo.png"));
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
