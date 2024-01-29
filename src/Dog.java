public class Dog extends Pet {
    private String name;
    private String breed;
    private int commands;

    public Dog(String name, String breed, int commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, String shelter) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.shelter = shelter;
    }

    public Dog(String name, String breed, Color color, String shelter, int commands) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.shelter = shelter;
        this.commands = commands;
    }

    void makeVoice(String voice, int number) {
        System.out.println(voice + " " + number);
    }
    void makeVoice(int number, String voice){
        System.out.println(number + " " + voice);
    }
    public String getInfo(){
        System.out.println("Возвраст: " + getAge() + "\n" + "Цвет: " + color + "\n" + "Приют: " + shelter + "\n" + "Имя: " + name + "\n" + "Порода: " + breed + "\n" + "Команды: " + commands + "\n");
        return toString();
    }
}