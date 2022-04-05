package automationtest;

public class ForLoop_Q4 {

    public void PrintMyName(String name, int howManytimes) {

        for (int i = 1; i <= howManytimes; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.PrintMyName("Sweta", 10 );
        obj.PrintMyName("Sweta", 15 );
    }
}

