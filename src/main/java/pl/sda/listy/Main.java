package pl.sda.listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lista lista = new ListaImplementacja();


        //Badz tez mozna tak ale jak by dluzsza nieco droga ;)
        //ListaImplementacja lista2 = new ListaImplementacja();

        lista.dodajElement(1);
        lista.dodajElement(2);
        lista.dodajElement(3);
        lista.dodajElement(4);
        lista.dodajElement(5);
        lista.dodajElement(6);
        lista.dodajElement(7);
        lista.dodajElement(8);
        lista.dodajElement(9);
        lista.dodajElement(10);
        lista.dodajElement(11);
        lista.dodajElement(12);
        lista.dodajElement(13);
        lista.dodajElement(14);
        lista.dodajElement(15);
        lista.dodajElement(16);
        lista.dodajElement(17);

        System.out.println(lista);

        StringBuilder s = new StringBuilder();
        s.append("Hej");
        s.append("CZESC");
        s.append("22521");
        System.out.println(s);

        Generyka <Integer> generyka = new Generyka<>();
        generyka.wyswietl(123321);

        Generyka <String> generykaS = new Generyka<>();
        generykaS.wyswietl("Hello");
        

        int tab[] = new int[5];
        System.out.println(tab.length);
        tab = Arrays.copyOf(tab,20);
        System.out.println(tab.length);
    }



}
