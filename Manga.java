// this is inheritance, can see by the extends
class Manga extends Book{
    // we want to use the book class fields so we create a constructor with the keyword 'super'.
    // super = used in subclass and refers to the parent class
    public Manga(String author, String title, int year) {
        super(author, title, year);
    }
}
