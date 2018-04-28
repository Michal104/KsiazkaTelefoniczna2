//Notatnik z numerami telefonów

import java.util.Scanner;
public class KsiazkaTelefoniczna2 {
    public static void main(String[] args){
        System.out.println("**************************************");
        System.out.println("*Notes z numerami telefonów by Michał*"); //powitanie
        System.out.println("**************************************");
        System.out.println(); //odstęp
        int menu;

//        String tabImie[] = {"","","","Michal","Lukasz","","","","",""};
//        String tabNazwisko[] = {"","","","Dzbanski","Aleksandrowski","","","","",""};   pamięć do testów
//        int tabNumer[] = {0,0,0,790469414,793017485,0,0,0,0,0};

        String tabImie[] = new String[10];
        String tabNazwisko[] = new String[10];  //pusto null
        int tabNumer[] = new int[10];

        String imie;
        String nazwisko;
        int numer;
        String imieNazwisko;

        Scanner odczyt = new Scanner(System.in);  //do typu int
        Scanner odczyt1 = new Scanner(System.in); //do klasy String

        while(true) {
            int i = 0;
            System.out.println("MENU: 1-lista, 2-wyszukaj kontakt, 3-wprowadź kontakt, 4-skasuj kontakt");
            // by wybrać funkcję z menu należy wprowadzić cyfrę od 1-4

            menu = odczyt.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Lista kontaktów: ");
                    for (i = 0; i < 10; i++) {
                        System.out.println(tabImie[i] + " " + tabNazwisko[i] + " " + tabNumer[i]);
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Podaj imię bądź nazwisku:");
                    imieNazwisko = odczyt1.nextLine();

                    for (i = 0; i < 10; i++) {
                        if (tabNazwisko[i].equals(imieNazwisko)) {
                            System.out.println(tabImie[i] + " " + tabNazwisko[i] + " " +tabNumer[i]);
                        }if (tabImie[i].equals(imieNazwisko)) {
                            System.out.println(tabImie[i] + " " + tabNazwisko[i] + " " +tabNumer[i]);
                        }
                    }
                    if(false);
                        System.out.println("Brak kontaktu w bazie.");
                        break;
                case 3:
                    System.out.println("Wprowadź imię");
                    imie = odczyt1.nextLine();
                    tabImie[i] = imie;
                    System.out.println("Wprowadź nazwisko");
                    nazwisko = odczyt1.nextLine();
                    tabNazwisko[i] = nazwisko;
                    System.out.println("Wprowadź 6cyfrowy numer telefonu");
                    numer = odczyt1.nextInt();
                    tabNumer[i] = numer;
                    i++;
                    break;
                case 4:
                    System.out.println("W celu wykasowania wprowadź numer porządkowy z listy kontaktów i naciśnij enter");
                    break;
                default:
                    System.out.println("Wybierz poprawny numer funkcji z zakresu od 1-4");
                    break;
            }


        }
    }
}