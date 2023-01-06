package anatomiadeclasses;
public class MinhaClasse {
    
public static void main (String [] args) {

    System.out.print ( "Olá Aluno, sejam bem-vindo!" );

    String primeiroNome = "William";
    String segundoNome = "Silva";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.print(nomeCompleto);

}
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}

}
