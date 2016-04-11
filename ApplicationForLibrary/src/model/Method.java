/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author JorgeIgnacio
 */
public class Method {
    
    ArrayList<Book> arrayBooks; //Reference
    
    public Method() {//Builder
        
        arrayBooks = new ArrayList<Book>();
        
    }//End Builder class Method
    
    public boolean consultBook(String idBook){
        boolean exist = false;
        return exist;
    }    
    
    public void addBook(String vectorInfo[]){
        Book temp = new Book(vectorInfo[0], vectorInfo[1], vectorInfo[2], vectorInfo[3], vectorInfo[4]);
        arrayBooks.add(temp);
    }//End addBook
    
    public void modifyBook(String vectorInfo[], String idBook) {
        if(existBook(idBook)){
            arrayBooks.get(findIndex(idBook)).setName(vectorInfo[0]);
            arrayBooks.get(findIndex(idBook)).setAuthor(vectorInfo[1]);
            arrayBooks.get(findIndex(idBook)).setTitle(vectorInfo[2]);
            arrayBooks.get(findIndex(idBook)).setCathegory(vectorInfo[3]);
        }
    }
    
    public void deleteBook(String idBook) {
        arrayBooks.remove(findIndex(idBook));
    }
    
    public int findIndex(String idBook) {
        int indexArray = 0;
        for(int i=0 ;i<arrayBooks.size(); i++) {
            if(arrayBooks.get(i).getIdBook().equals(idBook)) {
                indexArray = i;
            }
        }
        return indexArray;
    }
    
    public boolean existBook(String idBook) {
        boolean exist = false;
        for(int i=0; i<arrayBooks.size(); i++) {
            if(arrayBooks.get(i).getIdBook().equals(idBook)) {
                exist = true;
            } 
        }
        return exist;
    }//End 
    
}//End Method
