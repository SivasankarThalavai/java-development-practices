package inventory;

import java.util.Objects;

public class Vendor extends ContactDetails {

	private String ventorId;
	private String ventorName;

	public Vendor() {
		super();
	}

	public Vendor(String ventorId, String ventorName) {
		super();
		this.ventorId = ventorId;
		this.ventorName = ventorName;
	}

	public String getVentorId() {
		return ventorId;
	}

	public void setVentorId(String ventorId) {
		this.ventorId = ventorId;
	}

	public String getVentorName() {
		return ventorName;
	}

	public void setVentorName(String ventorName) {
		this.ventorName = ventorName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ventorId, ventorName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(ventorId, other.ventorId) && Objects.equals(ventorName, other.ventorName);
	}

	@Override
	public String toString() {
		return "Ventor [ventorId=" + ventorId + ", ventorName=" + ventorName + "]";
	}

}
