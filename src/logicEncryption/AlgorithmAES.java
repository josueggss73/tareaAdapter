package logicEncryption;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class AlgorithmAES implements IEncryptionAlgorithm{

	@Override
	public String encrypt(String msg, String key) {
		return null;
	}
	public static String encrypt(String key, String initVector, String value) {
		try {  
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));  
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES"); 
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");  
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv); 
			byte[] encrypted = cipher.doFinal(value.getBytes());  
			System.out.println("encrypted string: "  + Base64.encode(encrypted)); 
			return Base64.encode(encrypted);
		} 
		catch (Exception ex) {  
			ex.printStackTrace();  
		} 
	return null;  
	}

}
