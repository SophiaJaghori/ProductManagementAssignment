package cogent.infotech.model;

import java.util.Date;

public class Product {
	int pId;
	String pName;
	String pCat;
	Date manufecture_date;
	Date price_expiry_date;
	public Product(int pId, String pName, String pCat, Date manufecture_date, Date price_expiry_date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCat = pCat;
		this.manufecture_date = manufecture_date;
		this.price_expiry_date = price_expiry_date;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCat() {
		return pCat;
	}
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	public Date getManufecture_date() {
		return manufecture_date;
	}
	public void setManufecture_date(Date manufecture_date) {
		this.manufecture_date = manufecture_date;
	}
	public Date getPrice_expiry_date() {
		return price_expiry_date;
	}
	public void setPrice_expiry_date(Date price_expiry_date) {
		this.price_expiry_date = price_expiry_date;
	}
	@Override
	public String toString() {
		return "porduct id " + this.pId + " product name "+this.pName + " product manufecture date "+this.getManufecture_date()+ " product expiry date" +
				this.getPrice_expiry_date();
	}

}
