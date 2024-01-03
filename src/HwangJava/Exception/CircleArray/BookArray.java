//Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고,
//사용자로 부터 책의 제목 title과 저자 author를 입력 받아 배열을 완성하라
package HwangJava.Exception.CircleArray;

import java.util.Scanner;

class Book {
    String title, author;
public Book(String title, String author) {
    this.title = title;
    this.author = author;
}
}


public class BookArray {
    public static void main(String[] args) {
        Book [] book = new Book[2]; //Book 배열 선언
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<book.length; i++) {
            System.out.println("제목을 입력");
            String title = sc.nextLine();
            System.out.println("작가를 입력하세요");
            String author = sc.nextLine();
            book[i] = new Book(title, author); // 배열 원소 객체 생성
        }
        for(int i=0; i<book.length; i++)
            System.out.println("(" + book[i].title + "," + book[i].author + ")");
    }
}