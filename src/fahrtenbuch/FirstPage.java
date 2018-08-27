/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrtenbuch;

import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 *
 * @author Michael Reiswich
 */
public class FirstPage extends javax.swing.JFrame {
    public ArrayList<String> driverName = new ArrayList<>();
    public ArrayList<String> carName = new ArrayList<>();
    

  
    public FirstPage() {
     
        initComponents();
    }
    
    public FirstPage(ArrayList<String> driverName, ArrayList<String> carName) {
        this.driverName = driverName;
        this.carName = carName;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstViewPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HeadlineField = new javax.swing.JTextField();
        neuregistration = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FirstpageTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeadlineField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HeadlineField.setText("Gruppe 1");
        HeadlineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeadlineFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(HeadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(HeadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        neuregistration.setText("New Book");
        neuregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neuregistrationActionPerformed(evt);
            }
        });

        FirstpageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fahzeug", "Fahrer", "Datum/Zeit", "Strecke", "P/G"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        FirstpageTable.setToolTipText("Table");
        jScrollPane1.setViewportView(FirstpageTable);
        if (FirstpageTable.getColumnModel().getColumnCount() > 0) {
            FirstpageTable.getColumnModel().getColumn(0).setResizable(false);
            FirstpageTable.getColumnModel().getColumn(1).setResizable(false);
            FirstpageTable.getColumnModel().getColumn(2).setResizable(false);
            FirstpageTable.getColumnModel().getColumn(3).setResizable(false);
            FirstpageTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout FirstViewPanelLayout = new javax.swing.GroupLayout(FirstViewPanel);
        FirstViewPanel.setLayout(FirstViewPanelLayout);
        FirstViewPanelLayout.setHorizontalGroup(
            FirstViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstViewPanelLayout.createSequentialGroup()
                .addGroup(FirstViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FirstViewPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstViewPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FirstViewPanelLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(neuregistration)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        FirstViewPanelLayout.setVerticalGroup(
            FirstViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstViewPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(neuregistration)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FirstViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FirstViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void neuregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neuregistrationActionPerformed

        
        if (evt.getSource().equals(neuregistration)) {
            MainView ff = new MainView(driverName, carName);
          
            ff.setVisible(true);
        }

    }//GEN-LAST:event_neuregistrationActionPerformed

    private void HeadlineFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeadlineFieldActionPerformed
        

    }//GEN-LAST:event_HeadlineFieldActionPerformed

 
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
            }
        });
    }
    //Variablendeklaration der ersten Ansicht
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel FirstViewPanel;
    public javax.swing.JTable FirstpageTable;
    public javax.swing.JTextField HeadlineField;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JToggleButton neuregistration;
    // End of variables declaration//GEN-END:variables

}
