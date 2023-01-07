package constructorOverloading.tutorial;

public class Address {
	private String houseNo;
	private String city;
	private String zipCode;
	private String country;
		
	public Address(String houseNo, String city, String zipCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
