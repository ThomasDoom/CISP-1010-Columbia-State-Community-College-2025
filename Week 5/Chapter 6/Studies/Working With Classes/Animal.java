public class Animal {
    // Fields, Attributes, Properties
    private String  type,
                    color,
                    covering;
    private int     numberOfLegs;
    private boolean isTail;

    // Constructors
    public Animal() {
        this.type = "Mammal";
        this.color = "Brown";
        this.covering = "Fur";
        this.numberOfLegs = 4;
        this.isTail = true;

    }

    public Animal(String type) {
        this();
        this.type = type;
    }


    // Getters and setters
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCovering() {
        return this.covering;
    }

    public void setCovering(String covering) {
        this.covering = covering;
    }

    public boolean getIsTail() {
        return this.isTail;
    }

    public void setIsTail(boolean isTail) {
        this.isTail = isTail;
    }

    // Methods
    public void describeAnimal() {
        System.out.println("Animal type: " + getType());
        System.out.println("Number of Legs: " + getNumberOfLegs());
        System.out.println("Color: " + getColor());
        System.out.println("Type of Covering " + getCovering());
        System.out.println("Tail: " + getIsTail());
    }
}

