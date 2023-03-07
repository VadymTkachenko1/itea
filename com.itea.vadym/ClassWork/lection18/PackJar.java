package ClassWork.lection18;

import java.io.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {
    public static  final int BUFFER = 2_048;
    public static final String NOT_FOUND = "not found";
    private String jarFileName;

    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }

    public void pack(String dirname) throws FileNotFoundException {
        var dir = new File(dirname);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + NOT_FOUND);
        }
        var files = dir.listFiles();
        var listFilesToJar = new ArrayList<String>();
        for (var file : files) {
            if (!file.isDirectory()) {
                listFilesToJar.add(file.getPath());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(jarFileName);
            JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream)) {
            var buffer = new byte[BUFFER];
            jarOutputStream.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (var file : listFilesToJar) {
                jarOutputStream.putNextEntry(new JarEntry(file));
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    int len;
                    while ((len = fileInputStream.read(buffer)) > 0) {
                        jarOutputStream.closeEntry();
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("File not found: " + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument: " + e);
        } catch (IOException e) {
            System.err.println("Access error : " + e);
        }
    }
}
