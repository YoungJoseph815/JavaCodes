class Parent {

    String str1="Parent class instance variable";
    static String str2="Parent class static variable";
    Parent(){
        System.out.println("Parent class constructor");
    }
}
class Child extends Parent {

    Child(){
        this("Child");
        System.out.println("Child class NOT parameterized constructor");
    }

    Child(String str){
        super();
        System.out.println(str +" class parameterized constructor");
    }
    String str1="Child class instance variable";
    void print()
    {
        System.out.println(super.str1);
        System.out.println(this.str1);
        System.out.println(super.str2);

    }

    public static void main(String[] args)
    {
        new Child().print();
    }
}

//Parent class constructor
//Child class parameterized constructor
//Child class NOT parameterized constructor
//Parent class instance variable
//Child class instance variable
//Parent class static variable
