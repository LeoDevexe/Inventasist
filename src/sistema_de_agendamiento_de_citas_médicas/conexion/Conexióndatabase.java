/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_agendamiento_de_citas_médicas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Conexióndatabase {
    String strConexionDb="jdbc:sqlite:C:/Users/Equipo/Downloads/jar_files/PROYECTO FINAL.db";
    Connection conn= null;
    
    public Conexióndatabase(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDb);
            JOptionPane.showMessageDialog(null,"CONEXIÓN ESTABLECIDA ");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"CONEXIÓN ERRONEA ");
    }
        
    }
        public int ejecutarSentenciaSQL(String strSentenciaSQL){
            try {
                PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
                        pstm.execute();
                        return 1;
            } catch (SQLException e) {
                System.out.println(e);
                return 0;
            }
        }
        public ResultSet consultarRegistros(String strSentenciaSQL){
        
       try {
           PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
           ResultSet respuesta = pstm.executeQuery();
           return respuesta;
}catch (Exception e){
           System.out.println(e);
           return null;
}
}
        }
        

