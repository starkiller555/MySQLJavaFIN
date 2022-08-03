package com.sic;

import java.sql.*;
/**
 * Consultar datos de MySQL
 *
 */
public class App2
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Try-Catch para manejo de errores
        try { 
            //Llamada a la libreria mysql conector 
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Nueva conexión                        conexión a localhost |   nombre de bd | ususario mysql | contraseña   
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datos", "fernando", "pass"); 
            //Nuevo statement para crear datos 
             Statement stmt = con.createStatement(); 
            //Creación de Query | Insertar valores 
            //Estos valores deben coincidir con los tipos de datos que se asignaron durante la creación de la tabla 
             stmt.executeUpdate("INSERT INTO alumnos VALUES(1,'Luis','Ramírez','20524700')"); 
            //Se cierra la conexión 
             con.close(); 
       } catch (Exception e) { 
            //Imprimir errores 
             System.out.println(e); 
       } 

    }
}
