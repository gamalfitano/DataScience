import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Colors extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Colors!");
        Canvas canvas = new Canvas(600, 800);
        PixelWriter pixelWriter = canvas.getGraphicsContext2D().getPixelWriter();

        fillCanvas(pixelWriter);

        Group group = new Group(canvas);
        Scene scene = new Scene(group, 600, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void fillCanvas(PixelWriter pw) {

        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb(255 - ((i * 255) / 600), ((i * 255) / 600), 0));
            }
        }
        for (int j = 100; j < 200; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb((int) ((Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20), (int) ((Math.pow(((i * 255) / 600), 1 / 2.2)) * 20), 0));
            }
        }
        for (int j = 200; j < 300; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb(((i * 255) / 600), 0, 255 - ((i * 255) / 600)));
            }
        }
        for (int j = 300; j < 400; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb((int) (((Math.pow(((i * 255) / 600), 1 / 2.2)) * 20)), 0, (int) (Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20));
            }
        }
        for (int j = 400; j < 500; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb(0, 255 - ((i * 255) / 600), ((i * 255) / 600)));
            }
        }
        for (int j = 500; j < 600; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb(0, (int) ((Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20), (int) ((Math.pow(((i * 255) / 600), 1 / 2.2)) * 20)));
            }
        }

        for (int j = 600; j < 700; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb(255 - ((i * 255) / 600),255 - ((i * 255) / 600),255 - ((i * 255) / 600)));
                ;
            }
        }

        for (int j = 700; j < 800; j++) {
            for (int i = 0; i < 600; i++) {
                pw.setColor(i, j, Color.rgb((int) ((Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20), (int) ((Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20), (int) ((Math.pow(255 - ((i * 255) / 600), (1 / 2.2))) * 20)));
                ;
            }
        }
    }
}

