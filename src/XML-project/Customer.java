
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Customer {

    private String name;
    private int age;
    private int id;
    private Customer friend;

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public void setFriend(Customer friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Customer getFriend() {
        return friend;
    }
}