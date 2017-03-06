import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ControlsOne {
	JFrame frm;
	JButton btn1;
	JButton btn2;
	JLabel lbl1;
	JLabel lbl2;
	JTextField txt1;
	JTextField txt2;
	JRadioButton rdb1;
	JRadioButton rdb2;
	JCheckBox chk1;
	JCheckBox chk2;
	JComboBox cmb;
	JList lst;
	JTextArea txa;
	JScrollPane scptxa;
	ButtonGroup btng;
	public static void main(String args[]){
		ControlsOne co = new ControlsOne();
		
	}
	
	ControlsOne(){
		initGui();
	}
	public void initGui(){
	frm = new JFrame("Constrols");
	btn1 = new JButton("OK");
	btn2 = new JButton("Save");
	lbl1 = new JLabel("Name : ");
	lbl2 = new JLabel("Name : ");
	txt1 = new JTextField("Siva");
	txt2 = new JTextField("12000");
	rdb1 = new JRadioButton("Male");
	rdb2 = new JRadioButton("Female");
	chk1 = new JCheckBox("Option - 1");
	chk2 = new JCheckBox("Option - 2");

	txa = new JTextArea("",4,20);
	scptxa = new JScrollPane(txa);
	btng = new ButtonGroup();
	
	rdb1.setSelected(true);
	chk1.setSelected(true);
	btng.add(rdb1);
	btng.add(rdb2);

DefaultListModel lstm = new DefaultListModel();
DefaultComboBoxModel cmbm = new DefaultComboBoxModel();

lstm.add(0,"January");
lstm.add(1,"Febraury");
lstm.add(2,"March");
lstm.add(3,"April");

cmbm.addElement("Monday");
cmbm.addElement("Tuesday");
cmbm.addElement("Wednesday");
cmbm.addElement("Thursday");

cmb = new JComboBox(cmbm);
lst = new JList(lstm);

	
	// JRadioButton radApple = new JRadioButton("Apple", true);	
	frm.setSize(300,400);
	frm.setLayout(new FlowLayout());
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(lbl1);
		frm.add(lbl2);
		frm.add(rdb1);
		frm.add(rdb2);
		frm.add(chk1);
		frm.add(chk2);
		frm.add(cmb);
		frm.add(lst);
		frm.add(scptxa);		
		

	frm.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent windowevent){
			System.exit(0);
		}
	});

	frm.setVisible(true);
		
	}	
	
}