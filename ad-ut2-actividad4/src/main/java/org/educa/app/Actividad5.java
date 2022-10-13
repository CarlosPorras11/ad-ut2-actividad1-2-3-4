package org.educa.app;

import org.educa.service.FileService;

public class Actividad5 {

    private static final String PATH = "C:\\Documentos\\Actividad5\\enteros.dat";

    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.modifyIntegerInDataStreamFile(PATH);
    }
}
