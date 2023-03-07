package ClassWork.lection18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        var fp = new File("Test.java");

        if (fp.exists()) {
            System.out.println("File " + fp.getName() + " - exists");

            if (fp.isFile()) {
                System.out.println("Path to file: \t" + fp.getPath());
                System.out.println("Absolute path to file: \t" + fp.getAbsolutePath());

                System.out.println("File size: \t" + fp.length());
                System.out.println("Last modified: \t" + new Date(fp.lastModified()));

                System.out.println("Can read: \t" + fp.canRead());
                System.out.println("Can write: \t" + fp.canWrite());
                System.out.println("Can execute: \t" + fp.canExecute());
                System.out.println("File deleted: \t" + fp.delete());
            }
        } else {
            System.out.println("File " + fp.getName() + " does not exist");
        }

        try {
            if (fp.createNewFile()) {
                System.out.println("File " + fp.getName() + " created");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        var dir = new File("com.itea.vadym/ClassWork/lection18");

        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Directory " + fp.getName() + " - exists");
            var files = dir.listFiles();
            for (var file : files) {
                var date = new Date(file.lastModified());
                System.out.println("\n" + file.getPath() + "\t |" + file.length() + "\t |" + date);
            }
        }

        var roots = File.listRoots();
        if (roots != null) {
            for (var root : roots) {
                System.out.printf("\n | %s | %d | from | %d | free |" ,
                        root.getPath(), root.getUsableSpace(), root.getTotalSpace());
            }
        } else {
            System.out.println("There are no roots");
        }
    }
}
