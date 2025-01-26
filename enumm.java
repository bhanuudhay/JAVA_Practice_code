
enum Status {
    running, failed, pending, success;
}

public class enumm {
    public static void main(String args[]) {
        /*
         * Status ss = Status.running;
         * System.out.println(ss.ordinal()); // gives index at where it present
         */

        Status s[] = Status.values();
        for (Status sss : s) {
            System.out.println(sss + ":" + sss.ordinal());
        }
    }
}