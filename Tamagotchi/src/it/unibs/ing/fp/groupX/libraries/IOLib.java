/**
 * 
 */
package it.unibs.ing.fp.groupX.libraries;

import java.util.Scanner;


/**
 * @author Gruppo X ( Manuel Mazzardi, Paolo Pasquali, Davide Tosatto )
 *
 */
public class IOLib
{
	/**
	 * Stampa su console una riga di testo
	 * @param msg Stringa di testo da stampare
	 */
	public static void printLine (String msg)
	{
		System.out.println(msg);
	}
	
	/**
	 * Legge da tastiera un numero intero
	 * @return Numero letto
	 */
	public static int readInt () 
	{
		Scanner scnr = new Scanner(System.in);
		return scnr.nextInt ();
	}
	
	/**
	 * Legga da tastiera un numero double
	 * @return Numero letto
	 */
	public static double readDouble ()
	{
		Scanner scnr = new Scanner(System.in);
		return scnr.nextDouble ();
	}
	
	
}
