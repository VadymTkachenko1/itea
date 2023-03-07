package ClassWork.lection18;

import java.io.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnPackJar {
    private File destFile;
    public final static int BUFFER = 2_048;

    public void unPack(String destinationDirectory, String nameJar) {
        var sourceJarFile = new File(nameJar);
        try (JarFile jarFile = new JarFile(sourceJarFile)) {
            var unzipDir = new File(destinationDirectory);
            var jarFileEntries = jarFile.entries();
            while (jarFileEntries.hasMoreElements()) {
                JarEntry entry = jarFileEntries.nextElement();
                var entryName = entry.getName();
                System.out.println("Extracting: " + entry);
                destFile = new File(unzipDir, entryName);
                File destinationParent = destFile.getParentFile();
                destinationParent.mkdirs();
                if (!entry.isDirectory()) {
                    writeFile(jarFile, entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(JarFile jarFile, JarEntry jarEntry) {
        int currentByte;
        var data = new byte [BUFFER];
        try (BufferedInputStream is = new BufferedInputStream(jarFile.getInputStream(jarEntry));
            var fos = new FileOutputStream(destFile);
            var dest = new BufferedOutputStream(fos, BUFFER)) {
            while ((currentByte = is.read(data, 0, BUFFER)) > 0) {
                dest.write(data, 0, currentByte);
            }
            dest.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
