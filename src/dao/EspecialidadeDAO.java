
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Especialidade;

public class EspecialidadeDAO {
    private Connection connection;
    Long id;
    String nome;
    
    public EspecialidadeDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salva(Especialidade objEspecialidade){
        String sql = "INSERT INTO (id_especialidade, nome_especialidade)VALUES(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, objEspecialidade.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
