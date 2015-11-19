package com.iteach.utility;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * encryptor class.
 * 
 * @author root
 *
 */
public class EncryptionUtility {

	private static final String characterEncoding = "UTF-8";
	private static final String cipherTransformation = "AES/CBC/PKCS5Padding";
	private static final String aesEncryptionAlgorithm = "AES";

	/**
	 * Method to decrypt the given cypher text
	 * 
	 * @param cipherText
	 * @param key
	 * @param initialVector
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	private static byte[] decrypt(byte[] cipherText, byte[] key,
			byte[] initialVector) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherTransformation);
		SecretKeySpec secretKeySpecy = new SecretKeySpec(key,
				aesEncryptionAlgorithm);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(initialVector);
		cipher.init(Cipher.DECRYPT_MODE, secretKeySpecy, ivParameterSpec);
		cipherText = cipher.doFinal(cipherText);
		return cipherText;
	}

	/**
	 * method to encrypt the given plain text
	 * 
	 * @param plainText
	 * @param key
	 * @param initialVector
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeyException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	private static byte[] encrypt(byte[] plainText, byte[] key,
			byte[] initialVector) throws NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException {
		Cipher cipher = Cipher.getInstance(cipherTransformation);
		SecretKeySpec secretKeySpec = new SecretKeySpec(key,
				aesEncryptionAlgorithm);
		IvParameterSpec ivParameterSpec = new IvParameterSpec(initialVector);
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		plainText = cipher.doFinal(plainText);
		return plainText;
	}

	/**
	 * method to get the key bytes
	 * 
	 * @param key
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private static byte[] getKeyBytes(String key)
			throws UnsupportedEncodingException {
		byte[] keyBytes = new byte[16];
		byte[] parameterKeyBytes = key.getBytes(characterEncoding);
		System.arraycopy(parameterKeyBytes, 0, keyBytes, 0,
				Math.min(parameterKeyBytes.length, keyBytes.length));
		return keyBytes;
	}

	/**
	 * Encrypts plaintext using AES 128bit key and a Chain Block Cipher and
	 * returns a base64 encoded string
	 * 
	 * @param plainText
	 * @param key
	 * @return Base64 encoded string
	 * @throws UnsupportedEncodingException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public static String encrypt(String plainText, String key)
			throws UnsupportedEncodingException, InvalidKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException {
		byte[] plainTextbytes = plainText.getBytes(characterEncoding);
		byte[] keyBytes = getKeyBytes(key);
		return Base64.encodeBase64String(encrypt(plainTextbytes, keyBytes,
				keyBytes));
	}

	/**
	 * Decrypts a base64 encoded string using the given key (AES 128bit key and
	 * a Chain Block Cipher)
	 * 
	 * @param encryptedText
	 * @param key
	 * @return Decrypted String
	 * @throws KeyException
	 * @throws GeneralSecurityException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws IOException
	 */
	public static String decrypt(String encryptedText, String key)
			throws KeyException, GeneralSecurityException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException,
			BadPaddingException, IOException {
		byte[] cipheredBytes = Base64.decodeBase64(encryptedText);
		byte[] keyBytes = getKeyBytes(key);
		return new String(decrypt(cipheredBytes, keyBytes, keyBytes),
				characterEncoding);
	}
}
