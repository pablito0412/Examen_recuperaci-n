/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CUI.CONTROLADOR;

import DUI.MODELO.AutorModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class AutorControlador {
    private AutorModelo persona;
    Conexion conectar = new Conexion();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public AutorControlador() {
    }

    public AutorModelo getPersona() {
        return persona;
    }

    public void setPersona(AutorModelo persona) {
        this.persona = persona;
    }
    
     public void crearAutor(AutorModelo a) {
        try {
            String SQL = "{call sp_InsertarPersona(?, ?, ?, ?, ?, ?)}";
            CallableStatement ejecutar = conectado.prepareCall(SQL);
            ejecutar.setString(1, a.getAutor());
            ejecutar.setString(2, a.getTitulo());
            int resultado = ejecutar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
            }
        } catch (SQLException ex) {
            // Manejar la excepción
            if (ex.getSQLState().equals("45000")) {
                JOptionPane.showMessageDialog(null, "La cédula ya está registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar la persona.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
