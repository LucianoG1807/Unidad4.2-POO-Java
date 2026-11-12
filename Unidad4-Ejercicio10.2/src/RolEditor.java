public class RolEditor implements RolUsuario {
    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equalsIgnoreCase("contenido")
                || moduloSistema.equalsIgnoreCase("publicaciones");
    }
}