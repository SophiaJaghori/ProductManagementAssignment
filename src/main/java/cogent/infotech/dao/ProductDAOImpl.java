package cogent.infotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cogent.infotec.MainClass.JDBCUtils;

public class ProductDAOImpl implements ProductDAO{
	private static final String INSERT_USER_SQL = "INSERT INTO product"+ "(pid, pname, category,manufecture_date, expiry_date)VALUES" +
			"(?,?,?,?,?);";
	


	public void addProduct(int pId, String pName, String pCat, String manufecture_date, String price_expiry_date) {
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(INSERT_USER_SQL);
			pstmt.setInt(1, pId);
			pstmt.setString(2,pName);
			pstmt.setString(3, pCat);
			pstmt.setString(4, manufecture_date);
			pstmt.setString(5, price_expiry_date);
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Record added into db");
			}
			else {
				System.out.println("failed!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}



	public void deleteProductById(int pId) {
		try(Connection connection = JDBCUtils.getConnection()){
			String deleteSQL = "Delete from product where category =?";
			PreparedStatement pstmt = connection.prepareStatement(deleteSQL);
			pstmt.setInt(1, pId);
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("record deleted!");
			}
			else {
				System.out.println("failed to delete record!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}



	public void deleteProductByCat(String pcat) {
		try (Connection connection = JDBCUtils.getConnection()){
			String deleteSQL = "Delete from product where category = ?";
			PreparedStatement pstmt = connection.prepareStatement(deleteSQL);
			pstmt.setString(1, pcat);
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("Record(s) deleted");
			}
			else {
				System.out.println("Failed/Product not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public void findeProductByCat(String pcat) {
		try (Connection connection = JDBCUtils.getConnection()){
			String selectSQL = "Select * from product where category = ?";
			PreparedStatement pstmt = connection.prepareStatement(selectSQL);
			pstmt.setString(1, pcat);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Category: "+rs.getString(3));
				System.out.println("Manufacture Date: "+rs.getDate(4));
				System.out.println("Price: "+rs.getInt(5));
				System.out.println("Expiry Date: "+rs.getDate(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public void updateProduct(String pname, int newPrice) {
		try (Connection connection = JDBCUtils.getConnection()){
			String updateSQL = "update product set price = ? where name = ?";
			PreparedStatement pstmt = connection.prepareStatement(updateSQL);
			pstmt.setInt(1, newPrice);
			pstmt.setString(2, pname);
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("Record(s) updated");
			}
			else {
				System.out.println("Failed/Product not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void findExpiredProduct() {
		try (Connection connection = JDBCUtils.getConnection()){
			String selectSQL = "Select * from product where expiry_date <= current_date()";
			PreparedStatement pstmt = connection.prepareStatement(selectSQL);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Category: "+rs.getString(3));
				System.out.println("Manufacture Date: "+rs.getDate(4));
				System.out.println("Price: "+rs.getInt(5));
				System.out.println("Expiry Date: "+rs.getDate(6));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
