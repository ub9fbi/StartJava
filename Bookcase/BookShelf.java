package Bookcase;

public class BookShelf {
    private static final int CAPACITY = 10;
    public Book[] books = new Book[CAPACITY];

    private int countBooks;     // количество книг

    private int maxLenght;      // максимальная длина массива
    public int getCountBooks() {
        return countBooks;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public void toSaveBook() {       // сохранить книгу

    }
    public void toFindBook() {      // наити книгу

    }
    public void toDeletBook() {// Удалить книгу

    }
    /*public void toGetAllBooks() {      // только для визуализации шкафа

    }*/
    public void toGetNumberBooksTheCloset() {      // количество книг в шкафу

    }
    public void toGetNumberAvailableShelves() {     // количество свободных полок

    }
    public void toCleanCabinet() {      // очистить шкаф

    }


}
