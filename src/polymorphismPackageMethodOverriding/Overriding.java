package polymorphismPackageMethodOverriding;

class Overriding {

    public static void main(String[] args)
    {



        SuperClass superClass;

        superClass = new Subclass1();
        superClass.Print();

        superClass = new Subclass2();
        superClass.Print();
    }
}