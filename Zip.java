package zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zip implements Serializable {
    ArrayList<ZippedFile> files = new ArrayList<ZippedFile>();
    File rootFile;

    Zip (File file) {
        if (file.isDirectory()) {
            rootFile = file;
            readFiles(file);
        }
    }

    private void readFiles(File file) {
        files.add(new ZippedFile(file));
        if (file.isDirectory()) {
            for (File subfile : file.listFiles())
                readFiles(subfile);            
        }
    }

    void extractTo(File location) throws FileNotFoundException, FileExistsException {
        if (new File(location.getPath()+rootFile.getName()).exists())
            throw new FileExistsException();
        for (ZippedFile zfile : files) {
            zfile.createFile(location.getPath(),rootFile);
        }
    }

    void archive (File file) throws FileNotFoundException, FileExistsException {
        archive (file,false);
        
    }

    void archive (File file,boolean force) throws FileNotFoundException, FileExistsException {
        File zfile = new File(file.getPath()+rootFile.getName() + ".jzip");
        if (zfile.exists() && (force==false))
            throw new FileExistsException();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(zfile));
            out.writeObject(this);
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException();
        } catch (IOException ex) {
            Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return;
    }

    public static Zip readJZip (File path) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(path));
            return (Zip) in.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Zip.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
//
//    public static void main(String[] args) {
//        File file = new File("E:\\folder");
//        Zip zip = new Zip(file);
//        zip.archive(new File("E:\\"));
//        zip.extractTo("E:\\folder1");
//        Zip zip1 = Zip.readZipp("E:\\folder.zipp");
//        zip1.extractTo("E:\\folder2");
//    }
}
