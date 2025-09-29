import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lab4_Main extends Application {

    // ==========================
    // STEP 1: Track the "pen" position
    // Start from (100, 100)
    // ==========================
    private double currentX = 100;
    private double currentY = 100;

    // ==========================
    // STEP 2: Choose a fixed step size
    // Every arrow key press moves the pen this much
    // ==========================
    private final double STEP = 20;

    @Override
    public void start(Stage stage) {
        // The drawing area
        Pane pane = new Pane();

        // TODO 1: Add a starting point indicator (optional)
        // For example: a small circle at (100,100) so students know where the pen starts

        Scene scene = new Scene(pane, 400, 400);

        // ==========================
        // STEP 3: Listen for arrow key presses
        // ==========================
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                // TODO 2: Draw a line toward the east
                // Hint: create a Line from (currentX, currentY) → (currentX + STEP, currentY)
                // Add it to the pane
                // Then update currentX
            }
            else if (event.getCode() == KeyCode.LEFT) {
                // TODO 3: Draw a line toward the west
                // Update coordinates accordingly
            }
            else if (event.getCode() == KeyCode.UP) {
                // TODO 4: Draw a line toward the north
            }
            else if (event.getCode() == KeyCode.DOWN) {
                // TODO 5: Draw a line toward the south
            }
        });

        stage.setTitle("Draw with Arrow Keys");
        stage.setScene(scene);
        stage.show();

        // IMPORTANT: Pane must have focus to receive key events
        // So request focus on the scene or pane
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
