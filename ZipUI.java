package zip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ZipUI extends javax.swing.JFrame {

    public ZipUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        chooseFolder = new javax.swing.JButton();
        zipPassword = new javax.swing.JTextField();
        zipp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chooseLocation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chooseZip = new javax.swing.JButton();
        unzip = new javax.swing.JButton();
        unzipPassword = new javax.swing.JTextField();
        chooseLocation1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        toZipFolder = new javax.swing.JLabel();
        toZipLocation = new javax.swing.JLabel();
        toUnZipFolder = new javax.swing.JLabel();
        toUnZipLocation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Folder to be zipped : ");

        chooseFolder.setText("Choose Folder");
        chooseFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFolderActionPerformed(evt);
            }
        });

        zipPassword.setText("password");

        zipp.setText("JZip Folder");
        zipp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zip(evt);
            }
        });

        jLabel2.setText("JZip in :");

        chooseLocation.setText("Choose Location");
        chooseLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLocationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("JZip");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Unzip");

        jLabel5.setText("JZip file :");

        chooseZip.setText("Choose JZip FIle");
        chooseZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseZipActionPerformed(evt);
            }
        });

        unzip.setText("UnZip JZip");
        unzip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unzip(evt);
            }
        });

        unzipPassword.setText("password");

        chooseLocation1.setText("Choose Location");
        chooseLocation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLocation1ActionPerformed(evt);
            }
        });

        jLabel6.setText("UnZip in :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(539, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(525, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel5)
                .addGap(147, 147, 147)
                .addComponent(toUnZipFolder)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooseFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toZipLocation)
                    .addComponent(toZipFolder))
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(zipPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(zipp)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(unzipPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(unzip)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(toUnZipLocation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chooseLocation1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chooseZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFolder)
                    .addComponent(jLabel1)
                    .addComponent(toZipFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseLocation)
                    .addComponent(jLabel2)
                    .addComponent(toZipLocation))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipp))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(toUnZipFolder))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(chooseZip)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(toUnZipLocation)
                    .addComponent(chooseLocation1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unzipPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unzip))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFolderActionPerformed
        // TODO add your handling code here:
        toZipFolder.setText(chooseFolder());
    }//GEN-LAST:event_chooseFolderActionPerformed

    private void chooseLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLocationActionPerformed
        // TODO add your handling code here:
        toZipLocation.setText(chooseFolder());
    }//GEN-LAST:event_chooseLocationActionPerformed

    private void chooseZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseZipActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("E:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JZip File", "jzip");
        fc.addChoosableFileFilter(filter);
        fc.setDialogTitle("Choose JZip File");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
            toUnZipFolder.setText(fc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_chooseZipActionPerformed

    private void chooseLocation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLocation1ActionPerformed
        // TODO add your handling code here:
        toUnZipLocation.setText(chooseFolder());
    }//GEN-LAST:event_chooseLocation1ActionPerformed

    private void zip(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zip
        try {
            // TODO add your handling code here:
            File file = new File(toZipFolder.getText());
            Zip zip = new Zip(file);
            zip.archive(new File(toZipLocation.getText()));
            if (file.exists())
                JOptionPane.showMessageDialog(this, "JZip Created");
            else
                throw new FileNotFoundException();
        } catch (FileExistsException ex) {
            JOptionPane.showMessageDialog(this, "File already exists");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Access denied");
        }
    }//GEN-LAST:event_zip

    private void unzip(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unzip
        try {
            // TODO add your handling code here:
            File file = new File(toUnZipFolder.getText());
            Zip zip = Zip.readJZip(file);
            zip.extractTo(new File(toUnZipLocation.getText()));
            if (file.exists())
                JOptionPane.showMessageDialog(this, "Folder Created");
            else
                throw new FileNotFoundException();
        } catch (FileExistsException ex) {
            JOptionPane.showMessageDialog(this, "Folder already exists");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Access denied");
        }
    }//GEN-LAST:event_unzip

    private static String chooseFolder() {
        JFileChooser fc = new JFileChooser("E:\\");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
            return fc.getSelectedFile().getPath();
        else
            return null;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZipUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFolder;
    private javax.swing.JButton chooseLocation;
    private javax.swing.JButton chooseLocation1;
    private javax.swing.JButton chooseZip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel toUnZipFolder;
    private javax.swing.JLabel toUnZipLocation;
    private javax.swing.JLabel toZipFolder;
    private javax.swing.JLabel toZipLocation;
    private javax.swing.JButton unzip;
    private javax.swing.JTextField unzipPassword;
    private javax.swing.JTextField zipPassword;
    private javax.swing.JButton zipp;
    // End of variables declaration//GEN-END:variables
//    private File toZipFolder;
//    private File toZipLocation;
//    private File toUnZipFolder;
//    private File toUnZipLocation;
}
