package cogent.infotech.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cogent.infotech.dao.ProductDAOImpl;

public class ProductController {
	ProductDAOImpl dao = new ProductDAOImpl();
	public void create(int pId, String pName, String pCat, String manufecture_date, String price_expiry_date ) {
		dao.addProduct(pId,pName, pCat,manufecture_date, price_expiry_date);
	}
	public void delete(int pid) {
		dao.deleteProductById(pid);
	}
	public void delete(String pcat) {
		dao.deleteProductByCat(pcat);
	}
	public void find(String pcat) {
		dao.findeProductByCat(pcat);
	}
	public void update(String pname, int newPrice) {
		dao.updateProduct(pname, newPrice);
	}
	public void findExpired() {
		dao.findExpiredProduct();
	}
}
