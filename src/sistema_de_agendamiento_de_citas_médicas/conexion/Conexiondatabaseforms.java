/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_agendamiento_de_citas_médicas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Conexiondatabaseforms {
    String strConexionDb="jdbc:sqlite:C:/Users/Equipo/Downloads/jar_files/PROYECTO FINAL.db";
    Connection conn= null;
    
    public Conexiondatabaseforms(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDb);
            System.out.println("CONEXIÓN ESTABLECIDA ");
        }catch(Exception e){
            System.out.println("CONEXIÓN ERRONEA ");
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

public DefaultTableModel buscarPersona(String buscar){
        DefaultTableModel modelo;
        modelo= new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("NOMBRES ");
        modelo.addColumn("CEDULA ");
        modelo.addColumn("FECHA DE NACIMIENTO");
        modelo.addColumn("DIRECCIÓN  ");
        modelo.addColumn("GENERO ");
        modelo.addColumn("CORREO DEL PACIENTE ");
        modelo.addColumn("ESPECIALIDAD ");
        modelo.addColumn("DOCTOR DE LA CITA ");
        modelo.addColumn("FECHA DE LA CITA ");
        modelo.addColumn("HORA DE LA CITA ");

       
        
        String sql="select * from PACIENTES_CITAS where Nombre_Pacientes like'%"+buscar+"%'or Cedula_Pacientes like'%"+buscar+"%'or Fechanacimiento_Pacientes like'%"+buscar+"%'";


Connection conn= null;
PreparedStatement pst=null;
ResultSet respuesta=null;

    try {
   conn=DriverManager.getConnection(strConexionDb);
   pst=conn.prepareStatement(sql);
   respuesta=pst.executeQuery();
   
   while(respuesta.next()){
        String [] Ousuario =new String[12];
                Ousuario[0]=respuesta.getString("ID_Pacientes");
                Ousuario[1]=respuesta.getString("Nombre_Pacientes");
                Ousuario[2]=respuesta.getString("Cedula_Pacientes");
                Ousuario[3]=respuesta.getString("Fechanacimiento_Pacientes");
                Ousuario[4]=respuesta.getString("Direccion_Pacientes");
                Ousuario[5]=respuesta.getString("Genero_Pacientes");
                Ousuario[6]=respuesta.getString("Correo_Pacientes");
                Ousuario[7]=respuesta.getString("Especialidad_Cita");
                Ousuario[8]=respuesta.getString("Doctor_Cita");
                Ousuario[9]=respuesta.getString("Fecha_Cita");
                Ousuario[10]=respuesta.getString("Hora_Cita");
             
            

       modelo.addRow(Ousuario);
       
   }
    } catch (Exception e) {
        System.out.println(e);
    }
    
return modelo;
}
}
        
       

