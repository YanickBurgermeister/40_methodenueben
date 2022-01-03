package ch.bbw.pr.methoden;

/**
 * App
 * @author Peter Rutschmann
 * @version 03.01.2022
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Implementieren Sie Methoden, Parameter, Returnwerte und Aufrufe." );

        //Vertiefungsübung Methoden Teil 1
        System.out.println( "Vertiefungsübung Methoden Teil 1" );
        Person myPerson = new Person("Paul Muster");
        myPerson.printName();
        int alter = myPerson.getAlter(2000, 2022);
        System.out.println("Mein Alter beträgt: " + alter + " Jahre.");

        //Vertiefungsübung Methoden Teil 2
        // Aufruf der Methoden zur Klasse Auto
        System.out.println( "\nVertiefungsübung Methoden Teil 2" );


        //Vertiefungsübung Methoden Teil 3
        // Aufruf der Methoden zur Klasse Menschen
        System.out.println( "\nVertiefungsübung Methoden Teil 3" );

    }
}
