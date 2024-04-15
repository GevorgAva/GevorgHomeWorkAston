import java.util.*;


public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("89124563355", "Иванов");
        phoneBook.addContact("89124563356", "Иванов");
        phoneBook.addContact("89124563357", "Петров");

        System.out.println(phoneBook.getContactBySurname("Иванов"));
        System.out.println(phoneBook.getContactByPhone("89124563357"));
        System.out.println(phoneBook.getAllContacts());
        System.out.println(System.lineSeparator());

        ArrayList<String> words = new ArrayList<>();
        words.add("word1");
        words.add("word2");
        words.add("word3");
        words.add("word4");
        words.add("word1");
        words.add("word2");
        words.add("word4");
        words.add("word1");
        words.add("word1");
        words.add("word1");
        words.add("word2");
        words.add("word4");
        System.out.println("Список слов:");
        for (String word : words) {
            System.out.println(word);
        }


        System.out.println("\nСлова и количество их в массиве:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("\nСписок уникальных слов: ");
        Set<String> unique = new HashSet<>(words);
        for (String s : unique) {
            System.out.println(s);
        }

    }


}



