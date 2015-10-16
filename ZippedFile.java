package zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZippedFile implements Serializable {
    File file;
    String data;

    ZippedFile (File file) {
        this.file = file;
        if (file.isDirectory()) {
            data=null;
            return;
        }
        data = "";
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            while (fin.available()>0) {
                int len = fin.read(buffer);
                data += new String(buffer,0, len);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZippedFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ZippedFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(ZippedFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    void createFile (String path,File rootpath) throws FileNotFoundException {
        String newpath = path + "\\" + rootpath.getName() + file.getPath().substring(rootpath.getPath().length());
        if (file.isDirectory()) {
            new File(newpath).mkdir();
        }
        else {
            FileOutputStream fout = null;
            try {
                File newfile = new File(newpath);
                fout = new FileOutputStream(newfile);
                fout.write(data.getBytes());
            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException();
            } catch (IOException ex) {
                Logger.getLogger(ZippedFile.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fout.close();
                } catch (IOException ex) {
                    Logger.getLogger(ZippedFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
