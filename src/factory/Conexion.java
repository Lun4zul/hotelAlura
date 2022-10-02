package factory;

import java.sql.*;

public class Conexion {

	//Parametros de conexion
	static String nombre_base_datos = "hotelaluralatam";
	//root
	static String usuariobd = "root";
	//clave
	static String clavebd = "Andrea";
	//Conexion localhost
	static String url = "jdbc:mysql://127.0.0.1/" + nombre_base_datos;
	
	//Objeto sin inicializar conexion
	Connection connection = null;
	
	//Constructor de Dbconnection
	public Conexion() {
		
		try {
			//Obtener el driver de para mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Obtener la conexion
			connection = DriverManager.getConnection(url, usuariobd, clavebd);
			//Si hay conextion correcta, mostrar informacion en consola
			if (connection != null) {
				System.out.println("Conexion a base de datos "
						+ nombre_base_datos + "OK\n");
			}
			
		} catch (SQLException e) {
			// Error en base de datos
			System.out.println(e);
			
		} catch (ClassNotFoundException e) {
			// Error en cargar clases
			System.out.println(e);
		}
		
		catch (Exception e) {
			// cualquier otro error
			System.out.println(e);
		}
		
	}
	
	//Permite retornar la conexion
	public Connection getConnection() {
		return connection;
	}
	
	//Cerrando la conexion
	public void desconectar() {
		connection = null;
	}
	
}

