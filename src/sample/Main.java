package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    String[][] qlist = new String[50][2];

    int i = 0;
    int count = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        qlist[0][0] = "Montgomery";
        qlist[0][1] = "Alabama";
        qlist[1][0] = "Juneau";
        qlist[1][1] = "Alaska";
        qlist[2][0] = "Phoenix";
        qlist[2][1] = "Arizona";
        qlist[3][0] = "Little Rock";
        qlist[3][1] = "Arkansas";
        qlist[4][0] = "Sacramento";
        qlist[4][1] = "California";
        qlist[5][0] = "Denver";
        qlist[5][1] = "Colorado";
        qlist[6][0] = "Hartford";
        qlist[6][1] = "Connecticut";
        qlist[7][0] = "Dover";
        qlist[7][1] = "Delaware";
        qlist[8][0] = "Tallahassee";
        qlist[8][1] = "Florida";
        qlist[9][0] = "Atlanta";
        qlist[9][1] = "Georgia";
        qlist[10][0] = "Honolulu";
        qlist[10][1] = "Hawaii";
        qlist[11][0] = "Boise";
        qlist[11][1] = "Idaho";
        qlist[12][0] = "Springfield";
        qlist[12][1] = "Illinois";
        qlist[13][0] = "Indianapolis";
        qlist[13][1] = "Indiana";
        qlist[14][0] = "Des Moines";
        qlist[14][1] = "Iowa";
        qlist[15][0] = "Topeka";
        qlist[15][1] = "Kansas";
        qlist[16][0] = "Frankfort";
        qlist[16][1] = "Kentucky";
        qlist[17][0] = "Baton Rouge";
        qlist[17][1] = "Louisiana";
        qlist[18][0] = "Augusta";
        qlist[18][1] = "Maine";
        qlist[19][0] = "Annapolis";
        qlist[19][1] = "Maryland";
        qlist[20][0] = "Boston";
        qlist[20][1] = "Massachusetts";
        qlist[21][0] = "Lansing";
        qlist[21][1] = "Michigan";
        qlist[22][0] = "Saint Paul";
        qlist[22][1] = "Minnesota";
        qlist[23][0] = "Jackson";
        qlist[23][1] = "Mississippi";
        qlist[24][0] = "Jefferson City";
        qlist[24][1] = "Missouri";
        qlist[25][0] = "Helena";
        qlist[25][1] = "Montana";
        qlist[26][0] = "Lincoln";
        qlist[26][1] = "Nebraska";
        qlist[27][0] = "Carson City";
        qlist[27][1] = "Nevada";
        qlist[28][0] = "Concord";
        qlist[28][1] = "New Hampshire";
        qlist[29][0] = "Trenton";
        qlist[29][1] = "New Jersey";
        qlist[30][0] = "Santa Fe";
        qlist[30][1] = "New Mexico";
        qlist[31][0] = "Albany";
        qlist[31][1] = "New York";
        qlist[32][0] = "Raleigh";
        qlist[32][1] = "North Carolina";
        qlist[33][0] = "Bismarck";
        qlist[33][1] = "North Dakota";
        qlist[34][0] = "Columbus";
        qlist[34][1] = "Ohio";
        qlist[35][0] = "Oklahoma City";
        qlist[35][1] = "Oklahoma";
        qlist[36][0] = "Salem";
        qlist[36][1] = "Oregon";
        qlist[37][0] = "Harrisburg";
        qlist[37][1] = "Pennsylvania";
        qlist[38][0] = "Providence";
        qlist[38][1] = "Rhode Island";
        qlist[39][0] = "Columbia";
        qlist[39][1] = "South Carolina";
        qlist[40][0] = "Pierre";
        qlist[40][1] = "South Dakota";
        qlist[41][0] = "Nashville";
        qlist[41][1] = "Tennessee";
        qlist[42][0] = "Austin";
        qlist[42][1] = "Texas";
        qlist[43][0] = "Salt Lake City";
        qlist[43][1] = "Utah";
        qlist[44][0] = "Montpelier";
        qlist[44][1] = "Vermont";
        qlist[45][0] = "Richmond";
        qlist[45][1] = "Virginia";
        qlist[46][0] = "Olympia";
        qlist[46][1] = "Washington";
        qlist[47][0] = "Charleston";
        qlist[47][1] = "West Virginia";
        qlist[48][0] = "Madison";
        qlist[48][1] = "Wisconsin";
        qlist[49][0] = "Cheyenne";
        qlist[49][1] = "Wyoming";


        primaryStage.setTitle("JavaFX ch837");
        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(grid, 700, 375);
        primaryStage.setScene(scene);


        Text question = new Text((i + 1) + ". What is the capital of " + qlist[i][0] + "?");
        question.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(question, 0, 0, 2, 1);

        Label answerlabel = new Label("Enter the answer:");
        grid.add(answerlabel, 0, 1);
        TextField answer = new TextField();
        grid.add(answer, 1, 1);


        Button chkbtn = new Button("check");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().

                add(chkbtn);
        grid.add(hbBtn, 0, 4);


        Button nextbtn = new Button("next");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().

                add(nextbtn);
        grid.add(hbBtn2, 1, 4);


        final Text result = new Text();
        grid.add(result, 1, 8);


        chkbtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                if (answer.getText().toString().equalsIgnoreCase(qlist[i][1])) {
                    // using Regular Expressions to delete spaces and ignore capital letters.
                    result.setText("Your answer is correct");
                    count++;
                } else {
                    result.setText("The correct answer should be " + qlist[i][1]);
                }

            }


        });

        nextbtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

                if (i < 49) {
                    ++i;
                    question.setText((i + 1) + ". What is the capital of " + qlist[i][0] + "?");
                    result.setText("");
                    answer.setText("");
                } else
                    question.setText("50 questions are done. The correct count is " + count);
            }


        });


    }


}