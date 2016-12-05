import static java.lang.System.out;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
	new Foo().bar();
	Class cl = Class.forName("Foo");
	cl.getMethod("bar", (Class[]) null).invoke(cl.newInstance(), (Object[]) null);
	out.println("Hello World!");
    }
}

class Foo {
    public void bar() {
	out.println("Bar");
    }
}
