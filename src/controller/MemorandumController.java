/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Conexion;
/**
 * @Fecha: Martes 16 de Julio del 2024
 * @author Vite
 * @Descripción: Controlador del CRUD para los Memos
 */
public class MemorandumController {
    public Date fecha;
    public String memo, destino, asunto, departamento,autor;
    public Conexion con = new Conexion();
    public Connection conect;
    public PreparedStatement st;
    public ResultSet rs;
    
    
    public void Registro(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    
    public DefaultTableModel Mostrar(DefaultTableModel model){
        try{
        String sql = "select * from memorandum";
        conect = con.establecerconexion();
        st = conect.prepareStatement(sql);
        rs = st.executeQuery();
        String [] memos = new String [7];
        
        while (rs.next()){
            memos[0] = Integer.toString(rs.getInt("id"));
            memos[1] = rs.getString("fecha");
            memos[2] = rs.getString("num_memo");
            memos[3] = rs.getString("nom_Destino");
            memos[4] = rs.getString("asunto");
            memos[5] = rs.getString("departamento");
            memos[6] = rs.getString("autor");
            
            model.addRow(memos);
        }
        }catch(SQLException e){
            System.out.println(e);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conect != null) conect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return model;
    }
    
    public void Actualizar(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    
    public void Eliminar(String memorando){
        
    }

}
