package gourmetpizzaapplication;

import gourmetpizzaapplication.GourmetPizzaGUI;
import java.io.*;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author merhawit
 */
public class Orders extends javax.swing.JFrame {

    private int orderNo = 1;
    private int numberOfFiles;

    /**
     * Creates new form Orders
     */
    public Orders() {
        initComponents();
        //numberOfFiles();
        //orderNo = numberOfFiles;
        setFields();
        nameField.setEnabled(false);
        addressField.setEnabled(false);
        mobileField.setEnabled(false);
        postcodeField.setEnabled(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        orderNoInc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        summaryArea = new java.awt.TextArea();
        deleteButton = new javax.swing.JButton();
        firstButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        lastButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        postcodeLabel = new javax.swing.JLabel();
        postcodeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 30)); // NOI18N
        jLabel2.setText("Order Details");

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 60)); // NOI18N
        jLabel1.setText("Gourmet Pizza");

        jLabel7.setText("Order No.");

        orderNoInc.setFont(new java.awt.Font("Trattatello", 0, 18)); // NOI18N
        orderNoInc.setText("1");

        jLabel3.setText("Address");

        addressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFieldaddressFocusLost(evt);
            }
        });
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldnameFocusLost(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Contact Name ");

        jLabel5.setText("Mobile Number");

        mobileField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileFieldMobileNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileFieldmNFocusLost(evt);
            }
        });
        mobileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileFieldActionPerformed(evt);
            }
        });

        summaryArea.setBackground(new java.awt.Color(255, 255, 255));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        firstButton.setText("First");
        firstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        lastButton.setText("Last");
        lastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastButtonActionPerformed(evt);
            }
        });

        mainButton.setText("Main");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });

        postcodeLabel.setText("Postcode");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(mainButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(377, 377, 377))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel2)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderNoInc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(postcodeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(firstButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(prevButton)
                            .addGap(86, 86, 86)
                            .addComponent(nextButton)
                            .addGap(78, 78, 78)
                            .addComponent(lastButton)
                            .addGap(152, 152, 152))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(summaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(159, 159, 159)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(orderNoInc))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeLabel)
                    .addComponent(postcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(summaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstButton)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(lastButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(mainButton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressFieldaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldaddressFocusLost
        // TODO add your handling code here:
        //        if (addressField.getText().length() > 5) {
        //            invalid2Label.setVisible(false);
        //        } else {
        //            invalid2Label.setForeground(Color.RED);
        //            invalid2Label.setVisible(true);
        //        }
    }//GEN-LAST:event_addressFieldaddressFocusLost
    private void setFields() {
        numberOfFiles();
        FileReader fr = null;
        try {
            //open the file
            File f = new File("Order" + String.valueOf(orderNo + ".txt"));
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            //get the data
            //String orderNumber = br.readLine();
            String line = br.readLine();
            //put into textfield e.g. nameField

            //put into textfield e.g. nameField
            while (line != null) {
                if (line.startsWith("Order Number: ")) {
                    orderNoInc.setText(line.substring(13));
                }
                if (line.startsWith("Name: ")) {

                    nameField.setText(line.substring(6));
                }
                if (line.startsWith("Address: ")) {
                    addressField.setText(line.substring(9));
                }
                if (line.startsWith("Mobile No.: ")) {
                    mobileField.setText(line.substring(12));
                }
                if (line.startsWith("Postcode: ")) {
                    postcodeField.setText(line.substring(10));
                }
                if (line.startsWith("Size: ")) {
                    while (line != null) {
                       
                        summaryArea.append(line + "\r\n");
                        line = br.readLine();
                    }
                }
                
                
                line = br.readLine();

            }

            //close the file
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void nameFieldnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldnameFocusLost
        //TODO add your handling code here:
    }//GEN-LAST:event_nameFieldnameFocusLost
    private void numberOfFiles() {
        //File dir = new File("\\GourmetPizzaApplication");
        File dir = new File(Paths.get(".").toAbsolutePath().toString());
        File all[] = dir.listFiles((File dir1, String filename) -> filename.endsWith(".txt"));
        numberOfFiles = all.length;
        //orderNo = numberOfFiles;

        //return all.length;
    }
    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
//        FileReader fr = null;
//        try {
//            // TODO add your handling code here:
//            File f = new File("FileName.txt");
//            fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//            //get the data
//            String orderNumber = br.readLine();
//            String line = br.readLine();
//            //put into textfield e.g. nameField
//            while(line!= null){
//                if(orderNumber.startsWith("Order Number: "))
//                {
//                    orderNoInc.setText(orderNumber.substring(13,17));
//                }
//                if(line.startsWith("Name: "))
//                {
//                    
//                    nameField.setText(line.substring(7,40)) ;
//                }
//                line=br.readLine();
//            }
//            //close the file
//            br.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_nameFieldActionPerformed

    private void mobileFieldMobileNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFieldMobileNoFocusGained
        // TODO add your handling code here:
        //        mobileHintLabel.setVisible(true);
    }//GEN-LAST:event_mobileFieldMobileNoFocusGained

    private void mobileFieldmNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFieldmNFocusLost
        // TODO add your handling code here:
        //
        //        if (mobileField.getText().matches("^(((\\+44\\s?\\d{4}|\\(?0\\d{4}\\)?)\\s?\\d{3}\\s?\\d{3})|((\\+44\\s?\\d{3}|\\(?0\\d{3}\\)?)\\s?\\d{3}\\s?\\d{4})|((\\+44\\s?\\d{2}|\\(?0\\d{2}\\)?)\\s?\\d{4}\\s?\\d{4}))(\\s?\\#(\\d{4}|\\d{3}))?$")) {
        //            invalid3Label.setVisible(false);
        //        } else {
        //            invalid3Label.setForeground(Color.RED);
        //            invalid3Label.setVisible(true);
        //        }
    }//GEN-LAST:event_mobileFieldmNFocusLost

    private void mobileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            //setEmptyString();
            FileWriter fw = null;
            File f = new File("Order" + String.valueOf(orderNo) + ".txt");
            fw = new FileWriter(f);
            nameField.setText("");
            addressField.setText("");
            mobileField.setText("");
            summaryArea.setText("");
        } catch (IOException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void firstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstButtonActionPerformed
        summaryArea.setText("");
        FileReader fr = null;
        try {
            orderNo = 1;
            //open the file
            File f = new File("Order" + String.valueOf(orderNo + ".txt"));
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            //get the data
            //String orderNumber = br.readLine();
            String line = br.readLine();
            //put into textfield e.g. nameField

            //put into textfield e.g. nameField
            while (line != null) {
                if (line.startsWith("Order Number: ")) {
                    orderNoInc.setText(line.substring(13));
                }
                if (line.startsWith("Name: ")) {

                    nameField.setText(line.substring(6));
                }
                if (line.startsWith("Address: ")) {
                    addressField.setText(line.substring(9));
                }
                if (line.startsWith("Mobile No.: ")) {
                    mobileField.setText(line.substring(12));
                }
                if (line.startsWith("Size: ")) {
                    while (line != null) {
                        summaryArea.append(line + "\r\n");
                        line = br.readLine();
                    }
                }
                line = br.readLine();

            }

            //close the file
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_firstButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        //decrement the current contact to the one before the index
        if (orderNo <= 1) {
            JOptionPane.showMessageDialog(this, "There is no previous record");
        } else {
            setEmptyString();

            FileReader fr = null;
            try {
                orderNo--;
                //open the file
                File f = new File("Order" + String.valueOf(orderNo + ".txt"));
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                //get the data
                //String orderNumber = br.readLine();
                String line = br.readLine();
                //put into textfield e.g. nameField

                //put into textfield e.g. nameField
                while (line != null) {
                    if (line.startsWith("Order Number: ")) {
                        orderNoInc.setText(line.substring(13));
                    }
                    if (line.startsWith("Name: ")) {

                        nameField.setText(line.substring(6));
                    }
                    if (line.startsWith("Address: ")) {
                        addressField.setText(line.substring(9));
                    }
                    if (line.startsWith("Mobile No.: ")) {
                        mobileField.setText(line.substring(12));
                    }
                    if(line.startsWith("postcode: ")){
                        postcodeField.setText(line.substring(11));
                    }
                    if (line.startsWith("Size: ")) {
                        while (line != null) {
                            summaryArea.append(line + "\r\n");
                            line = br.readLine();
                        }
                    }
                    line = br.readLine();

                }

                //close the file
                br.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //What could go wrong here? Fix it!
    }//GEN-LAST:event_prevButtonActionPerformed
    private void setEmptyString() {
        nameField.setText("");
        addressField.setText("");
        mobileField.setText("");
        summaryArea.setText("");
    }
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // set the current contact to the one after the index
        if (orderNo < numberOfFiles) {
            setEmptyString();
            FileReader fr = null;
            try {
                orderNo++;
                orderNoInc.setText(String.valueOf(orderNo));
                //open the file
                File f = new File("Order" + String.valueOf(orderNo + ".txt"));
                fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                //get the data
                //String orderNumber = br.readLine();
                String line = br.readLine();
                //put into textfield e.g. nameField

                //put into textfield e.g. nameField
                while (line != null) {
                    if (line.startsWith("Order Number: ")) {
                        orderNoInc.setText(line.substring(13));
                    }
                    if (line.startsWith("Name: ")) {

                        nameField.setText(line.substring(6));
                    }
                    if (line.startsWith("Address: ")) {
                        addressField.setText(line.substring(9));
                    }
                    if (line.startsWith("Mobile No.: ")) {
                        mobileField.setText(line.substring(12));
                    }
                    if (line.startsWith("Size: ")) {
                        while (line != null) {
                            summaryArea.append(line + "\r\n");
                            line = br.readLine();
                        }
                    }
                    line = br.readLine();

                }

                //close the file
                br.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No more Orders");
        }

        //What could go wrong here? Fix it!
    }//GEN-LAST:event_nextButtonActionPerformed

    private void lastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastButtonActionPerformed
        // index of the last contact is the number of entries - 1
        orderNo = numberOfFiles;
        setEmptyString();
        FileReader fr = null;
        try {

            //open the file
            File f = new File("Order" + String.valueOf(orderNo + ".txt"));
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            //get the data
            //String orderNumber = br.readLine();
            String line = br.readLine();
            //put into textfield e.g. nameField

            //put into textfield e.g. nameField
            while (line != null) {
                if (line.startsWith("Order Number: ")) {
                    orderNoInc.setText(line.substring(13));
                }
                if (line.startsWith("Name: ")) {

                    nameField.setText(line.substring(6));
                }
                if (line.startsWith("Address: ")) {
                    addressField.setText(line.substring(9));
                }
                if (line.startsWith("Mobile No.: ")) {
                    mobileField.setText(line.substring(12));
                }
                if (line.startsWith("Size: ")) {
                    while (line != null) {
                        summaryArea.append(line + "\r\n");
                        line = br.readLine();
                    }
                }
                line = br.readLine();

            }

            //close the file
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //set the current contact to the last index we just found
        //setCurrentContactTo(lastIndex);
    }//GEN-LAST:event_lastButtonActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new WelcomePage().setVisible(true);
        
        
    }//GEN-LAST:event_mainButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton firstButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lastButton;
    private javax.swing.JButton mainButton;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel orderNoInc;
    private javax.swing.JTextField postcodeField;
    private javax.swing.JLabel postcodeLabel;
    private javax.swing.JButton prevButton;
    private java.awt.TextArea summaryArea;
    // End of variables declaration//GEN-END:variables
}
