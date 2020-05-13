/*
	nama : ilfah sahra
	tanggal : 13 mei 2020
	waktu : 22.30
*/

class A {
    int i = 10;
    void lakukanSesuatu() {
        i--;
        System.out.println("i = " + i);
    }
}

public class BelajarAnonymous {    
    public static void main(String[] args) {    
        A a = new A() {   
            void lakukanSesuatu() { 
                i++;
                System.out.println("i = " + i);
            }   
        };  
       
        a.lakukanSesuatu();
    }   
}  
