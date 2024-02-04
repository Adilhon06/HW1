public class Shelter {
    private final String name;
    private final String address;

    public String getName() {
        return "Название приюта: " + name;
    }

    public String getAddress() {
        return "Адрес: " + address;
    }

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
