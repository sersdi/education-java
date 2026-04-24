package examples;

public class Rabotnick {

    String name;
    String job;
    double salary;

    Rabotnick(String name, String job, double salary){
        this.name = name;
        this.job = job;
        this.salary = salary;

    }
    void showInfo(){
        System.out.println("Name: "+name+". "+"Должность: "+job+". "+"Зарплата: "+salary+".");
    }

}
