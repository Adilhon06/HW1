public class Pet {
    protected int age;
    protected Color color;
    protected String shelter;

    public int getAge() {
        return generateDefaultAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color);
    }

    public String getShelter() {
        return shelter;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        age = 2;
        return age;
    }
    public String getInfo(){
        return age + " " + color + " " + shelter;
    }
}
