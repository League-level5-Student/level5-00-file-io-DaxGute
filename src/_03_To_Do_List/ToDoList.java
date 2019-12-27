package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton but1 = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	JButton but4 = new JButton();
	JButton but5 = new JButton();
	ArrayList <String> array = new ArrayList <String> ();
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.setup();
	}
	private void setup() {
		frame.add(panel);
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		but1.setText("Add Task");
		but2.setText("View Tasks");
		but3.setText("Remove Task");
		but4.setText("Save List");
		but5.setText("Load List");
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == but1) {
			array.add(JOptionPane.showInputDialog("Input Task: "));
		}else if(e.getSource() == but2) {
			for (int i = 0; i < array.size(); i++) {
				System.out.println(array.get(i));
			}
		}else if(e.getSource() == but3) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Input Task Number: "));
			array.remove(num);
		}else if(e.getSource() == but4) {
			try {
				FileWriter fw = new FileWriter("src/_03_To_Do_List/test.txt");
				for (int i = 0; i < array.size(); i++) {
					fw.write(array.get(i));
				}
				fw.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == but5) {
			String file = JOptionPane.showInputDialog("Enter in something(src): ");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String c = br.readLine();
				while(c != null) {
					array.add(c);
					c = br.readLine();
				}
				br.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	
	
}
