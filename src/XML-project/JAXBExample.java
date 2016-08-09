import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
    public static void main(String[] args) {
        toXML();
        toObject();
    }

    private static void toXML() {

        Customer friend = new Customer();
        friend.setId(222);
        friend.setName("Bill");
        friend.setAge(30);

        Customer customer = new Customer();
        customer.setId(101);
        customer.setName("Joe");
        customer.setAge(26);
        customer.setFriend(friend);

        try {
            File file = new File("D:/fileXML.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // Formatted output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void toObject() {
        try {
            File file = new File("D:/fileXML.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer.getFriend().getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}