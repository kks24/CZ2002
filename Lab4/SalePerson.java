
public class SalePerson {
	
	private String firstName;
	private String lastName;
	private int totalSales;

	public SalePerson() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}
	
	public String toString() {
		String format = this.getFirstName() + "," + this.getLastName() + " : " + this.getTotalSales();
		return format;
	}
	
	public boolean equals(Object o) {
		if (o instanceof SalePerson) {

            SalePerson sales = (SalePerson) o;
            if (this.getFirstName() == sales.getFirstName() && this.getLastName() == sales.getLastName()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
	}
	
	public int compareTo(Object o) {
        if (o instanceof SalePerson) {

            SalePerson sales = (SalePerson) o;
            if (this.getTotalSales() > sales.getTotalSales()) {
                return 1;
            } 
            else if (this.getTotalSales() == sales.getTotalSales()) {
            	if (this.getLastName().charAt(0) < sales.getLastName().charAt(0)) {
            		return 1;
            	}
            	else if (this.getLastName().charAt(0) > sales.getLastName().charAt(0)) {
            		return -1;
            	}
            }
            else if (this.getTotalSales()< sales.getTotalSales()) {
                return -1;
            }
        }
        return 0;
    }
	

}
