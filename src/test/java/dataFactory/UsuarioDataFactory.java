package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo obterTokenDoUsuarioAposLogin() {
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setEmail("teste@gmail.com");
        usuario.setLoginPassword("Teste@123");
        usuario.setLoginUser("leonardo2");

        return usuario;
    }
}
