import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

       pessoa.setNome("João"); 
       pessoa.setIdade(15);
       pessoa.setAltura(1.00);

       System.out.println(pessoa.getNome());
       System.out.println(pessoa.getIdade());
       System.out.println(pessoa.getAltura());


    }


}
