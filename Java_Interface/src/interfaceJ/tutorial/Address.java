package interfaceJ.tutorial;

public class Address {
	public String houseNo;
	public String city;
	public int zipCode;
	public String country;
	
	public Address(String houseNo, String city, String country, int zipCode) {
		super();
		this.houseNo = houseNo; 
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
}
