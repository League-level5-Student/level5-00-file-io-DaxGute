package _01_File_Recorder;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Type in a message:");
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/test.txt");
			fw.write(message);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
