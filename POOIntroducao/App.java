package POOIntroducao;

public class App{
    public static void main(String[] args) {
        
        RegistraAluno aluno1 = new RegistraAluno();
        aluno1.setNome("Ana Carla Pereira");
        aluno1.setEndereco("Rua do palmeiras");
        aluno1.setIdade(16);
        aluno1.setNotaCiencias(7);
        aluno1.setNotaMatematica(5);
        aluno1.setNotaPortugues(9);
        System.out.println("Nome:"+ aluno1.getNome());
        System.out.println("Endereço:"+ aluno1.getEndereco());
        System.out.println("Idade:"+ aluno1.getIdade());
        System.out.println("Media:"+ aluno1.getMedia());
System.out.println("--------------------------------------------");
        RegistraAluno aluno2 = new RegistraAluno();
        aluno2.setNome("Ana Catarina");
        aluno2.setEndereco("Rua do flamengo");
        aluno2.setIdade(17);
        aluno2.setNotaCiencias(10);
        aluno2.setNotaMatematica(10);
        aluno2.setNotaPortugues(10);
        System.out.println("Nome:"+ aluno2.getNome());
        System.out.println("Endereço:"+ aluno2.getEndereco());
        System.out.println("Idade:"+ aluno2.getIdade());
        System.out.println("Media:"+ aluno2.getMedia());

    }
}