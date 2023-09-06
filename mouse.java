import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mouse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);

        Image image = new Image("digda.png"); // 이미지 경로를 수정하세요.
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(50); // 이미지 크기 설정
        imageView.setFitHeight(50);

        root.getChildren().add(imageView);

        scene.setOnMouseMoved(event -> {
            double mouseX = event.getX();
            double mouseY = event.getY();

            // 이미지 중심을 마우스 위치로 이동
            imageView.setLayoutX(mouseX - imageView.getFitWidth() / 2);
            imageView.setLayoutY(mouseY - imageView.getFitHeight() / 2);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Following Image");
        primaryStage.show();
      }
      
      public static void main(String[] args) {
        launch(args);
        start();
    }
}
