package com.company;
import java.util.Scanner;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_ENTER;

public class Main {

    public static String najveciGrad(String niz[]){
        int b=0;
        String grad;
        for(String r: niz){

          //  while(r.equals(",")){
                grad=r;

        //    }

        }




    return niz[b];
   }


    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);


        String unos[];
        unos=new String[10000];
        int i=0,brojac=1;
      vile:while(true){//petlja ce se vrtiti beskonacno

             unos[i]=ulaz.nextLine();//unos u niz

          if(unos[i].equals("")) {// ako se unese prazan red unos se prekida
                 break vile;
             }

             i++;
             brojac++;//brojimo duzinu niza

        }


        for(int c=0;c<brojac;c++){
            System.out.println(unos[c]);

        }
        //Hocu da napravim funkciju da uzima vrijednosti stringa tako sto naslucuje za grad da je prvo slovo, za drzvu da je prvo
        //zarez jer u unosu je stavio sarajevo,bosna nema razmaka i mogu tako naslutiti sta je grad drzava




    }
}
