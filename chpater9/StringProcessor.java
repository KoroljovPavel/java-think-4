package chpater9;

public abstract class StringProcessor implements Processor {

	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	public static String s = "If she weights the same as a duck, she's made of wood";

	public static void main(String[] args) {

	}

}
