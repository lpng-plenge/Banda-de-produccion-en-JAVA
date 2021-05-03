
package Clases;

public class Usuario {
    private int _id, _tipo;
    private String _nombres, _apellidoMaterno, _apellidoPaterno, _direccion,_usuario,_password, _telefono;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombres() {
        return _nombres;
    }

    public void setNombres(String _nombres) {
        this._nombres = _nombres;
    }

    public String getApellidoMaterno() {
        return _apellidoMaterno;
    }

    public void setApellidoMaterno(String _apellidoMaterno) {
        this._apellidoMaterno = _apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return _apellidoPaterno;
    }

    public void setApellidoPaterno(String _apellidoPaterno) {
        this._apellidoPaterno = _apellidoPaterno;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public int getTipo() {
        return _tipo;
    }

    public void setTipo(int _tipo) {
        this._tipo = _tipo;
    }
    
    
}
