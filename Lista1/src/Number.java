
public class Number {

private int value;
	
	public Number(int value) throws IllegalArgumentException{
		if(value < 0) throw new IllegalArgumentException("value is < 0, not Natural number");
		this.value = value;
	}
	
	public void set(int value) throws IllegalArgumentException{
		if(value < 0) throw new IllegalArgumentException("value is < 0, not Natural number");
		this.value = value;
	}
	
	
	public int get() {
		return value;
	}
	
	public String get(int radix) throws IllegalArgumentException{
		if(radix < 2 || radix > 16) throw new IllegalArgumentException("radix is out of <2,16> range");
		return Integer.toString(value, radix);
	}

	public static void main(String[] args) {
		Number value = new Number(1234);
		System.out.println(value.get(2));
	}

}
