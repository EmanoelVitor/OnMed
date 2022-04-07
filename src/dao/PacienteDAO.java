
package dao;

import factory.ConnectionFactory;
import modelo.Paciente;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PacienteDAO {
    private Connection connection;
    Long id;
    String nome;
    String telefone;
    String cpf;
    String rg;
    String endereco;
    String genero;
   
    public PacienteDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salva (Paciente objPaciente){
         String sql = "INSERT INTO paciente (nome_paciente,tel_paciente,cpf_paciente,rg_paciente,end_paciente,gen_paciente) VALUES (?,?,?,?,?,?)";
         try {
             PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(1, objPaciente.getNome());
             stmt.setString(2, objPaciente.getTelefone());
             stmt.setString(3, objPaciente.getCpf());
             stmt.setString(4, objPaciente.getRg());
             stmt.setString(5, objPaciente.getEndereco());
             stmt.setString(6, objPaciente.getGenero());
             stmt.execute();
             stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletar(Paciente objPaciente) {
        try {
            String sql;
            if (!String.valueOf(objPaciente.getId()).isEmpty()) {
                sql = "DELETE FROM paciente WHERE paciente.id_paciente = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objPaciente.getId());
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
