/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemabancario.dao;

import br.com.sistemabancario.models.PessoaFisica;
import java.sql.SQLException;

/**
 *
 * @author Lucas Ramos
 */
public class DAOPessoaFisica extends DAO{
    
    public void Cadastrar (PessoaFisica pf){
      String cmdSql ="insert into dbfreetradebank (nome,cpf,email,senha)values(?,?,?,?)";
      this.conexao();
      
      try{
          this.stmt = this.conn.prepareStatement(cmdSql);
          this.stmt.setString(1, pf.getNome());
          this.stmt.setInt(2,pf.getCpf());
          this.stmt.setString(3, pf.getEmail());
          this.stmt.setString(4, pf.getSenha());
          
      }catch(SQLException ex){
      System.out.println("ERRO AO INSERIR " + ex.getMessage());
      }
              
      
    }
}
