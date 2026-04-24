public class ForEach {
    public static void main(String[] args) {

//        String[]array ={"Petya", "Sasha", "Masha","Sergey","Sofa","Misha"};
//
//        for(int i =0;i < array.length; i++){
//            System.out.println(array[i]);
//        }
//
//
//        for(String name : array){                       //цикл foreach не работает с индексами а рабоатет конкректно с элементами и кладет их в переменную
//            System.out.println(name);
//        }

        int[]spisok =new int[100];
        for (int i = 0;i < spisok.length;i++){
            spisok[i] = i+100;

        }
        for(int c : spisok){
            System.out.println(c);
        }











    }
}
