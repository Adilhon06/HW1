public final class Dog extends Pet{

    private String name;
    private String breed;
    private int commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCommands() {
        return commands;
    }

    public void setCommands(int commands) {
        this.commands = commands;
    }

    public Dog(String name, String breed, int commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter){
        this.name = name;
        this.breed = breed;
        setColor(color);
        setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelter shelter, int commands){
        this.name = name;
        this.breed = breed;
        setColor(color);
        setShelter(shelter);
        this.commands = commands;
    }

    void makeVoice(String voice, int number){
        System.out.println("Голос: " + voice + "\n" + "Номер: " + number);
    }

    void makeVoice(int number, String voice){
        System.out.println("Номер: " + number + "\n" + "Голос: " + voice);
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + "\n" + "Name: " + name + "\n" + "Breed" + breed + "\n" + "Commands: " + commands;
    }
}
