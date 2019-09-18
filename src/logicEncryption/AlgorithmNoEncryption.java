package logicEncryption;



public class AlgorithmNoEncryption implements IEncryptionAlgorithm{

	@Override
	public String encrypt(String msg, String key) {
		return msg;
	}
}
