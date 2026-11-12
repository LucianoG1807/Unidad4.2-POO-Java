public class RolInvitado implements RolUsuario {
    @Override
    public boolean verificarPermisoAcceso(String moduloSistema) {
        return moduloSistema.equalsIgnoreCase("inicio")
                || moduloSistema.equalsIgnoreCase("ayuda");
    }
}