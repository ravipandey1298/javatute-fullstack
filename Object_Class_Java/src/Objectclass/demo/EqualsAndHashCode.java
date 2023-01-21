package Objectclass.demo;

class Address1 {

	private String doorNo;
	private String street;

	public Address1(String doorNo, String street) {
		this.doorNo = doorNo;
		this.street = street;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public boolean equals(Object address) {
		Address1 otherAddress = (Address1) address;
		if (this.doorNo.equals(otherAddress.doorNo) && this.street.equals(otherAddress.street))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return 1 + doorNo.hashCode() + street.hashCode();
	}

}

public class EqualsAndHashCode {
	public static void main(String[] args) {
		Address1 addressOne = new Address1("11", "Oxford Street");
		Address1 addressTwo = new Address1("11", "Oxford Street");

		// The equality of two objects are being checked using equals() method
		if (addressOne.equals(addressTwo)) {
			System.out.println("The address objects are same!");
		} else {
			System.out.println("The address objects are different!");
		}

		/*
		 * Compare the following input with the addressOne and see the result Address
		 * addressTwo=new Address1("11","Hillview Street");
		 */

	}
}
