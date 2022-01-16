package edu.ib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFileHandler extends ConsoleHandler {

    private static String filename;

    public SaveToFileHandler(String filename) {
        this.filename = filename;
    }


    public void writeFile()
            throws IOException
    {
        File file = new File (filename);
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < getNumberOfPoints(); i++) {
            out.write(getTValue(i) + "\t" + getXValue(i) + "\n");
        }
        out.close();
    }
}