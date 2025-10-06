package com.mycompany.lab6;

import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // ==========================
        // STEP 1: Create the layout
        // ==========================
        // TODO 1: Create and configure a GridPane
        // - Center align
        // - Add padding (12)
        // - Add horizontal and vertical gaps (5)


        // ==========================
        // STEP 2: Add Labels and TextFields
        // ==========================
        // TODO 2: Add the following:
        // Label + TextField for:
        //     - Number
        //     - Description
        //     - Price
        //
        // Example (uncomment and complete):
        // Label lblNumber = new Label("Number:");
        // TextField tfNumber = new TextField();
        // pane.add(lblNumber, 0, 1);
        // pane.add(tfNumber, 1, 1);

        // ==========================
        // STEP 3: Add Buttons
        // ==========================
        // TODO 3: Add two buttons: "Save" and "Quit" put the buttons at the bottom as shown on the lab diagram


        // ==========================
        // STEP 4: Add Button Functionality using the setOnAction method
        // ==========================
        // (a) Save Button:
        //     - Collect input from text fields
        //     - Call writeToFile(number, description, price)
        //     - Clear all fields
        //
        // (b) Quit Button:
        //     - Exit application using Platform.exit()
        //
        // TODO 4a: Implement btSave.setOnAction(...)
        // TODO 4b: Implement btQuit.setOnAction(...)
        //
        // btQuit.setOnAction(e -> Platform.exit());

        // ==========================
        // STEP 5: Create and Show Scene
        // ==========================
        // TODO 5: Create a Scene, set the title, and display the stage

    }

    // ==========================
    // STEP 6: Method for writing to file
    // ==========================
    // This method will handle opening, writing, and closing the file.
    // The file name should be "Products.txt".
    //
    // TODO 6: Implement file writing logic.
    private void writeToFile(String text, String fileName) {
  
    }

    public static void main(String[] args) {
        launch(args);
    }
}
