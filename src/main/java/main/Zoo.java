package main;

import java.util.ArrayList;

public class Zoo {
    private static ArrayList<Animal> animalList = new ArrayList<>();


    public static void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public static void listAnimals(String zooName) {
        System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
        Integer round = 0;
        for (Animal animals : animalList) {
            System.out.println(animalList.get(round).animalType + ": " + animalList.get(round).animalName + ", " + animalList.get(round).animalAge + " vuotta");
            round++;
        }
    }

    public static void runAnimals(Integer laps) {
        int n = 0;
        for (Animal animal : animalList) {
            int j = 0;
            while (j < laps){
                System.out.println(animalList.get(n).animalName + " juoksee kovaa vauhtia!");
                j++;
            }
            n++;
        }
    }


}