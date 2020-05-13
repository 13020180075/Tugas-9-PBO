/*
	nama : ilfah sahra
	tanggal : 13 mei 2020
	waktu : 22.30
*/
Public class genericmethod{
Public static void main (String [] args){
Integer[ ] angka = {1,2,3,4};
String [ ] kata = {“maros”, “gowa”, “sudiang”,”bone”};

Genericmethod. <Integer>print (angka);
Genericmethod. <String>print (kata);
}

Public static <E> void print (E [ ] list) {
For (int I =0 ; I < list.length ; list)
System.out.print ( list [i]+” “);
System.out.println();
}}
