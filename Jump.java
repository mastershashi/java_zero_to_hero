public class Jump {
    public static void main(String args[]) { 
        System.out.println("Labelled Loop Continue example");
 
        int i = 0;
 
        label1: while (i < 5) {
            System.out.println("outer i= " + i);
            i++;
 
            label2: for (int j = 0; j < 3; j++) {
                if (j == 0) {
 
                    break label1;
                }
                if (i > 1) {
 
                    continue label1;
                }
                System.out.println("inner i= " + i + ", j= " + j);
            }
 
        }
    }
}
