package org.educa.dao;

import java.io.File;
import java.io.IOException;

public interface FileDAO {

    File[] listFiles(String directory);

    void rename(File file, String name);

    void insertIntoDataStreamFile(int numero, File file) throws IOException;

    void showDataStreamFile(File file);

    void insertTextIntoFile(File file, String text);

    void readTextInFile(File file, String text);

    long getIntegersInFile(File file) throws IOException;

    void updateIntegerInFile(int newNumber, int indice, File file) throws IOException;
}
