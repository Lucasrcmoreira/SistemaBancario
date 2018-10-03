/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemabancario.dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Lucas Ramos
 */
public class DAO {
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    
    protected PreparedStatement stmt;
    protected Connection conn;
    
    public DAO(){
    this.servidor ="localhost:3306";
    this.banco ="dbfreetradebank";
    this.usuario="root";
    this.senha="";
    }
    
    public void conexao(){
    String urlConexao = "jdbc:mysql://" + servidor + "/" + banco;
    
    
        try{
           Class.forName("org.gjt.mm.mysql.Driver");
          try{    conn = (Connection)DriverManager.getConnection(urlConexao,usuario, senha);
          }catch( Exception ex){
              System.out.println("ERRO DE CONEXAO MYSQL" + ex.getMessage());
          }
        }catch(ClassNotFoundException ex){
          System.out.println("ERRO DE DRIVE mysql" + ex.getMessage());
          }
}   }
