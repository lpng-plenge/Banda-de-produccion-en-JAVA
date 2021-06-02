package ConexionDB;

import Clases.CerrarSesion;
import Clases.Usuario;
import Clases.LogIn;
import Clases.Producciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DataBase {

    ResultSet rs;

    public DataBase() {

    }
    public String getRefresh(Connection conn, CerrarSesion cs)throws SQLException{
        String estatus="";
        PreparedStatement changeS = conn.prepareStatement("select estatus from usuarios where usuario=?");
        changeS.setString(1, cs.getUsuario());
        
        rs = changeS.executeQuery();
        if (rs.next()) {
            estatus = rs.getString(String.valueOf("estatus"));
            return estatus;
        } else {
            estatus = "null";
            return estatus;
        }
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

    public boolean Salvar(Connection conn, Usuario us) {
        boolean accedido=false;
        try {
            int tipo=us.getTipo();
            PreparedStatement stmt = conn.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, us.getId());
            stmt.setString(2, us.getNombres());
            stmt.setString(3, us.getApellidoPaterno());
            stmt.setString(4, us.getApellidoMaterno());
            stmt.setString(5, us.getTelefono());
            stmt.setString(6, us.getDireccion());
            stmt.setString(7, us.getUsuario());
            stmt.setString(8, us.getPassword());
            stmt.setInt(9, us.getTipo());
            stmt.setBoolean(10, us.isEstatus());
            stmt.executeUpdate();
            accedido = true;
        } catch (SQLException ex) {
            accedido = false;
        }
        return accedido;
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
            return registro;
        } else {
            registro[0] = "null";
            return registro;
        }
    }

    public boolean Editar(Connection conn, Usuario us) {
        boolean accedido=false; 
        try {
            PreparedStatement stmt = conn.prepareStatement("update usuarios set nombre=?, aPaterno=?, aMaterno=?, telefono=?, direccion=?, usuario=?, password=?, tipo=?, estatus=? where id=?");
            stmt.setString(1, us.getNombres());
            stmt.setString(2, us.getApellidoPaterno());
            stmt.setString(3, us.getApellidoMaterno());
            stmt.setString(4, us.getTelefono());
            stmt.setString(5, us.getDireccion());
            stmt.setString(6, us.getUsuario());
            stmt.setString(7, us.getPassword());
            stmt.setInt(8, us.getTipo());
            stmt.setBoolean(9, us.isEstatus());
            stmt.setInt(10, us.getId());        
            stmt.executeUpdate();
            accedido = true;
        } catch (SQLException ex) {
            accedido=false;
        }
        return accedido;
    }
    public void EditarTabla(Connection conn, Producciones ps) throws SQLException{
            PreparedStatement stmt = conn.prepareStatement("update producciones set entrada=?, salida=?, defectuoso=? where usuario_id=?");
            stmt.setInt(1, ps.getEntrada());
            stmt.setInt(2, ps.getSalida());
            stmt.setInt(3, ps.getDefectuoso());     
            stmt.setString(4, ps.getUsuuario_id());
            stmt.executeUpdate();
    }
    public void Eliminar(Connection conn, Usuario us) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("delete from usuarios where id=?");
        stmt.setInt(1, us.getId());   
        stmt.executeUpdate();

    }

    public void CerrarSesion(Connection conn, CerrarSesion cs) throws SQLException {
        PreparedStatement changeS = conn.prepareStatement("update usuarios set estatus=? where usuario=?");
        changeS.setBoolean(1, cs.isEstatus());
        changeS.setString(2, cs.getUsuario());
        changeS.executeUpdate();    
    }

    public String[] IniciarSesion(Connection conn, LogIn li) throws SQLException {
        String[] tipo = new String[3];
        PreparedStatement stmt = conn.prepareStatement("select tipo,Estatus,id from usuarios where usuario=? and password=?");
        stmt.setString(1, li.getUsuario());
        stmt.setString(2, li.getPassword());

        rs = stmt.executeQuery();
        if (rs.next()) {
            tipo[0] = rs.getString(String.valueOf("tipo"));
            tipo[1] = rs.getString(String.valueOf("Estatus"));
            tipo[2] = rs.getString(String.valueOf("id"));
            if (tipo[1].equals("0")) {
                PreparedStatement changeS = conn.prepareStatement("update usuarios set estatus=? where id=?");
                changeS.setBoolean(1, true);
                changeS.setInt(2, Integer.valueOf(tipo[2]));
                changeS.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ya conectado");
                tipo[0] = "3";
            }
        }else{
            tipo[0] = "4";
            tipo[1] = null;
            tipo[2] = null;
            
        }
                
        return tipo;
    }
    
    public int[] consultarTabla(Connection conn, Usuario us) throws SQLException{
        int [] datos = new int[3];
        PreparedStatement stmt = conn.prepareStatement("select * from producciones where usuario_id=?");
        stmt.setString(1, us.getUsuario());
        rs = stmt.executeQuery();
        if (rs.next()) {
            datos[0] = rs.getInt("entrada");
            datos[1] = rs.getInt("salida");
            datos[2] = rs.getInt("defectuoso");
        }else{
            PreparedStatement insertar = conn.prepareStatement("insert into producciones values(?,?,?,?)");
            insertar.setString(1, us.getUsuario());
            insertar.setInt(2, 0);
            insertar.setInt(3, 0);
            insertar.setInt(4, 0);
            
            insertar.executeUpdate();
            datos[0]=0;
            datos[1]=0;
            datos[2]=0;
        }
        return datos;
    }
}
