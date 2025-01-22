
public class rectangle {
	
	private float length = 1.0f ;
	private float width = 1.0f ;
	
	rectangle(){}
	
	rectangle(float length, float width){
		this.length = length ;
		this.width = width ;
	}
	
	public float getLength () {
		return this.length;
	}
	
	public void setLenght(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	private void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length + this.width);
	}
	public String showData() {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]" ;
		
		
	}
	
	public String toString() {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]" ;
		
		
	}
}
