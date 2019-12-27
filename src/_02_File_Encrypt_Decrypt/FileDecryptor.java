package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;


import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void Decrypt() {
		String message = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/test.txt"));
			String c = br.readLine();
			
			while(c != null) {
				message += c;
				c = br.readLine();
			}
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		message = message.replace("☹", "a");
		JOptionPane.showMessageDialog(null, message);
	}
	public static void main(String[] args) {
		FileEncryptor.Encrypt();
		Decrypt();
	}
}
