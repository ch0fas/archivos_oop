public class PreClase16
{
    public static class A
    {
        static
        {
            System.out.println("Static de A");
        }

        public A()
        {
            System.out.println("Constructor de A");
        }

        public static void m1()
        {
            System.out.println("m1 de A");
        }

        public static void m2()
        {
            System.out.println("m2 de A");
        }
    }

    public static class B extends A
    {
        static
        {
            System.out.println("Static de B");
        }

        public B()
        {
            System.out.println("Constructor de B");
        }

        public static void m1()
        {
            System.out.println("m1 de B");
        }

        public static void m3()
        {
            System.out.println("m3 de B");
        }
    }

    public static void main(String[] args)
    {
        // Ejecuta
        // Static de A
        // Static de B
        // Constructor de A
        // Constructor de B
        B.m1(); // Ejecuta m1 de B
        B.m2(); // Ejecuta m2 de A
    }
}