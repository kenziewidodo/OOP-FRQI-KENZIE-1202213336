package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
    Database db = new Database();
        // TODO Create Menu
    Menu menu1 =new Menu();
    menu1.setName(name:"sate");
    menu1.setCategory(category:"makanan");
    menu1.setPrice(price:"15000");

    Menu menu2 =new Menu();
    menu2.setName(name:"bakso");
    menu2.setCategory(category:"makanan");
    menu2.setPrice(price:"10000");

    Menu menu3 =new Menu();
    menu3.setName(name:"es teh manis");
    menu3.setCategory(category:"minuman");
    menu3.setPrice(price:"3000");
        // TODO Insert Menu to Database
db InsertMenu(menu1);

        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
