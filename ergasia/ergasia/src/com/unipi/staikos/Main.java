package com.unipi.staikos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Λιοντάρι");
        a1.setCode("α1");
        a1.setAnimalClass("Αιλουροειδές");
        a1.setWeight(190);
        a1.setAge(14);
        // Αποθήκευση των στοιχείων σε αρχείο //
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a1);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal a2 = new Animal();
        a2.setName("Τίγρης");
        a2.setCode("α2");
        a2.setAnimalClass("Αιλουροειδές");
        a2.setWeight(280);
        a2.setAge(22);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a2);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal a3 = new Animal();
        a3.setName("Πιγκουίνος");
        a3.setCode("α3");
        a3.setAnimalClass("Πτηνό");
        a3.setWeight(5);
        a3.setAge(1);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a3);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal a4 = new Animal();
        a4.setName("Καμηλοπάρδαλη");
        a4.setCode("α4");
        a4.setAnimalClass("Θηλαστικό");
        a4.setWeight(300);
        a3.setAge(27);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a4);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal a5 = new Animal();
        a5.setName("Χιμπατζής");
        a5.setCode("α5");
        a5.setAnimalClass("Ανθρωποειδές");
        a5.setWeight(50);
        a5.setAge(37);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a5);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        animalList.add(a5);
        System.out.println("Εφαρμογή Ζοο");
        System.out.println("1. Προβολή όλων των διαθέσιμων ζώων του ζωολογικού κήπου");
        System.out.println("2. Προσθήκη νέου ζώου");
        System.out.println("3. Αναζήτηση ζώου βάσει ονόματος");
        System.out.println("4. Αναζήτηση ζώου βάσει κωδικού");
        System.out.println("5. Επεξεργασία ζώου βάσει κωδικού");
        System.out.println("6. Διαγραφή ζώου βάσει κωδικού");
        System.out.println("7. Έξοδος από την εφαρμογή");
        System.out.println("Παρακαλώ επιλέξτε από το παραπάνω menu επιλογών γράφοντας τον κατάλληλο αριθμό για την διαδικασία που θα θέλατε να πραγματοποιήσετε:");
        int answer;
        Scanner Answer = new Scanner(System.in);
        // Δίνουμε την δυνατότητα στον χρήστη να επιλέξει ποια διαδικασία θέλει να πραγματοποιήσει. Όλο αυτό θα γίνεται μέχρις ότου να πατήσει το 6//
        while ((answer = Answer.nextInt()) != 7) {
            if (answer == 1) {
                for (Animal a : animalList) {
                    System.out.println(a.getName());
                    System.out.println(a.getAnimalClass());
                    System.out.println(a.getCode());
                    System.out.println(a.getWeight());
                    System.out.println(a.getAge());
                }
            } else if (answer == 2) {
                Animal a6 = new Animal();
                System.out.println("Δώσε νέο ζώο:");
                Scanner Name = new Scanner(System.in);
                String nameInput = Name.nextLine();
                a6.setName(nameInput);

                System.out.println("Δώσε νέο κωδικό:");
                Scanner Code = new Scanner(System.in);
                String codeInput = Code.nextLine();
                a6.setCode(codeInput);

                System.out.println("Δώσε νέα ομοταξία:");
                Scanner AnimalClass = new Scanner(System.in);
                String classInput = AnimalClass.nextLine();
                a6.setAnimalClass(classInput);

                System.out.println("Δώσε νέο βάρος:");
                Scanner weight = new Scanner(System.in);
                int weightInput = weight.nextInt();
                a6.setWeight(weightInput);

                System.out.println("Δώσε νέα ηλικία:");
                Scanner age = new Scanner(System.in);
                int ageInput = age.nextInt();
                a6.setAge(ageInput);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream("myfile.ser");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(a6);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                animalList.add(a6);
            } else if (answer == 3) {
                System.out.println("Ποιο ζώο θέλεις να βρεις;");
                Scanner Search = new Scanner(System.in);
                String searchInput = Search.nextLine();
                int x;
                x = 0;
                for (Animal an : animalList) {
                    if (searchInput.equals(an.getName())) {
                        x = 1;
                    }
                }
                if (x == 1) {
                    System.out.println("Το ζώο " + searchInput + ": βρέθηκε");
                } else {System.out.println("Το ζώο " + searchInput + ": δεν θρέθηκε");}
            } else if (answer == 4) {
                int y;
                y = 0;
                System.out.println("Ποιον κωδικό ζώου θέλεις να βρεις:");
                Scanner Search = new Scanner(System.in);
                String searchCode = Search.nextLine();
                for (Animal an : animalList) {
                    if (searchCode.equals(an.getCode())) {
                        y = 1;
                    }
                }
                if (y == 1) {
                    {System.out.println("Ο κωδικός " + searchCode + ": βρέθηκε");}
                } else {System.out.println("Ο κωδικός " + searchCode + ": δεν βρέθηκε");}
            }
            else if (answer == 5){
                System.out.println("Γράψε τον κωδικό του ζώου που θέλεις να επεξεργαστείς: ");
                Scanner CodeEdit = new Scanner(System.in);
                String codeEdit = CodeEdit.nextLine();
                for (Animal an: animalList ){
                    if (codeEdit.equals(an.getCode())){
                        System.out.println("Θέλεις να αλλάξεις όνομα; Ναι ή Όχι");
                        Scanner Answer1 = new Scanner(System.in);
                        String answer1 = Answer1.nextLine();
                        if (answer1.equals("Ναι")){
                            System.out.println("Δώσε νέο όνομα");
                            Scanner NameEdit = new Scanner(System.in);
                            String nameEdit = NameEdit.nextLine();
                            an.setName(nameEdit);
                        }
                        System.out.println("Θέλεις να αλλάξεις κωδικό; Ναι ή Όχι");
                        Scanner Answer2 = new Scanner(System.in);
                        String answer2 = Answer1.nextLine();
                        if (answer2.equals("Ναι")){
                            System.out.println("Δώσε νέο κωδικό");
                            Scanner CodeEdit2 = new Scanner(System.in);
                            String codeEdit2 = CodeEdit2.nextLine();
                            an.setCode(codeEdit2);
                        }
                        System.out.println("Θέλεις να αλλάξεις ομοταξία; Ναι ή Όχι");
                        Scanner Answer3 = new Scanner(System.in);
                        String answer3 = Answer1.nextLine();
                        if (answer3.equals("Ναι")){
                            System.out.println("Δώσε νέα ομοταξία");
                            Scanner ClassEdit = new Scanner(System.in);
                            String classEdit = ClassEdit.nextLine();
                            an.setAnimalClass(classEdit);
                        }
                        System.out.println("Θέλεις να αλλάξεις βάρος; Ναι ή Όχι");
                        Scanner Answer4 = new Scanner(System.in);
                        String answer4 = Answer1.nextLine();
                        if (answer4.equals("Ναι")){
                            System.out.println("Δώσε νέο βάρος");
                            Scanner WeightEdit = new Scanner(System.in);
                            int weightEdit = WeightEdit.nextInt();
                            an.setWeight(weightEdit);
                        }
                        System.out.println("Θέλεις να αλλάξεις ηλικία; Ναι ή Όχι");
                        Scanner Answer5 = new Scanner(System.in);
                        String answer5 = Answer1.nextLine();
                        if (answer5.equals("Ναι")){
                            System.out.println("Δώσε νέα ηλικία");
                            Scanner AgeEdit = new Scanner(System.in);
                            int ageEdit = AgeEdit.nextInt();
                            an.setAge(ageEdit);
                        }
                    }
                }
            }
            else if (answer == 6){
                // Ο χρήστης δίνει την θέση του ζώου στον πίνακα και επειδή η μέτρηση ξεκινάει απο το 0 αφαιρούμε 1 επειδή αυτός ξέρει ότι η αρίθμηση ξεκινάει από το 1//
                System.out.println("Γράψε την θέση στην λίστα την οποία έχει το ζώο που θέλεις να διαγράψεις");
                Scanner Delete = new Scanner(System.in);
                int delete = Delete.nextInt();
                delete = delete - 1;
                animalList.remove(delete);
            }
            System.out.println("Για την επόμενη διαδικασία που θέλετε να πραγματοποιήσετε επιλέξτε τον αντίστοιχο αριθμό:");
        }

    }
}





















