public class GestorSeguridad {
    public void controlarAcceso(RolUsuario rol, String moduloSistema) {
        if (rol.verificarPermisoAcceso(moduloSistema)) {
            System.out.println("Acceso permitido al módulo: " + moduloSistema);
        } else {
            System.out.println("Acceso denegado al módulo: " + moduloSistema);
        }
    }
}