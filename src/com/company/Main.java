package com.company;

public class Main {


    public static void main(String[] args) {
	//   Box деген generic класс тузунуз.
   //  Ичинде Box деген объектти кайтарган статический generic метод болсун.

    Box<String> box = new Box<String>("Box");

        System.out.println(box);
    }
}
