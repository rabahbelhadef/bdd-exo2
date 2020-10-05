package cnam.bdd;

import java.io.IOException;

public class Main {

    private static String outputFile = System.getProperty("java.io.tmpdir") + "/users.csv";

    public static void main(String[] args) throws IOException {
        getAndSaveAllUsersIntoCSVFile(outputFile) ;
    }

    private static void getAndSaveAllUsersIntoCSVFile(String outputFile) {
        //TODO : implement me !
    }
}
