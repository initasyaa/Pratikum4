public class TestStatic {

    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //Main methods
    public static void main(String[] args) {
        myStaticMethod(); //memanggil static method
        //myPublicMethod(); outputnua akan error

        TestStatic myObj = new TestStatic(); //membuat objek dari myclass
        myObj.myPublicMethod(); // memanggil public method
    }
}