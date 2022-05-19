package com.company;

public class Book {
    private String bookName;
    private int pageNumbers;
    private String authorName;
    private int releaseDate;

    public Book(){

    }

    public Book(String bookName, int pageNumbers, String authorName, int releaseDate){
        this.bookName = bookName;
        this.pageNumbers = pageNumbers;
        this.authorName = authorName;
        this.releaseDate = releaseDate;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
