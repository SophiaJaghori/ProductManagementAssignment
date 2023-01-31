package cogent.infotech.dao;

public interface ProductDAO {
	public void addProduct(int pId,
			String pName, String pCat,
			String manufecture_date,
			String price_expiry_date);
	public void deleteProductById(int pId);
	public void deleteProductByCat(String pcat);
	public void findeProductByCat(String pcat);
	public void updateProduct(String pname, int newPrice);
	public void findExpiredProduct();
	

}
