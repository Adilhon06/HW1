public enum Color {
    BLACK("Черный"),
    WHITE("Белый"),
    GREY("Серый"),
    BROWN("Коричневый");

    private String title;
    Color(String title){
        this.title = title;
    }

    private String getTitle(){
        return title;
    }
}
