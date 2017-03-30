package by.htp.houseBild.domain;

public class Door  extends Aperture {
	private String material;
	private boolean statusLock ;
	{
		material="wood";
	}
	
	public Door(int width, int height, String material) {
		super(width, height);
		this.material = material;
		
	}
	
	public Door() {
		super();
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean getStatusLock() {
		return statusLock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((material == null) ? 0 : material.hashCode());
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
		Door other = (Door) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	public void lockDoor() {
		if (statusLock){statusLock=false;}
		else {statusLock=true;}
		
	}

	@Override
	public String toString() {
		return "Door [material=" + material + ", statusLock=" + statusLock + "]";
	}

	
	
	
	
}
