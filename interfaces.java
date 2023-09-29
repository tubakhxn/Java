/*W.A.P in java to show the use of interface and print "hello"
// Name:Tuba Khan
// roll no:R2142221210
// SAP ID: 500105642
 Date:22/09/23*/



public class interfaces {
    public static void main(String[] args) {
        myclass m = new myclass();
        m.disp();
    }

}

interface mydisp {
    void disp();
}

class myclass implements mydisp {
    public void disp() {
        System.out.println("Hello");

    }
}