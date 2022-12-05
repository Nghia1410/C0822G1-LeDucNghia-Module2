package casetudy.task_2.util;

import casetudy.task_2.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteRead {
    public static List<Person> readFile(String path) {
        List<Person> persons = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Person person = new Person(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])
                        , Integer.parseInt(array[5]), array[6], array[7], array[8], Integer.parseInt(array[9]));
                persons.add(person);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public static void writeFile(String path, List<Person> personList) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person item : personList) {
                bufferedWriter.write(item.getId() + "," + item.getFullName() + "," + item.getDateOfBirth() + "," + item.getSex() + "," + item.getIdentityCard() +
                        "," + item.getPhoneNumber() + "," + item.getEmail() + "," + item.getLevel() + "," + item.getPosition() + "," + item.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
