package by.htp.houseBild.domain;

public class Aperture {
	private int width;
	private int height;
	{ 
		width=0;
		height=0;
	}	
	
	public Aperture() {
		super();
	}

	public Aperture(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Aperture [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aperture other = (Aperture) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}




}



