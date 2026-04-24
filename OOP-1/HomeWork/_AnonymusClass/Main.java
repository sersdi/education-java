package HomeWork._AnonymusClass;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
//        Oficiant_Bob oficiantBob = new Oficiant_Bob();           //Старый способ через создания классов и наследования интерфейсов
//        client.sdelatZakaz(oficiantBob,"Pepper");

        client.sdelatZakaz(new Oficiant() {                     //СПОСОБ С АНОНИМНЫМ КЛАССОМ
            @Override
            public void prinestiZakaz(String food) {
                System.out.println("Принес "+food);
            }
        }, "Pizza");








    }


}
