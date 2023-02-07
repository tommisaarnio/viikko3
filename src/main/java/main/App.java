package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Anna eläintarhalle nimi:");
        Scanner sc = new Scanner(System.in);
        String zooName = sc.nextLine();
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            int i = Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    System.out.println("Mikä laji?");
                    String animalType = sc.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String animalName = sc.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    int animalAge = Integer.parseInt(sc.nextLine());
                    Animal animal = new Animal(animalType, animalName, animalAge);
                    Zoo.addAnimal(animal);
                    break;
                case 2:
                    Zoo.listAnimals(zooName);
                    break;
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int laps = Integer.parseInt(sc.nextLine());
                    Zoo.runAnimals(laps);
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    sc.close();
                    exit = true;
                    break;
                default: 
                    System.out.println("Syöte oli väärä");
                    break;
            }
        }
    }
}
