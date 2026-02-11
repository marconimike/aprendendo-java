public class maiusculasMinusculas {

    public static void main(String[] args) {
        String palavras = "adcde FGHIJ Abc Cba AcB aBa      ";
        
        String s01 = palavras.toLowerCase(); //Todas as letras MINUSCULAS
        String s02 = palavras.toUpperCase(); ////Todas as letras MAIUSCULAS


        System.out.println("As palavras sem modificação - " + palavras + "-");
        System.out.println("Usando o toLowerCase - " + s01 + "-");
        System.out.println("Usando o toUpperCase - " + s02 + "-");
       
    }
}

//Assim podemos criar um código com interação com usuário.