package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import static sample.Main.fileChooser;
import static sample.Main.primaryStage;
import static sample.loginController.path1;

public class chooserController {
    @FXML
    public Button add;
    @FXML
    public Button clear;
    @FXML
    public Button load;
    @FXML
    public Button change;
    @FXML
    public Button exit;
    @FXML
    public Button name;
    @FXML
    public Button p0;
    @FXML
    public Button p1;
    @FXML
    public Button p2;
    @FXML
    public Button p3;
    @FXML
    public Button p4;
    @FXML
    public Button p5;
    @FXML
    public Button p6;
    @FXML
    public Button p7;
    @FXML
    public Button p8;
    @FXML
    public Button p9;
    @FXML
    public Button p10;
    @FXML
    public Button p11;
    @FXML
    public Button p12;
    @FXML
    public Button p13;
    @FXML
    public Button p14;
    @FXML
    public Button p15;
    @FXML
    public TextField name_field;
    @FXML
    public Label name_label;

    public String pathFiles;
    public String a;
    public String setName2;
    public String setName;
    public String path = "C:" + File.separator + "ProgramData" + File.separator + "R1miner" + File.separator + "programs.txt";
    public static String path2 = "C:" + File.separator + "ProgramData" + File.separator + "R1miner" + File.separator + "names.txt";

    public File selectedFile;
    public File f;
    public static File f2;
    public PrintWriter out;
    public static PrintWriter out2;

    @FXML
    public void chooserHandler() {
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"));
        selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            pathFiles = selectedFile.getPath();
            f = new File(path);
            f.getParentFile().mkdirs();
            if (f.exists() == false) {
                try {
                    f.createNewFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    out = new PrintWriter(path);
                    out.println(pathFiles);
                    out.close();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            } else {
                try (FileWriter fw = new FileWriter(path, true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter out = new PrintWriter(bw)) {
                    out.println(pathFiles);
                } catch (IOException e) {
                }

            }
        }
    }

    @FXML
    public void chooseP0() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(0)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP1() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(1)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP2() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(2)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP3() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(3)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP4() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(4)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP5() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(5)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP6() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(6)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP7() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(7)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP8() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(8)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP9() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(9)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP10() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(10)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP11() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(11)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP12() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(12)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP13() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(13)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP14() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(14)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseP15() {
        try {
            Desktop.getDesktop().open(new File(Files.readAllLines(Paths.get(path)).get(15)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void chooseExit() {
        System.exit(0);
    }

    @FXML
    public void giveName() {
        setName = name_field.getText();
        System.out.println(setName);

        if (setName.equals("p0")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);


        } else if (setName.equals("p1")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p2")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p3")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p4")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p5")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p6")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p7")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p8")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p9")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p10")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p11")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p12")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p13")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p14")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        } else if (setName.equals("p15")) {
            name_label.setText("enter your button name");
            name.setVisible(false);
            change.setVisible(true);

        }
    }

    @FXML
    public void giveName2() {
        setName2 = name_field.getText();
        if (setName.equals("p0")) {
            p0.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
            }

        } else if (setName.equals("p1")) {
            p1.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (setName.equals("p2")) {
            p2.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (setName.equals("p3")) {
            p3.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p4")) {
            p4.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p5")) {
            p5.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p6")) {
            p6.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p7")) {
            p7.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p8")) {
            p8.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p9")) {
            p9.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p10")) {
            p10.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p11")) {
            p11.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p12")) {
            p12.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p13")) {
            p13.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p14")) {
            p14.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (setName.equals("p15")) {
            p15.setText(setName2);
            name.setVisible(true);
            change.setVisible(false);
            name_label.setText("Enter current button name");

            try (FileWriter fw = new FileWriter(path2, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(setName2);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    @FXML
    public void loadNames() {
        try {
            String a = (Files.readAllLines(Paths.get(path2)).get(0));
            p0.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(1));
            p1.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(2));
            p2.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(3));
            p3.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(4));
            p4.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(5));
            p5.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(6));
            p6.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(7));
            p7.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(8));
            p8.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(9));
            p9.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(10));
            p10.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(11));
            p11.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(12));
            p12.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(13));
            p13.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(14));
            p14.setText(a);
            a = (Files.readAllLines(Paths.get(path2)).get(15));
            p15.setText(a);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @FXML
    public void clearFiles() {
        try {
            Files.delete(Paths.get(path2));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.delete(Paths.get(path1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.delete(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
