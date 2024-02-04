public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Тузик", "Кантек", 4);
        Dog dog2 = new Dog("Грозный", "Питбуль", Color.BROWN, new Shelter("Свободу Животным", "Кожлбердиева 103"));
        Dog dog3 = new Dog("Грозный", "Питбуль", Color.BROWN, new Shelter("Свободу Животным", "Кожлбердиева 103"), 3);

        dog.makeVoice(1, "Woah - Woah");
        dog2.makeVoice(2,"Gav - Gav" );
        dog3.makeVoice(3, "Viv - Viv");

        dog.getInfo();
        dog2.getInfo();
        dog3.getInfo();
    }
}