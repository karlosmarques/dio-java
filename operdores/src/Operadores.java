public class Operadores {
    public static void main(String[] args) throws Exception {
        int numero = 5;

        // x reteticao

        //numero = numero + 1

        System.out.println(numero --);

        System.out.println(numero);




        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);



        //operador ternario:

        int a, b;

        a= 5;
        b= 6;

        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);


        //operadores relacionais:

        String nomeUm = "KARLOS";
        String nomeDois = new String("KARLOS");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;


        if (numero1 == numero2) {
            System.out.println("a nossa condição é verdadiera");
        }

        System.out.println("numeroUm é igual a numeroDois" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois" + simNao);


        //operadores logicos

         boolean condicao1 = true;

         boolean condicao2 = false;
         if (condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
         }

         if (condicao1 || condicao2){
            System.out.println("uma das condições e verdadeira");
         }
    }
}
