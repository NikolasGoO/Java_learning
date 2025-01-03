package OOP_exercices;

public class rectangle {
	public double Width;
	public double Height;
	
	public void Area() {
		double area = Width * Height;
		System.out.println("AREA = " + area);
	}
	
	public void Perimeter() {
		double perimeter = (Width * 2) + (Height * 2);
		System.out.println("PERIMETER = " + perimeter);
	}
	
	public void Diagonal() {
		double x = Math.pow(Width, 2);
		double y = Math.pow(Height, 2);
		double sum = x + y;
		double result = Math.sqrt(sum);
		System.out.println("DIAGONAL = " + result);
	}
}
