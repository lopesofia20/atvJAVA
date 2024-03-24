
public class dois {

    System.err.println("Faça já seu cadastro:")
    user = string(input("usuario: "));
    senha = string(input("senha: "));

    while (user == senha) {
        System.err.println("Usuario e senha não podem ser iguais!");
        user = string(input("usuario: "));
        senha = string(input("senha: "));
    }
    else{
        System.err.println("Cadastro realizado com sucesso!");
    }
    
}

