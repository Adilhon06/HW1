public class Main {
    public static void main(String[] args) {
        Pet dog1 = new Dog("Рекс", "Лабрадор", 3);
        Pet dog2 = new Dog("Тузик", "Кантек", Color.WHITE, "For pets");
        Pet dog3 = new Dog("Хатико", "Киба-Ину", Color.BROWN, "Found Friend For You", 5);

        dog1.getInfo();
        dog2.getInfo();
        dog3.getInfo();
    }
}