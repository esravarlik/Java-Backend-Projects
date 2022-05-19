package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        Map<String,String> bookDictionary = new HashMap<>();
        ArrayList<Book> pageOverHundred = new ArrayList<>();

        bookList.add(new Book("Dune", 712, "Frank Herbert", 1965));
        bookList.add(new Book("Red Rising", 448, "Pierce Brown", 2014));
        bookList.add(new Book("Animal Farm", 152, "George Orwell", 1945));
        bookList.add(new Book("Morning Star", 518, "Pierce Brown", 2016));
        bookList.add(new Book("Golden Son", 464, "Pierce Brown", 2015));
        bookList.add(new Book("Icimizdeki Seytan", 267, "Sabahattin Ali", 1940));
        bookList.add(new Book("Kucuk Prens", 96, "Antoine de Saint-Exupéry", 1943));
        bookList.add(new Book("Don Kisot", 184, "Miguel de Cervantes", 1605));
        bookList.add(new Book("Disi Kurdun Ruyalari", 400, "Cengiz Aytmatov", 1986));
        bookList.add(new Book("Beyaz Gemi",168,"Cengiz Aytmatov",1970));


        System.out.println("----------------");
        System.out.println("Library: ");
        bookList.stream().
                forEach(i ->{bookDictionary.put(i.getBookName(), i.getAuthorName());
        });

        for(String key: bookDictionary.keySet()){
            System.out.println(key + "-" + bookDictionary.get(key));
        }

        System.out.println("----------------");
        System.out.println("More than a hundred pages of books: ");

        bookList.stream().filter(i -> i.getPageNumbers() > 100).
                forEach(i -> {pageOverHundred.add(i);
        });

        pageOverHundred.stream().forEach(i -> {
            System.out.println(i.getBookName() + "-" + i.getPageNumbers());
        });

        System.out.println("----------------");
    }
}
