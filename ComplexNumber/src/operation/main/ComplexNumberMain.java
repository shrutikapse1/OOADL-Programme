package operation.main;

class ComplexNumberOperation {
	private int real;
	private int imginary;

	public ComplexNumberOperation(int real, int imginary) {
		this.real = real;
		this.imginary = imginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImginary() {
		return imginary;
	}

	public void setImginary(int imginary) {
		this.imginary = imginary;
	}
    public ComplexNumberMain Add(ComplexNumberMain p) {
    	ComplexNumberMain z=new ComplexNumberMain();
    	z.real=p.real+this.real;
    	return z;
    }

}

public class ComplexNumberMain {

	public static void main(String[] args) {
		ComplexNumberOperation a = new ComplexNumberOperation(5, 7);
		ComplexNumberOperation b = new ComplexNumberOperation(3, 4);

	}

}
