/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Vite
 */
public class MemorandumController {
    public Date fecha;
    public String memo, destino, asunto, departamento,autor;
    public ArrayList registro;
    
    public void Registro(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    public ArrayList Mostrar(){
        return registro;
    }
    public void Actualizar(Date fechaOrig, String memorando, String dirigido,String asunto,String area,String elabora){
        
    }
    public void Eliminar(String memorando){
        
    }
}
