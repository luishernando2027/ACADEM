/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubasedatos;

import Db_Academia.ConexionAcademia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Castillo
 */
public class TablasAcademia extends javax.swing.JFrame {
    ConexionAcademia con=new ConexionAcademia();
    Connection conx=con.conxdatabase();
    PreparedStatement ps=null;
    
    ResultSet rs=null;

    /**
     * Creates new form TablasAcademia
     */
    public TablasAcademia() {
        initComponents();
        cargatabla();
        cargatabla2();
        cargatabla3();
        cargatabla4();
        cargatabla5();
    }
    
    public void cargatabla(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documentos");
        tab.addColumn("Nombre Usuario");
        tab.addColumn("Clave");
        TablaUsuario.setModel(tab);
        String datos[]=new String[3];
        
        try {
            ps=conx.prepareStatement("SELECT *FROM Usuario");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla2(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documentos Profesor");
        tab.addColumn("Nombre Profesor");
        tab.addColumn("Apellido Profesor");
        tab.addColumn("Categoria Profesor");
        tab.addColumn("Salario Profesor");
        TablaProfesor.setModel(tab);
        String datos[]=new String[5];
        
        try {
            ps=conx.prepareStatement("SELECT *FROM Profesor");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
        public void cargatabla3(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Codigo Curso");
        tab.addColumn("Nombre Curso");
        tab.addColumn("Horas Curso");
        tab.addColumn("Valor Curso");
        TablaCurso.setModel(tab);
        String datos[]=new String[4];
        
        try {
            ps=conx.prepareStatement("SELECT *FROM Curso");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla4(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documento Estudiante");
        tab.addColumn("Nombre Estudiante");
        tab.addColumn("Apellido Estudiante");
        tab.addColumn("Edad Estudiante");
        TablaEstudiante.setModel(tab);
        String datos[]=new String[4];
        
        try {
            ps=conx.prepareStatement("SELECT *FROM Estudiante");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla5(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Cod. Est. X Curso");
        tab.addColumn("Doc. Est. X Curso");
        tab.addColumn("Fecha Ini. Est. X Curso");
        TablaEstxCurso.setModel(tab);
        String datos[]=new String[3];
        
        try {
            ps=conx.prepareStatement("SELECT *FROM Esxcurso");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProfesor = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCurso = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaEstudiante = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaEstxCurso = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 30, 920, 40);

        TablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaProfesor);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 94, 918, 84);

        TablaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaCurso);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 199, 918, 83);

        TablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaEstudiante);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 308, 918, 83);

        TablaEstxCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaEstxCurso);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(0, 416, 918, 84);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(678, 518, 184, 54);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("TABLAS DE ACADEMIA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 150, 14);

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 11, 60, 14);

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("PROFESOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 77, 70, 14);

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("CURSO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 181, 50, 14);

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("ESTUDIANTE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 288, 80, 14);

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("ESTUDIANTE X CURSO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 396, 150, 14);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menubasedatos/Academia.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 920, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      MENUS men=new MENUS();
      men.setVisible(true);
      men.setSize(910,570);
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TablasAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablasAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablasAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablasAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TablasAcademia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCurso;
    private javax.swing.JTable TablaEstudiante;
    private javax.swing.JTable TablaEstxCurso;
    private javax.swing.JTable TablaProfesor;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
