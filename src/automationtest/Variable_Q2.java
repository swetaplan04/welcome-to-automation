package automationtest;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Variable_Q2 {

    int id;
    String name;

   public Variable_Q2(int id, String name) {
       this.id = id;
       this.name = name;

    }

    public void display() {
        System.out.println(id + " " + name);

    }

    public static void main(String[] args) {

        Variable_Q2 obj1 = new Variable_Q2(101,"Sweta");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102,"Prime");
        obj2.display();
   }
}