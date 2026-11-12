public class Main {
    public static void main(String[] args) {
        GestorSeguridad gestor = new GestorSeguridad();

        RolUsuario administrador = new RolAdministrador();
        RolUsuario editor = new RolEditor();
        RolUsuario invitado = new RolInvitado();

        gestor.controlarAcceso(administrador, "configuracion");
        gestor.controlarAcceso(editor, "contenido");
        gestor.controlarAcceso(editor, "configuracion");
        gestor.controlarAcceso(invitado, "inicio");
        gestor.controlarAcceso(invitado, "contenido");
    }
}