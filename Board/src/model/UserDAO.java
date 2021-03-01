package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DatabaseUtil;

public class UserDAO {


	 	// 로그인 체크
	   public UserDTO exist(String userName, String userPasswordHash) throws Exception {
	      /* 있으면 Member 객체 리턴, 없으면 null 리턴 */
	      Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;

	      try {
	         // conn = connPool.getConnection();
	         conn = DatabaseUtil.getConnection();
	         stmt = conn.prepareStatement("select userName, userPasswordHash from user where userName = ? and userPasswordHash = ?");
	         stmt.setString(1, userName);
	         stmt.setString(2, userPasswordHash);
	         rs = stmt.executeQuery();

	         if (rs.next()) {
	            return new UserDTO()
	            		.setUserName(rs.getString("userName"))
	            		.setUserPasswordHash(rs.getString("userPasswordHash"));
	         } else {
	            return null;
	         }

	      } catch (Exception e) {
	         throw e;
	      } finally {
	         try {
	            if (stmt != null)
	               stmt.close();
	         } catch (Exception e2) {
	         }
	         try {
	            if (rs != null)
	               rs.close();
	         } catch (Exception e2) {
	         }
	         try {
	            if (conn != null) {
	               conn.close();
	            }
	         } catch (Exception e2) {

	         }
	      }
	   }
}
