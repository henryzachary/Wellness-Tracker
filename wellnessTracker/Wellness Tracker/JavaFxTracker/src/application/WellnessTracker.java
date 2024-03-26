package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

public class WellnessTracker extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating labels and text fields for user input
        Label exerciseNameLabel = new Label("Exercise Name:");
        TextField exerciseNameField = new TextField();

        Label exerciseDurationLabel = new Label("Exercise Duration (mins):");
        TextField exerciseDurationField = new TextField();

        Label exerciseCaloriesLabel = new Label("Calories Burned:");
        TextField exerciseCaloriesField = new TextField();

        Label workoutDurationLabel = new Label("Workout Duration (mins):");
        TextField workoutDurationField = new TextField();

        Label workoutCaloriesLabel = new Label("Calories Burned:");
        TextField workoutCaloriesField = new TextField();

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label passwordLabel = new Label("Password:");
        TextField passwordField = new TextField();

        Label reminderMessageLabel = new Label("Reminder Message:");
        TextField reminderMessageField = new TextField();

        Button submitButton = new Button("Submit");

        // Creating a layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                exerciseNameLabel, exerciseNameField,
                exerciseDurationLabel, exerciseDurationField,
                exerciseCaloriesLabel, exerciseCaloriesField,
                workoutDurationLabel, workoutDurationField,
                workoutCaloriesLabel, workoutCaloriesField,
                usernameLabel, usernameField,
                emailLabel, emailField,
                passwordLabel, passwordField,
                reminderMessageLabel, reminderMessageField,
                submitButton
        );

        // Setting action for the submit button
        submitButton.setOnAction(event -> {
            // Get user input and create objects
            Exercise exercise = new Exercise(1, exerciseNameField.getText(), Integer.parseInt(exerciseDurationField.getText()), Integer.parseInt(exerciseCaloriesField.getText()));
            Workout workout = new Workout(1, new Date(), Integer.parseInt(workoutDurationField.getText()), Integer.parseInt(workoutCaloriesField.getText()));
            User user = new User(1, usernameField.getText(), emailField.getText(), passwordField.getText());
            Reminder reminder = new Reminder(1, new Date(), reminderMessageField.getText());

            // Displaying input data
            displayData(exercise, workout, user, reminder);
        });

        // Creating a scene
        Scene scene = new Scene(root, 400, 500);

        // Setting the scene
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wellness Tracker");
        primaryStage.show();
    }

    private void displayData(Exercise exercise, Workout workout, User user, Reminder reminder) {
        System.out.println("Exercise: " + exercise.getName() + ", Duration: " + exercise.getDuration() + " mins, Calories Burned: " + exercise.getCalories());
        System.out.println("Workout Date: " + workout.getDate() + ", Duration: " + workout.getDuration() + " mins, Calories Burned: " + workout.getCalories());
        System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
        System.out.println("Reminder Time: " + reminder.getTime() + ", Message: " + reminder.getMessage());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

