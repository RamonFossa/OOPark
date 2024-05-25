class Basics {
       public static void main(String[] args) {
        /*

            Tipos de variáveis(tipos primitivos)

            Tipo, Descrição

            byte, Números entre -128 e 127
            short, Números entre -32.768 e 32.767
            int, Números entre -2.147.483.648 e 2.147.483.647
            long, Números entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
            float, Números com até 7 casas decimais
            double, Números com até 15 casas decimais
            boolean, Verdadeiro ou Falso
            char, Armazena 1 caracter

        */

        // tipos primitivos
        int num = 2903824;

        // classes wrapper
        Integer number = 219048;

        String name;
        int age = 23;
        final Double PI = 3.14;

        name = "Ramon";

//        System.out.println("Olá " + nome);

//        if(age > 18) {
//            System.out.println("Você pode beber");
//        } else {
//            System.out.println("Você não pode beber");
//        }

        int x = 2214;
        int y = 5000;

        int biggerNumber;

        if(x > y) {
            biggerNumber = x;
        } else {
            biggerNumber = y;
        }

//        System.out.println("O maior número é: " + biggerNumber);

//        System.out.println("O maior número é: " + (x > y ? x : y)); // Ternario


        int option = 1;

//        switch (option) {
//            case 1:
//
//                System.out.println("Primeiro caso");
//                break;
//
//            case 2:
//
//                System.out.println("Segundo caso");
//                break;
//
//            case 3:
//
//                System.out.println("Terceiro caso");
//                break;
//
//            default:
//
//                System.out.println("DEFAULT");
//                break;
//        }

//        Scratch.test();

    //    User user1 = new User("Ramon", 22);
    //    User user2 = new User("Gabi", 21);

    //    user1.printNameAndAge();
    //    user2.printNameAndAge();

//        String str = "ksmclksmdskld";
//        String[] names = {"Ramon", "Gabi", "Adriana", "Renan"};

//        for(int i = 0; i < names.length; i++) {
//            System.out.println((names[i]).toUpperCase());
//        }

//        int counter = 0;

//        while(counter < 5) {
//            System.out.println(counter);
//            counter++;
//        }
//        System.out.println(counter);

//        int numberCounter = 6;
//        do {
//            System.out.println("num: " + numberCounter);
//            numberCounter++;
//        }while( numberCounter <=5);
//        System.out.println("num: " + numberCounter);


    }

    private static void test() {
        System.out.println("ALABAMA");
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printNameAndAge() {
        String text = "Nome: " + this.name + " idade: " + this.age;
        System.out.println(text);
    }

}
