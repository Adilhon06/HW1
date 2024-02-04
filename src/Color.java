public enum Color {

    BLACK("Черный"),
    WHITE("Белый"),
    GRAY("Серый"),
    BROWN("Коричневый");

    private final String title;

    Color(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
