public class Book {
    private String name;
    private String contents;
    private int publishYear;
    private String author;

    public Book(String name, String contents) {
        this.name = name;
        this.contents = contents;

    }public Book(String name, String contents, int publishYear, String author) {
        this.name = name;
        this.contents = contents;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    public String getContents() {
        return this.contents;
    }
    public int getpublishYear() {
        return this.publishYear;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public void setpublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString() {
        System.out.println("Name: " + this.name + " Contents: " + this.contents + " PublishYear: " +
                this.publishYear + "Author: " + this.author);
        return name;
    }
}