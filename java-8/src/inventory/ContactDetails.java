package inventory;

import java.util.Objects;

public class ContactDetails {

	private String addressId;
	private String contactName;
	private String doorNo;
	private String buildingName;
	private String areaOrStreetName;
	private String locality;
	private String city;
	private String state;
	private String landMark;
	private String mobileNo;
	private String alternateMobileNo;
	private AddressType addressType;

	public ContactDetails() {
		super();
	}

	public ContactDetails(String addressId, String contactName, String doorNo, String buildingName, String areaOrStreetName,
			String locality, String city, String state, String landMark, String mobileNo, String alternateMobileNo,
			AddressType addressType) {
		super();
		this.addressId = addressId;
		this.contactName = contactName;
		this.doorNo = doorNo;
		this.buildingName = buildingName;
		this.areaOrStreetName = areaOrStreetName;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.landMark = landMark;
		this.mobileNo = mobileNo;
		this.alternateMobileNo = alternateMobileNo;
		this.addressType = addressType;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getAreaOrStreetName() {
		return areaOrStreetName;
	}

	public void setAreaOrStreetName(String areaOrStreetName) {
		this.areaOrStreetName = areaOrStreetName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAlternateMobileNo() {
		return alternateMobileNo;
	}

	public void setAlternateMobileNo(String alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressId, addressType, alternateMobileNo, areaOrStreetName, buildingName, city,
				contactName, doorNo, landMark, locality, mobileNo, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDetails other = (ContactDetails) obj;
		return Objects.equals(addressId, other.addressId) && addressType == other.addressType
				&& Objects.equals(alternateMobileNo, other.alternateMobileNo)
				&& Objects.equals(areaOrStreetName, other.areaOrStreetName)
				&& Objects.equals(buildingName, other.buildingName) && Objects.equals(city, other.city)
				&& Objects.equals(contactName, other.contactName) && Objects.equals(doorNo, other.doorNo)
				&& Objects.equals(landMark, other.landMark) && Objects.equals(locality, other.locality)
				&& Objects.equals(mobileNo, other.mobileNo) && Objects.equals(state, other.state);
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", contactName=" + contactName + ", doorNo=" + doorNo
				+ ", buildingName=" + buildingName + ", areaOrStreetName=" + areaOrStreetName + ", locality=" + locality
				+ ", city=" + city + ", state=" + state + ", landMark=" + landMark + ", mobileNo=" + mobileNo
				+ ", alternateMobileNo=" + alternateMobileNo + ", addressType=" + addressType + "]";
	}

}
