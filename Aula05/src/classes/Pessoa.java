package classes;

public class Pessoa{
    String nome = "João";
    private int idade = 5;
    private double altura = 1.90;

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return altura;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }


}