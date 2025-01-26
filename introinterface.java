interface Computer {
    public void code();
}

class laptop implements Computer {
    public void code() {
        System.out.println("I am coding in laptop");
    }
}

class desktop implements Computer {
    public void code() {
        System.out.println("I am coding in desktop");
    }
}

class developer {
    public void devApp(Computer lap) {  // interface  ko use krna ke liya class ki jarurat pdti hai in which we pass the parameter of the interface 
        lap.code();
    }
}

public class introinterface {
    public static void main(String args[]) {
        laptop  lapt= new laptop();
        desktop des = new desktop();
        developer dev = new developer();
        dev.devApp(lapt);
    }
}
