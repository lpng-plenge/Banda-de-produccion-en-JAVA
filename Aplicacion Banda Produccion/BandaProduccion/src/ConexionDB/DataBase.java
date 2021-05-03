package ConexionDB;

import Clases.Usuario;
import Clases.LogIn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

    ResultSet rs;

    public DataBase() {

    }
    
    
    public int getID(Connection conn) throws SQLException {
        int id = 0;
        PreparedStatement stmt = conn.prepareStatement("select max(id) from usuarios");
        rs = stmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt(1) + 1;
        }
        return id;
    }

    public void Salvar(Connection conn, Usuario us) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?)");
        stmt.setInt(1, us.getId());
        stmt.setString(2, us.getNombres());
        stmt.setString(3, us.getApellidoPaterno());
        stmt.setString(4, us.getApellidoMaterno());
        stmt.setString(5, us.getTelefono());
        stmt.setString(6, us.getDireccion());
        stmt.setString(7, us.getUsuario());
        stmt.setString(8, us.getPassword());
        stmt.setInt(9, us.getTipo());
        stmt.executeUpdate();
    }

    public String[] Buscar(Connection conn, Usuario us) throws SQLException {
        String[] registro = new String[8];
        PreparedStatement stmt = conn.prepareStatement("select * from usuarios where id=?");
        stmt.setInt(1, us.getId());

        rs = stmt.executeQuery();
        if (rs.next()) {
            registro[0] = rs.getString("nombre");
            registro[1] = rs.getString("aPaterno");
            registro[2] = rs.getString("aMaterno");
            registro[3] = rs.getString("telefono");
            registro[4] = rs.getString("direccion");
            registro[5] = rs.getString("usuario");
            registro[6] = rs.getString("password");
            registro[7] = rs.getString(String.valueOf("tipo"));
        }
        return registro;
    }

    public void Editar(Connection conn, Usuario us) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update usuarios set nombre=?, aPaterno=?, aMaterno=?, telefono=?, direccion=?, usuario=?, password=?, tipo=? where id=?");

        stmt.setString(1, us.getNombres());
        stmt.setString(2, us.getApellidoPaterno());
        stmt.setString(3, us.getApellidoMaterno());
        stmt.setString(4, us.getTelefono());
        stmt.setString(5, us.getDireccion());
        stmt.setString(6, us.getUsuario());
        stmt.setString(7, us.getPassword());
        stmt.setInt(8, us.getTipo());
        stmt.setInt(9, us.getId());
        stmt.executeUpdate();
    }
    
    public void Eliminar(Connection conn, Usuario us) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("delete from usuarios where id=?");
        stmt.setInt(1, us.getId());
        stmt.executeUpdate();
    }
    
    public String IniciarSesion(Connection conn, LogIn li) throws SQLException{
        String tipo ="";
        PreparedStatement stmt = conn.prepareStatement("select tipo from usuarios where usuario=? and password=?");
        stmt.setString(1, li.getUsuario());
        stmt.setString(2, li.getPassword());
        
        rs = stmt.executeQuery();
        if (rs.next()) {
            tipo = rs.getString(String.valueOf("tipo"));
        }
        return tipo;
    }
    
}
