package by.htp.houseBild.domain;

public class Window extends Aperture{
	private int numberOfGlases;
	private int numberOfLeaflets;
	private int widthOfWindowSill;
	
	{
		numberOfGlases=1;
		numberOfLeaflets=1;
		widthOfWindowSill=0;
	}
	
	public Window() {
		super();
	}

	public Window(int width, int height, int numberOfGlases, int numberOfLeaflets, int widthOfWindowSill) {
		super(width, height);
		this.numberOfGlases = numberOfGlases;
		this.numberOfLeaflets = numberOfLeaflets;
		this.widthOfWindowSill = widthOfWindowSill;
	}

	public int getNumberOfGlases() {
		return numberOfGlases;
	}

	public void setNumberOfGlases(int numberOfGlases) {
		this.numberOfGlases = numberOfGlases;
	}

	public int getNumberOfLeaflets() {
		return numberOfLeaflets;
	}

	public void setNumberOfLeaflets(int numberOfLeaflets) {
		this.numberOfLeaflets = numberOfLeaflets;
	}

	public int getWidthOfWindowSill() {
		return widthOfWindowSill;
	}

	public void setWidthOfWindowSill(int widthOfWindowSill) {
		this.widthOfWindowSill = widthOfWindowSill;
	}

	@Override
	public String toString() {
		return "Window [numberOfGlases=" + numberOfGlases + ", numberOfLeaflets=" + numberOfLeaflets
				+ ", widthOfWindowSill=" + widthOfWindowSill + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfGlases;
		result = prime * result + numberOfLeaflets;
		result = prime * result + widthOfWindowSill;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Window other = (Window) obj;
		if (numberOfGlases != other.numberOfGlases)
			return false;
		if (numberOfLeaflets != other.numberOfLeaflets)
			return false;
		if (widthOfWindowSill != other.widthOfWindowSill)
			return false;
		return true;
	}

	
	
	

}
