package Bookcase;

public class Book {
    private String Author; // Автор
    private String Title; // Название
    private int YearPublication; // год издания

    private int LengthBookInformation; // длина информаций о книге

    public Book(String author, String title, int yearPublication, int lengthBookInformation) {
        Author = author;
        Title = title;
        YearPublication = yearPublication;
        LengthBookInformation = lengthBookInformation;
    }

    public String getTitle() {
        return Title;
    }

    public int getLengthBookInformation() {
        return LengthBookInformation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", YearPublication=" + YearPublication +
                '}';
    }
}
