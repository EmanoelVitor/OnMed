
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Medico;

public class MedicoDAO {
    
    private Connection connection;
    Long id;
    String nome;
    String telefone;
    String crm;
    String genero;
    String especialidade;
    
    public MedicoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salva(Medico objMedico){
    
        String sql = "INSERT INTO medico (id_medico,nome_medico,tel_medico,crm,gen_medico,especialidade)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(1, objMedico.getNome());
             stmt.setString(2, objMedico.getTelefone());
             stmt.setString(3, objMedico.getCrm());
             stmt.setString(4, objMedico.getGenero());
             stmt.setString(5, objMedico.getEspecialidade());
             stmt.execute();
             stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    
    }
}
