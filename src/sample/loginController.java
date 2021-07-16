package sample;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static sample.chooserController.*;

public class loginController {
    @FXML
    public TextField username_field;
    @FXML
    public Label title;
    @FXML
    public PasswordField password_field;
    @FXML
    public RadioButton remember;
    @FXML
    public Button login;

    public static Main main;
    public String username;
    public String password;
    public File f;
    public PrintWriter out;
    public static  String path1 = "C:" + File.separator + "ProgramData" + File.separator + "R1miner" + File.separator + "pws.txt";


    public void setMain(Main main) {
        title.setAlignment(Pos.CENTER);

        loginController.main = main;
        try {
            String username = Files.readAllLines(Paths.get(path1)).get(0);
            username_field.setText(username);
            String password = Files.readAllLines(Paths.get(path1)).get(1);
            password_field.setText(password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        f2 = new File(path2);
        f2.getParentFile().mkdirs();
        if (f2.exists() == false) {
            try {
                f2.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                out2 = new PrintWriter(path2);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }


    @FXML
    public void handlelogin() {
        username = username_field.getText();
        password = password_field.getText();
        if (username.equals("Controller") && password.equals("CtrlPanel")) {
            Main.primaryStage.setScene(Main.scene2);
            Main.primaryStage.setTitle("Controlpanel");
            if (remember.isSelected()) {
                f = new File(path1);
                f.getParentFile().mkdirs();
                try {
                    f.createNewFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    out = new PrintWriter(path1);
                    out.println(username);
                    out.println(password);
                    out.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }

        }
    }
}
