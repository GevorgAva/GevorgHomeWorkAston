import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    TreeMap<String, String> contacts = new TreeMap<>();
    public void addContact(String phone, String surname) {
        if (checkName(surname) && checkPhone(phone)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(surname) && key.equals(phone)) {
                    System.out.println("Контакт с такой фамилией и номером телефона существует в записной книжке");
                }
                else if (value.equals(surname)) {
                    contacts.put(phone, surname);
                }
            }
            contacts.put(phone, surname);

        }
    }

    public boolean checkPhone(String phone) {
        String phoneRegex = "[7-8]\\d{10}";
        if (phone.matches(phoneRegex)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean checkName(String name) {
        String nameRegex = "[а-яА-Я]+";
        if (name.matches(nameRegex)) {
            return true;
        } else {
            return false;
        }

    }

    public String getContactByPhone(String phone) {
        String result = "";
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(phone)) {
                result = key + " - " + value;
            }
        }
        return result;
    }

    public Set<String> getContactBySurname(String name) {
        TreeSet<String> listContact = new TreeSet<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals(name)) {
                listContact.add(key + " - " + value);
            }
        }
        return new TreeSet<>(listContact);
    }

    public Set<String> getAllContacts() {
        TreeSet<String> listContact2 = new TreeSet<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            listContact2.add(key + " - " + value);

        }
        return new TreeSet<>(listContact2);
    }


}
