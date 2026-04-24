import java.beans.Transient;
import java.io.Serializable;

public class User extends Person implements Serializable {     //Serializable интерфейс-маркер, маркер это интерфейс в котором нет абстрактных методов
    private int age;
    private transient UserAddress address;      //Указываем переменные если не нужно сериализовывать
                                                //Таким переменным присвоится null, если обьект был ссылочный, для примитивов каждый свой (инт 0 булиан фолс))
    public User(String name, String lastName, int age, UserAddress address) {
        super(name, lastName);
        System.out.println("Constructor");
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
