package com.company;

public class plant {
    boolean needsWatering;
    String plantFamily;
    String Name;

    void wateringInstructions(){
        System.out.println("Lightly sprinkle 1 cup of water.");
    }
    void sunlightRequirements(){
        System.out.println("Be in sunlight for 5 hours a day.");
    }

    void plantStatements(){
        System.out.println("Plant Info: ");
        System.out.println("Needs watering:" + needsWatering);
        System.out.println(plantFamily);
        System.out.println(Name);
    }

}
