package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void Encrypt() {
		String S = JOptionPane.showInputDialog("Message: ");
		S = S.replace("a", "☹");
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test.txt");
			fw.write(S);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
