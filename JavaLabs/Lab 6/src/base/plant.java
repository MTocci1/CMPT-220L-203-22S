package base;

public class plant {
    boolean needsWatering;
    String plantFamily;
    String name;

    public plant(boolean needsWatering, String plantFamily, String name) {
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.name = name;
        wateringInstructions();
        sunlightRequirements();
        plantStatements();
    }

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
        System.out.println(name);
    }

}
