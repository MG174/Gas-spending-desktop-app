
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SearchRecordsView extends javax.swing.JFrame {

    private BundleGarage bundleGarage;
    private String username;
            
            
    public SearchRecordsView() {
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
    }

    public BundleGarage getBundleGarage() {
        return bundleGarage;
    }

    public void setBundleGarage(BundleGarage bundleGarage) {
        this.bundleGarage = bundleGarage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void loader(){
        for (int i = 0; i < bundleGarage.getListaGarage().size(); i++) {
            if (bundleGarage.getListaGarage().get(i).getImieUser()==username) {
            for (int j = 0; j < bundleGarage.getListaGarage().get(i).getListaSamochodow().size(); j++) {
                jComboBox1.addItem(bundleGarage.getListaGarage().get(i).getListaSamochodow().get(j));
            }
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<Car>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Filtruj rekordy według czasu:");

        jButton1.setText("Wybierz datę");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Wybierz datę");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Od:");

        jLabel3.setText("Do:");

        jLabel4.setText("Filtruj rekordy według wartości:");

        jLabel5.setText("Wybierz samochód:");

        jLabel6.setText("Od:");

        jLabel7.setText("Do:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Wartość"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Usuń");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Usuń rekord według ID:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID:");

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jButton4.setText("Filtruj");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Zapisz sesję");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Powrót do menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Pokaż wszystkie rekordy");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Wszystkie rekordy sort. od najnowszych");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Wszystkie rekordy sort. od najstarszych");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(17, 17, 17)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(19, 19, 19)
                                            .addComponent(jButton2))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1)
                                                .addComponent(jTextField2)))
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField4))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addGap(8, 8, 8)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DatePickerClass dtc = new DatePickerClass();
        DateLabelFormatter dlf = new DateLabelFormatter();
        dtc.setVisible(true);
        dtc.setSize(300, 150);
        dtc.setLocationRelativeTo(null);
        dtc.setjTextField2(jTextField4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DatePickerClass dtc = new DatePickerClass();
        DateLabelFormatter dlf = new DateLabelFormatter();
        dtc.setVisible(true);
        dtc.setSize(300, 150);
        dtc.setLocationRelativeTo(null);
        dtc.setjTextField2(jTextField5);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        for (int i = 0; i < s.getListaID().size(); i++) {
            if (jTextField3.getText().equals(s.getListaID().get(i))) {
                s.getListaData().remove(i);
                s.getListaID().remove(i);
                s.getListaWartosc().remove(i);
                JOptionPane.showMessageDialog(this, "Usunięto rekord.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Nie znaleziono rekordu o podanym indeksie.");
                break;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        SimpleDateFormat formatter1=new SimpleDateFormat("mm/dd/yyyy");  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Date dataod = new Date();
        Date datado = new Date();
        Date dateCheck = new Date();
        double wartoscod = 0;
        double wartoscdo = 0;
        double wartoscCheck = 0;
        for (int i = 0; i < s.getListaID().size(); i++) {
            try {
                dateCheck = formatter1.parse(s.getListaData().get(i));
                wartoscCheck = Double.parseDouble(s.getListaWartosc().get(i));
                
                if (jTextField4.getText().equals("")) {
                    dataod.setTime(-30585523486000L);
                } else {dataod = formatter1.parse(jTextField4.getText());}
                
                if (jTextField5.getText().equals("")) {
                    datado.setTime(95642284514000L);
                } else {datado = formatter1.parse(jTextField5.getText());}
                
                if (jTextField1.getText().equals("")) {
                    wartoscod = 0;
                } else {wartoscod = Double.parseDouble(jTextField1.getText());}
                
                if (jTextField2.getText().equals("")) {
                    wartoscdo = 999999999;
                } else {wartoscdo = Double.parseDouble(jTextField2.getText());}
                
            } catch (ParseException ex) {
                Logger.getLogger(SearchRecordsView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (dateCheck.after(dataod) && dateCheck.before(datado) && wartoscCheck>=wartoscod && wartoscCheck<=wartoscdo) {
                String data1 = s.getListaID().get(i);
                String data2 = s.getListaData().get(i);
                String data3 = s.getListaWartosc().get(i);
                Object[] row = { data1, data2, data3 };
                model.addRow(row);
            } else if (dateCheck.equals(dataod) && dateCheck.equals(datado) && wartoscCheck>=wartoscod && wartoscCheck<=wartoscdo) {
                String data1 = s.getListaID().get(i);
                String data2 = s.getListaData().get(i);
                String data3 = s.getListaWartosc().get(i);
                Object[] row = { data1, data2, data3 };
                model.addRow(row);
            } else if (dateCheck.after(dataod) && dateCheck.equals(datado) && wartoscCheck>=wartoscod && wartoscCheck<=wartoscdo) {
                String data1 = s.getListaID().get(i);
                String data2 = s.getListaData().get(i);
                String data3 = s.getListaWartosc().get(i);
                Object[] row = { data1, data2, data3 };
                model.addRow(row);
            } else if (dateCheck.equals(dataod) && dateCheck.before(datado) && wartoscCheck>=wartoscod && wartoscCheck<=wartoscdo) {
                String data1 = s.getListaID().get(i);
                String data2 = s.getListaData().get(i);
                String data3 = s.getListaWartosc().get(i);
                Object[] row = { data1, data2, data3 };
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Saver saver = new Saver();
        try {
            saver.save(bundleGarage);
        } catch (IOException ex) {
            Logger.getLogger(AddRecordView.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuView menugui = new MenuView(username);
        menugui.setBundleGarage(bundleGarage);
        menugui.setUsername(username);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < s.getListaData().size(); i++) {
                    String data1 = s.getListaID().get(i);
                    String data2 = s.getListaData().get(i);
                    String data3 = s.getListaWartosc().get(i);
                    Object[] row = { data1, data2, data3 };
                    model.addRow(row);
                }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        String datePattern = "MM/dd/yyyy";
        String pattern = "M";
        SimpleDateFormat formatter1 = new SimpleDateFormat(datePattern);  
        DateFormat df = new SimpleDateFormat(pattern);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        //temporary object for sorting and counting purposes
        Car tempcar = new Car("tymczasowy");
        tempcar = s;
        //sorting arraylists
        for (int i = 0; i < tempcar.getListaID().size()-1; i++) {
            for (int j = 0; j < tempcar.getListaID().size()-i-1; j++) {
                try {
                    Date a = formatter1.parse(tempcar.getListaData().get(j));
                    Date b = formatter1.parse(tempcar.getListaData().get(j+1));
                    if (b.after(a)) {
                        String tempdate = tempcar.getListaData().get(j);
                        tempcar.getListaData().set(j, tempcar.getListaData().get(j+1));
                        tempcar.getListaData().set(j+1, tempdate);
                        
                        String tempwartosc = tempcar.getListaWartosc().get(j);
                        tempcar.getListaWartosc().set(j, tempcar.getListaWartosc().get(j+1));
                        tempcar.getListaWartosc().set(j+1, tempwartosc);
                        
                        String tempid = tempcar.getListaID().get(j);
                        tempcar.getListaID().set(j, tempcar.getListaID().get(j+1));
                        tempcar.getListaID().set(j+1, tempid);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         for (int i = 0; i < tempcar.getListaID().size(); i++) {
            String data1 = s.getListaID().get(i);
            String data2 = s.getListaData().get(i);
            String data3 = s.getListaWartosc().get(i);
            Object[] row = { data1, data2, data3 };
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        String datePattern = "MM/dd/yyyy";
        String pattern = "M";
        SimpleDateFormat formatter1 = new SimpleDateFormat(datePattern);  
        DateFormat df = new SimpleDateFormat(pattern);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        //temporary object for sorting and counting purposes
        Car tempcar = new Car("tymczasowy");
        tempcar = s;
        //sorting arraylists
        for (int i = 0; i < tempcar.getListaID().size()-1; i++) {
            for (int j = 0; j < tempcar.getListaID().size()-i-1; j++) {
                try {
                    Date a = formatter1.parse(tempcar.getListaData().get(j));
                    Date b = formatter1.parse(tempcar.getListaData().get(j+1));
                    if (a.after(b)) {
                        String tempdate = tempcar.getListaData().get(j);
                        tempcar.getListaData().set(j, tempcar.getListaData().get(j+1));
                        tempcar.getListaData().set(j+1, tempdate);
                        
                        String tempwartosc = tempcar.getListaWartosc().get(j);
                        tempcar.getListaWartosc().set(j, tempcar.getListaWartosc().get(j+1));
                        tempcar.getListaWartosc().set(j+1, tempwartosc);
                        
                        String tempid = tempcar.getListaID().get(j);
                        tempcar.getListaID().set(j, tempcar.getListaID().get(j+1));
                        tempcar.getListaID().set(j+1, tempid);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         for (int i = 0; i < tempcar.getListaID().size(); i++) {
            String data1 = s.getListaID().get(i);
            String data2 = s.getListaData().get(i);
            String data3 = s.getListaWartosc().get(i);
            Object[] row = { data1, data2, data3 };
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchRecordsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecordsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecordsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecordsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecordsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<Car> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
