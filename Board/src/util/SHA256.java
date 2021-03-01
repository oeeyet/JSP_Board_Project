package util;

import java.security.MessageDigest;


public class SHA256 {
	public static String getSHA256(String input) {
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); // 알고리즘을 적용시켜줌.
			byte[] salt = "Hello! This is salt.".getBytes();	// 해커 방지
			digest.reset();
			digest.update(salt);
			byte[] chars = digest.digest(input.getBytes("UTF-8"));
			for(int i = 0; i < chars.length; i++) {
				String hex = Integer.toHexString(0xff & chars[i]);
				if(hex.length() == 1) result.append("0");
				result.append(hex);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result.toString();
	}
}
