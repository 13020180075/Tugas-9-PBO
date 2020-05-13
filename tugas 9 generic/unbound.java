/*
	nama : ilfah sahra
	tanggal : 13 mei 2020
	waktu : 22.30
*/
public class unbound {
 public static void printList(List list) {
 229 for (Object elem : list) {
 System.out.print(elem + " ");
 } 
System.out.println();
 }
 public static void main(String[] args) {
 List li = Arrays.asList(1, 2, 3); 
List ls = Arrays.asList("one", "two", "three");
 printList(li); 
printList(ls);
 } 
}
