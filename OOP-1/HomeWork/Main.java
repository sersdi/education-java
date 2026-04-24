package HomeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Povar povar = new Povar();


        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(povar);

        for(Worker worker : workers){
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(povar);

        for(Driver driver :drivers){
            driver.drive();
        }

        boss.force(new Worker() {       //передали внутри экземпляр анонимного класса worker
            @Override                   //переопределяем методы из интерфейса
            public void work() {
                System.out.println("Работаю");

            }
        });



    }
}
