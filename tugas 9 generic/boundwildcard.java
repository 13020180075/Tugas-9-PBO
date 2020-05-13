/*
	nama : ilfah sahra
	tanggal : 13 mei 2020
	waktu : 22.30
*/

import java.util.Arrays;
 import java.util.List;

 public class boundwildcard {
 public static double sumOfList(List list) { 
double s = 0.0; 
for (Number n : list) { 
s += n.doubleValue(); } 
return s; 
} 
public static void main(String[] args) {
 List li = Arrays.asList(1, 2, 3); 
System.out.println("sum = " + sumOfList(li));
 List ld = Arrays.asList(1.2, 2.3, 3.5);
 System.out.println("sum = " + sumOfList(ld)); 
} }
