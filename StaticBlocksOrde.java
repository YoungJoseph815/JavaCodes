

public class StaticBlocksOrder {
  
  //What is the squence of execution of static block/instance block/static variable/constructor/method
  
    static {
        System.out.println("static block executed");
    }

    {
        System.out.println("instance block executed");
    }

    static String name="static variable executed";

    public StaticBlocksOrder() {
        System.out.println("constructor executed");
    }

    public static void funMethod() {
        System.out.println("method executed");
    }

    public static void main(String args[ ])  {
        System.out.println(StaticBlocksOrder.name);
        new StaticBlocksOrder().funMethod();
    }
}

// ********Output*******
//static block executed
//static variable executed
//instance block executed
//constructor executed
//method executed
