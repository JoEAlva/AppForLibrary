/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JorgeIgnacio
 */
public class Book {
    
    private String idBook;
    private String name;
    private String author;
    private String title;
    private String cathegory;

    public Book(String idBook, String name, String author, String title, String cathegory) {
        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.title = title;
        this.cathegory = cathegory;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }
    
}//End Book
