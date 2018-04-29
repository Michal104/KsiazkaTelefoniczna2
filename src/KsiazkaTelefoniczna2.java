//Notatnik z numerami telefonów

import java.util.Scanner;
public class KsiazkaTelefoniczna2 {
    public static void main(String[] args){
        System.out.println("**************************************");
        System.out.println("*Notes z numerami telefonów by Michał*"); //powitanie
        System.out.println("**************************************");
        System.out.println(); //odstęp
        int menu;
        int kasowanie;

        String tabIndeks[] ={"1.","2.","3.","4.","5.","6.","7.","8.","9.","10."};
        String tabImie[] = {"","","","Michal","Lukasz","","","","",""};
        String tabNazwisko[] = {"","","","Dzbanski","Aleksandrowski","","","","",""};   //pamięć do testów
        int tabNumer[] = {0,0,0,790469414,793017485,0,0,0,0,0};

//        String tabImie[] = new String[10];
//        String tabNazwisko[] = new String[10];  //pusto null
//        int tabNumer[] = new int[10];

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
                    System.out.println("LISTA KONTAKTÓW");
                    for (i = 0; i < 10; i++) {
                        System.out.println(tabIndeks[i]+" "+tabImie[i] + " " + tabNazwisko[i] + " " + tabNumer[i]);
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 2:
                    System.out.println("WYSZUKIWANIE KONTAKTU");
                    System.out.println("Podaj imię bądź nazwisku:");
                    imieNazwisko = odczyt1.nextLine();

                    for (i = 0; i < 10; i++) {
                        if (tabNazwisko[i].equals(imieNazwisko)) {
                            System.out.println(tabIndeks[i]+" "+tabImie[i] + " " + tabNazwisko[i] + " " +tabNumer[i]);
                        }
                        if (tabImie[i].equals(imieNazwisko)) {
                            System.out.println(tabIndeks[i]+" "+tabImie[i] + " " + tabNazwisko[i] + " " +tabNumer[i]);
                        }
                    }
                    if(false){
                        System.out.println("Brak kontaktu w bazie.");}
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
                    System.out.println("KASOWANIE KONTAKTÓW");
                    System.out.println("Wybierz poprawny numer z zakresu od 1-10");
                    kasowanie = odczyt.nextInt();

                    switch(kasowanie) {
                        case 1:
                            tabNazwisko[0]="";tabImie[0]="";tabNumer[0]=0;
                            break;
                        case 2:
                            tabNazwisko[1]="";tabImie[1]="";tabNumer[1]=0;
                            break;
                        case 3:
                            tabNazwisko[2]="";tabImie[2]="";tabNumer[2]=0;
                            break;
                        case 4:
                            tabNazwisko[3]="";tabImie[3]="";tabNumer[3]=0;
                            break;
                        case 5:
                            tabNazwisko[4]="";tabImie[4]="";tabNumer[4]=0;
                            break;
                        case 6:
                            tabNazwisko[5]="";tabImie[5]="";tabNumer[5]=0;
                            break;
                        case 7:
                            tabNazwisko[6]="";tabImie[6]="";tabNumer[6]=0;
                            break;
                        case 8:
                            tabNazwisko[7]="";tabImie[7]="";tabNumer[7]=0;
                            break;
                        case 9:
                            tabNazwisko[8]="";tabImie[8]="";tabNumer[8]=0;
                            break;
                        case 10:
                            tabNazwisko[9]="";tabImie[9]="";tabNumer[9]=0;
                            break;
                            default:
                                System.out.println("Wybierz poprawny numer z zakresu od 1-10");
                                break;
                    }
                    break;
                default:
                    System.out.println("Wybierz poprawny numer funkcji z zakresu od 1-4");
                    break;
            }


        }
    }
}