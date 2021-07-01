
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DataAnalysisView extends javax.swing.JFrame {

    private BundleGarage bundleGarage;
    private String username;
    private List<Double> daneWykres = new ArrayList<Double>();
    private List<String> daneCzas = new ArrayList<String>();
    
    public DataAnalysisView() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
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

        jComboBox1 = new javax.swing.JComboBox<Car>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wybierz auto:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Okres czasu", "Suma", "Średnia", "Wartość maksymalna", "Wartość minimalna", "Wykres?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName(""); // NOI18N
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jButton1.setText("Według miesiąca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Oblicz wartości:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);

        jButton3.setText("Data od");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Data do");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Oblicz dla podanego przedziału czasu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Według podanego okresu czasu:");

        jButton6.setText("Powrót do menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Według roku");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("Moduł \"Analiza danych\"");

        jButton2.setText("Generuj wykres");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("Wyczyść");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Wyczyść");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Wyczyść tabelę");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        /* for (int i = 0; i < tempcar.getListaID().size(); i++) {
            String data1 = s.getListaID().get(i);
            String data2 = s.getListaData().get(i);
            String data3 = s.getListaWartosc().get(i);
            Object[] row = { data1, data2, data3 };
            model.addRow(row);
        } */
    
        Date month_const = new Date();
        Date month_check = new Date();
        Date year_const = new Date();
        Date year_check = new Date();

        Double suma = 0.0;
        Double avg = 0.0;
        Double num_for_avg = 0.0;
        Double min = Double.parseDouble(tempcar.getListaWartosc().get(0));
        Double max = Double.parseDouble(tempcar.getListaWartosc().get(0));
        
        String pattern1 = "MM";
        String pattern2 = "Y";
        DateFormat df1 = new SimpleDateFormat(pattern1);
        DateFormat df2 = new SimpleDateFormat(pattern2);
        try {
            month_const = formatter1.parse(tempcar.getListaData().get(0));
            year_const = formatter1.parse(tempcar.getListaData().get(0));
        } catch (ParseException ex) {
            Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String string_month_const = df1.format(month_const);
        String string_month_check = "";
        String string_year_const = df2.format(year_const);
        String string_year_check = "";
        
        System.out.println(string_month_const);
        System.out.println(string_year_const);

        for (int i = 0; i < tempcar.getListaData().size(); i++) {
            try {
            month_check = formatter1.parse(tempcar.getListaData().get(i));
            string_month_check = df1.format(month_check);
            year_check = formatter1.parse(tempcar.getListaData().get(i));
            string_year_check = df2.format(year_check);
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            if (string_month_const.equals(string_month_check) && string_year_const.equals(string_year_check)) {
                suma = suma + Double.parseDouble(tempcar.getListaWartosc().get(i));
                avg = avg + Double.parseDouble(tempcar.getListaWartosc().get(i));
                num_for_avg++;
                if (Double.parseDouble(tempcar.getListaWartosc().get(i))>max) {
                    max = Double.parseDouble(tempcar.getListaWartosc().get(i));
                } else if (Double.parseDouble(tempcar.getListaWartosc().get(i))<min) {
                    min = Double.parseDouble(tempcar.getListaWartosc().get(i));
                }
            } else {
                avg = suma/num_for_avg;
                String data1 = string_month_const + "/" + string_year_const;
                String data2 = suma.toString();
                String data3 = avg.toString();
                String data4 = max.toString();
                String data5 = min.toString();
                Object[] row = { data1, data2, data3, data4, data5 };
                model.addRow(row);
                num_for_avg = 1.0;
                suma = Double.parseDouble(tempcar.getListaWartosc().get(i));
                avg = Double.parseDouble(tempcar.getListaWartosc().get(i));
                try {
                    month_const = formatter1.parse(tempcar.getListaData().get(i));
                    string_month_const = df1.format(month_const);
                    year_const = formatter1.parse(tempcar.getListaData().get(i));
                    string_year_const = df2.format(year_const);
                    min = Double.parseDouble(tempcar.getListaWartosc().get(i));
                    max = Double.parseDouble(tempcar.getListaWartosc().get(i));
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
                avg = suma/num_for_avg;
                String data1 = string_month_const + "/" + string_year_const;
                String data2 = suma.toString();
                String data3 = avg.toString();
                String data4 = max.toString();
                String data5 = min.toString();
                Object[] row = { data1, data2, data3, data4, data5 };
                model.addRow(row); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Car s = (Car)jComboBox1.getSelectedItem();
        Car temporarycar = new Car();
        SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //model.setRowCount(0);
        Date dataod = new Date();
        Date datado = new Date();
        Date dateCheck = new Date();

        for (int i = 0; i < s.getListaID().size(); i++) {
            try {
                dateCheck = formatter1.parse(s.getListaData().get(i));
                
                if (jTextField1.getText().equals("")) {
                    dataod.setTime(-30585523486000L);
                } else {dataod = formatter1.parse(jTextField1.getText());}
                
                if (jTextField2.getText().equals("")) {
                    datado.setTime(95642284514000L);
                } else {datado = formatter1.parse(jTextField2.getText());}
                
            } catch (ParseException ex) {
                Logger.getLogger(SearchRecordsView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (dateCheck.after(dataod) && dateCheck.before(datado)) {
                temporarycar.addListaData(s.getListaData().get(i));
                temporarycar.addListaID(s.getListaID().get(i));
                temporarycar.addListaWartosc(s.getListaWartosc().get(i));
            } else if (dateCheck.equals(dataod) && dateCheck.equals(datado)) {
                temporarycar.addListaData(s.getListaData().get(i));
                temporarycar.addListaID(s.getListaID().get(i));
                temporarycar.addListaWartosc(s.getListaWartosc().get(i));
            } else if (dateCheck.after(dataod) && dateCheck.equals(datado)) {
                temporarycar.addListaData(s.getListaData().get(i));
                temporarycar.addListaID(s.getListaID().get(i));
                temporarycar.addListaWartosc(s.getListaWartosc().get(i));
            } else if (dateCheck.equals(dataod) && dateCheck.before(datado)) {
                temporarycar.addListaData(s.getListaData().get(i));
                temporarycar.addListaID(s.getListaID().get(i));
                temporarycar.addListaWartosc(s.getListaWartosc().get(i));
            }
        }
        
        String pattern = "M"; 
        DateFormat df = new SimpleDateFormat(pattern);
        
        //temporary object for sorting and counting purposes
        //sorting arraylists
        for (int i = 0; i < temporarycar.getListaID().size()-1; i++) {
            for (int j = 0; j < temporarycar.getListaID().size()-i-1; j++) {
                try {
                    Date a = formatter1.parse(temporarycar.getListaData().get(j));
                    Date b = formatter1.parse(temporarycar.getListaData().get(j+1));
                    if (b.after(a)) {
                        String tempdate = temporarycar.getListaData().get(j);
                        temporarycar.getListaData().set(j, temporarycar.getListaData().get(j+1));
                        temporarycar.getListaData().set(j+1, tempdate);
                        
                        String tempwartosc = temporarycar.getListaWartosc().get(j);
                        temporarycar.getListaWartosc().set(j, temporarycar.getListaWartosc().get(j+1));
                        temporarycar.getListaWartosc().set(j+1, tempwartosc);
                        
                        String tempid = temporarycar.getListaID().get(j);
                        temporarycar.getListaID().set(j, temporarycar.getListaID().get(j+1));
                        temporarycar.getListaID().set(j+1, tempid);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        /* for (int i = 0; i < tempcar.getListaID().size(); i++) {
            String data1 = s.getListaID().get(i);
            String data2 = s.getListaData().get(i);
            String data3 = s.getListaWartosc().get(i);
            Object[] row = { data1, data2, data3 };
            model.addRow(row);
        } */

        Double suma = 0.0;
        Double avg = 0.0;
        Double num_for_avg = 0.0;
        Double min = Double.parseDouble(temporarycar.getListaWartosc().get(0));
        Double max = Double.parseDouble(temporarycar.getListaWartosc().get(0));
        
        String pattern1 = "MM";
        String pattern2 = "Y";
        DateFormat df1 = new SimpleDateFormat(pattern1);
        DateFormat df2 = new SimpleDateFormat(pattern2);


        for (int i = 0; i < temporarycar.getListaData().size(); i++) {
                suma = suma + Double.parseDouble(temporarycar.getListaWartosc().get(i));
                avg = avg + Double.parseDouble(temporarycar.getListaWartosc().get(i));
                num_for_avg++;
                if (Double.parseDouble(temporarycar.getListaWartosc().get(i))>max) {
                    max = Double.parseDouble(temporarycar.getListaWartosc().get(i));
                } else if (Double.parseDouble(temporarycar.getListaWartosc().get(i))<min) {
                    min = Double.parseDouble(temporarycar.getListaWartosc().get(i));
                }

            }
                avg = suma/num_for_avg;
                String data1 = formatter1.format(dataod) + "- " +  formatter1.format(datado);
                String data2 = suma.toString();
                String data3 = avg.toString();
                String data4 = max.toString();
                String data5 = min.toString();
                Object[] row = { data1, data2, data3, data4, data5 };
                model.addRow(row);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DatePickerClass dtc = new DatePickerClass();
        DateLabelFormatter dlf = new DateLabelFormatter();
        dtc.setVisible(true);
        dtc.setSize(300, 150);
        dtc.setLocationRelativeTo(null);
        dtc.setjTextField2(jTextField1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuView mg = new MenuView(username);
        mg.setBundleGarage(bundleGarage);
        mg.setUsername(username);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DatePickerClass dtc = new DatePickerClass();
        DateLabelFormatter dlf = new DateLabelFormatter();
        dtc.setVisible(true);
        dtc.setSize(300, 150);
        dtc.setLocationRelativeTo(null);
        dtc.setjTextField2(jTextField2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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
        /* for (int i = 0; i < tempcar.getListaID().size(); i++) {
            String data1 = s.getListaID().get(i);
            String data2 = s.getListaData().get(i);
            String data3 = s.getListaWartosc().get(i);
            Object[] row = { data1, data2, data3 };
            model.addRow(row);
        } */
    
        Date month_const = new Date();
        Date month_check = new Date();
        Date year_const = new Date();
        Date year_check = new Date();

        Double suma = 0.0;
        Double avg = 0.0;
        Double num_for_avg = 0.0;
        Double min = Double.parseDouble(tempcar.getListaWartosc().get(0));
        Double max = Double.parseDouble(tempcar.getListaWartosc().get(0));
        
        String pattern1 = "MM";
        String pattern2 = "Y";
        DateFormat df1 = new SimpleDateFormat(pattern1);
        DateFormat df2 = new SimpleDateFormat(pattern2);
        try {
            month_const = formatter1.parse(tempcar.getListaData().get(0));
            year_const = formatter1.parse(tempcar.getListaData().get(0));
        } catch (ParseException ex) {
            Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String string_month_const = df1.format(month_const);
        String string_month_check = "";
        String string_year_const = df2.format(year_const);
        String string_year_check = "";
        
        System.out.println(string_month_const);
        System.out.println(string_year_const);

        for (int i = 0; i < tempcar.getListaData().size(); i++) {
            try {
            month_check = formatter1.parse(tempcar.getListaData().get(i));
            string_month_check = df1.format(month_check);
            year_check = formatter1.parse(tempcar.getListaData().get(i));
            string_year_check = df2.format(year_check);
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            if (string_year_const.equals(string_year_check)) {
                suma = suma + Double.parseDouble(tempcar.getListaWartosc().get(i));
                avg = avg + Double.parseDouble(tempcar.getListaWartosc().get(i));
                num_for_avg++;
                if (Double.parseDouble(tempcar.getListaWartosc().get(i))>max) {
                    max = Double.parseDouble(tempcar.getListaWartosc().get(i));
                } else if (Double.parseDouble(tempcar.getListaWartosc().get(i))<min) {
                    min = Double.parseDouble(tempcar.getListaWartosc().get(i));
                }
            } else {
                avg = suma/num_for_avg;
                String data1 = string_year_const;
                String data2 = suma.toString();
                String data3 = avg.toString();
                String data4 = max.toString();
                String data5 = min.toString();
                Object[] row = { data1, data2, data3, data4, data5 };
                model.addRow(row);
                num_for_avg = 1.0;
                suma = Double.parseDouble(tempcar.getListaWartosc().get(i));
                avg = Double.parseDouble(tempcar.getListaWartosc().get(i));
                try {
                    month_const = formatter1.parse(tempcar.getListaData().get(i));
                    string_month_const = df1.format(month_const);
                    year_const = formatter1.parse(tempcar.getListaData().get(i));
                    string_year_const = df2.format(year_const);
                    min = Double.parseDouble(tempcar.getListaWartosc().get(i));
                    max = Double.parseDouble(tempcar.getListaWartosc().get(i));
                } catch (ParseException ex) {
                    Logger.getLogger(DataAnalysisView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
                avg = suma/num_for_avg;
                String data1 = string_year_const;
                String data2 = suma.toString();
                String data3 = avg.toString();
                String data4 = max.toString();
                String data5 = min.toString();
                Object[] row = { data1, data2, data3, data4, data5 };
                model.addRow(row); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int checker=0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 5) == null) {
                checker++;
            }
        }
        if (checker==jTable1.getRowCount()) {
            if (jTable1.getRowCount()>=12) {
                for (int i = 0; i < 12; i++) {
                Double temporaryDouble = Double.parseDouble((String) jTable1.getValueAt(i, 1));
                daneWykres.add(temporaryDouble);
                String temporaryString = (String) jTable1.getValueAt(i, 0);
                daneCzas.add(temporaryString); 
                } 
            } else {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                Double temporaryDouble = Double.parseDouble((String) jTable1.getValueAt(i, 1));
                daneWykres.add(temporaryDouble);
                String temporaryString = (String) jTable1.getValueAt(i, 0);
                daneCzas.add(temporaryString);
            }
        }}
        else {
            Boolean x = false;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (jTable1.getValueAt(i, 5) == null) {
                    x = false;
                } else x = (Boolean) jTable1.getValueAt(i, 5);

                if (x==true) {
                    Double temporaryDouble = Double.parseDouble((String) jTable1.getValueAt(i, 1));
                    daneWykres.add(temporaryDouble);
                    String temporaryString = (String) jTable1.getValueAt(i, 0);
                    daneCzas.add(temporaryString);
                }
            }
        }
        
        
        DataAnalysisChartView chart = new DataAnalysisChartView();
        chart.setDaneWykres(daneWykres);
        chart.setDaneCzas(daneCzas);
        chart.setVisible(true);
        chart.setBundleGarage(bundleGarage);
        chart.setUsername(username);
        chart.BuildChart();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField2.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(DataAnalysisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataAnalysisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataAnalysisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataAnalysisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataAnalysisView().setVisible(true);
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
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<Car> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
