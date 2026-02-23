package entities;

public class Aluno {
    public String nome;
    public String curso;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return ((nota1 + nota2 + nota3)/3);
    }


    public String resultado(){

        if (media() >= 6.0){
            return "Aprovado com media: " + media();
        }
        else {
            return "Reprovado com media: " + media();
        }
    }

}
