import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.txt");

        boolean done = false;
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int YOB = 0;

        do {
            ID = SafeInput.getNonZeroLenString(in,"Enter the ID [6 digits]: ");
            firstName = SafeInput.getNonZeroLenString(in,"Enter the First Name: ");
            lastName = SafeInput.getNonZeroLenString(in,"Enter the Last Name: ");
            title = SafeInput.getNonZeroLenString(in,"Enter the Title: ");
            YOB = SafeInput.getRangedInt(in, "Enter the Year of Birth", 1000, 9999);

            String personRec = String.format("%s, %s, %s, %s, %d",  ID, firstName, lastName, title, YOB);
            people.add(personRec);

            done = SafeInput.getYNConfirm(in, "Are you done?");
        } while(!done);

        for (String p: people)
            System.out.println(p);

        try {
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            for (String rec : people){
                writer.write(rec, 0, rec.length());
                writer.newLine();
                }
            writer.close();
            System.out.println("Data file written!" + file.toString());
        }
        catch (IOException e){
            e.printStackTrace();;
        }



    }
}