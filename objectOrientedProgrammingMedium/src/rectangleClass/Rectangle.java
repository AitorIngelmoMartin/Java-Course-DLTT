package rectangleClass;

public class Rectangle {

	private Double lenght;
	private Double width;

	private String material;

	Rectangle() {
		this.lenght = 1.0;
		this.width = 2.0;
	}

	public Double area() {
		return this.lenght * this.width;
	}

	public Double perimeter() {
		return 2 * (this.lenght + this.width);
	}

	public void changeMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	public void increaseWidth(Double additionalWidth) {
		this.width += additionalWidth;
	}

	public void increaseLenght(Double additionalWidth) {
		this.lenght += additionalWidth;
	}

	public void decreaseWidth(Double additionalWidth) {
		if (this.width - additionalWidth < 0) {
			System.out.println("ERROR: u cant have negative widths");

		} else {
			this.width -= additionalWidth;
		}
	}

	public void decreaseLenght(Double additionalWidth) {
		if (this.lenght - additionalWidth < 0) {
			System.out.println("ERROR: u cant have negative widths");

		} else {
			this.lenght -= additionalWidth;
		}
	}

	public Double getLenght() {
		return lenght;
	}

	public void setLenght(Double lenght) {
		this.lenght = lenght;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	public String toString() {
		return String.format("lenght - %f, width - %f, Material - %s", width, lenght, material);
	}
}
