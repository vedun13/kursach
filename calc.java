import java.awt.*; 						// ������ ������ awt
import java.awt.event.ActionEvent; 		// ������ ������ awt.event.ActionEvent
import java.awt.event.ActionListener; 	// ������ ������ awt.event.ActionListener
import java.awt.event.ItemEvent; 		// ������ ������ awt.event.ItemEvent
import java.awt.event.ItemListener; 	// ������ ������ event.ItemListener
import java.text.*; 					// ������ ������ text

import javax.swing.*; 					// ������ ������ swing

import javafx.*;
public class nds
{										// ����������� ������
	private JLabel log;					// ���������� ������� ������ log ���� Jlabel(�������)
	private JLabel log11;				// ���������� ������� ������ log ���� Jlabel(�������)
	private JLabel log1;				// ���������� ������� ������ log1 ���� Jlabel(�������)
    private JLabel log2;				// ���������� ������� ������ log2 ���� Jlabel(�������)
    private JLabel log3;				// ���������� ������� ������ log3 ���� Jlabel(�������)
    private JLabel log4;				// ���������� ������� ������ log4 ���� Jlabel(�������)
    private JLabel log5;				// ���������� ������� ������ log5 ���� Jlabel(�������)
    private JLabel log6;				// ���������� ������� ������ log6 ���� Jlabel(�������)
    private JLabel log7;				// ���������� ������� ������ log7 ���� Jlabel(�������)
    private JLabel log8;				// ���������� ������� ������ log8 ���� Jlabel(�������)
    private JLabel rubl1;				// ���������� ������� ������ rubl1 ���� Jlabel(�������)
    private JLabel rubl2;				// ���������� ������� ������ rubl2 ���� Jlabel(�������)
    private JLabel rubl3;				// ���������� ������� ������ rubl3 ���� Jlabel(�������)
    private JLabel rubl4;				// ���������� ������� ������ rubl4 ���� Jlabel(�������)
    private JLabel result;				// ���������� ������� ������ result ���� Jlabel(�������)
    private JTextField text1;			// ���������� ������� ������ text1 ���� JTextField(��������� ����)
    private JTextField text2;			// ���������� ������� ������ text2 ���� JTextField(��������� ����)
    private JTextField text3;			// ���������� ������� ������ text3 ���� JTextField(��������� ����)
    private JTextField text4;			// ���������� ������� ������ text4 ���� JTextField(��������� ����)
    private JComboBox comboBox;			// ���������� ������� ������ comboBox ���� JComboBox(���������� ������)
    private JComboBox comboBox1;		// ���������� ������� ������ comboBox1 ���� JComboBox(���������� ������)
    private JComboBox comboBox2;		// ���������� ������� ������ comboBox2 ���� JComboBox(���������� ������)
    private JComboBox comboBox3;		// ���������� ������� ������ comboBox1 ���� JComboBox(���������� ������)
    private JComboBox comboBox4;		// ���������� ������� ������ comboBox1 ���� JComboBox(���������� ������)
    private ButtonGroup bg;				// ���������� ������� ������ bg ���� ButtonGroup(������ ������)
    private ButtonGroup bg1;			// ���������� ������� ������ bg1 ���� ButtonGroup(������ ������)
    private ButtonGroup bg2;			// ���������� ������� ������ bg2 ���� ButtonGroup(������ ������)
    private ButtonGroup bg3;			// ���������� ������� ������ bg3 ���� ButtonGroup(������ ������)
    private JButton Button1;			// ���������� ������� ������ Button3 ���� JButton(������)
    private JButton Button2;			// ���������� ������� ������ Button4 ���� JButton(������)
    private JFrame mainFrame;			// ���������� ������� ������ mainFrame ���� JFrame(�����)
      
    nds() {								// ������ ������
//colors
Color back = new Color(245,245,220);
Color font = new Color(132,132,130);
Color button = new Color(255, 229, 180);
//labels  
        log = new JLabel("��������� ��� ������� ���");				// �������� ������� log1 ����  Jlable
       	Font head = new Font("Verdana", Font.BOLD, 12);
       	log.setFont(head);
        log11 = new JLabel("������� ���� ������ � ����");			// �������� ������� log1 ����  Jlable
        log1 = new JLabel("���� ������ �������");					// �������� ������� log1 ����  Jlable
    	log2 = new JLabel("��� ��������");							// �������� ������� log2 ����  Jlable
        log3 = new JLabel("������� ��������� ����������");			// �������� ������� log3 ����  Jlable
        log4 = new JLabel("���������� ����������� �������");		// �������� ������� log4 ����  Jlable
        log5 = new JLabel("���������������� ���");					// �������� ������� log5 ����  Jlable
        log6 = new JLabel("����� � ���");       					// �������� ������� log6 ����  Jlable
        log6.setVisible(false);
        log7 = new JLabel("����� ��� ���");        					// �������� ������� log7 ����  Jlable
        log7.setVisible(false);
        log8 = new JLabel("���");              						// �������� ������� log8 ����  Jlable
        log8.setVisible(false);
       	Font font1 = new Font("", Font.BOLD, 13);
       	log6.setFont(font1);
       	log7.setFont(font1);
       	log8.setFont(font1);
        rubl1 = new JLabel("���");									// �������� ������� rubl1 ����  Jlable
        rubl2 = new JLabel("���");									// �������� ������� rubl2 ����  Jlable
        rubl2.setVisible(false);
        rubl3 = new JLabel("���");									// �������� ������� rubl3 ����  Jlable
        rubl3.setVisible(false);
        rubl4 = new JLabel("���");									// �������� ������� rubl4 ����  Jlable
        rubl4.setVisible(false);
        result = new JLabel("������� ����������� ������");			// �������� ������� result ����  JLabel
        result.setForeground(Color.RED);							// ��������� ����� ������ Jlabel result
//buttons
        Button1 = new JButton("���������");							// �������� ������� Button3 ����  JButton
      	Button1.setEnabled(false);									// ������� ������ Button3 � �� ��������� ��������� (��� �������) ������� setEnabled
      	Button2 = new JButton("������");							// �������� ������� Button4 ����  JButton
      	Button2.setVisible(false);
      	Button1.setBackground(button);
      	Button2.setBackground(button);
// comboboxes
    	String[] items = {											// �������� ����� ������ 			
    			"",													// ������ ������
                "���������� ����",									// ������ ������
                "�������������� ���������������"					// ������ ������
            };														// ����� �������� �����			
    	JComboBox editComboBox = new JComboBox(items);				// ����������� ����� � ���������� ������                        
        comboBox = new JComboBox(items);							// �������� �������  comboBox ����  JComboBox
        comboBox.setEnabled(false);									// ������� ������ �� ������ comboBox � �� ��������� ��������� (��� �������) ������� setEnabled
        
      	String[] items1 = {											// �������� ����� ������ 			
    			"",													// ������ ������
    			"� ���",											// ������ ������
    			"��� ���"											// ������ ������
            };	

      	JComboBox editComboBox1 = new JComboBox(items1);
      	comboBox1 = new JComboBox(items1);
      	String[] items2 = {											// �������� ����� ������ 			
    			"",													// ������ ������
    			"�������",											// ������ ������
    			"�������"											// ������ ������
            };	
      	JComboBox editComboBox2 = new JComboBox(items2);
      	comboBox2 = new JComboBox(items2);
      	comboBox2.setEnabled(false);
      	
      	String[] items3 = {											// �������� ����� ������ 			
    			"",													// ������ ������
    			"����",												// ������ ������
    			"�����������"										// ������ ������
            };	
      	JComboBox editComboBox3 = new JComboBox(items3);
      	comboBox3 = new JComboBox(items3);
      	comboBox3.setEnabled(false);
      	
      	String[] items4 = {											// �������� ����� ������ 			
    			"",													// ������ ������
    			"��",												// ������ ������
    			"���"												// ������ ������
            };	
      	JComboBox editComboBox4 = new JComboBox(items4);
      	comboBox4 = new JComboBox(items4);
      	comboBox4.setEnabled(false);
    comboBox.setBackground(button);
	comboBox1.setBackground(button);
	comboBox2.setBackground(button);
	comboBox3.setBackground(button);
	comboBox4.setBackground(button);
	
//textfields
        text1 = new JTextField("");									// �������� ������� text1 ����  JTextField
        text1.setHorizontalAlignment(JTextField.RIGHT);				// ��������� ������������ ���������� ����� ����� X ����
        text2 = new JTextField("");									// �������� ������� text2 ����  JTextField
        text2.setEditable(false);									// ������ �������������� ����  text2
        text2.setVisible(false);
        text2.setHorizontalAlignment(JTextField.RIGHT);				// ��������� ������������ ���������� ����� ����� X ����
        text3 = new JTextField("");									// �������� ������� text3 ����  JTextField
        text3.setEditable(false);									// ������ �������������� ����  text3		
        text3.setVisible(false);
        text3.setHorizontalAlignment(JTextField.RIGHT);				// ��������� ������������ ���������� ����� ����� X ����
        text4 = new JTextField("");									// �������� ������� text4 ����  JTextField
        text4.setEditable(false);									// ������ �������������� ����  text4		
        text4.setVisible(false);
        text4.setHorizontalAlignment(JTextField.RIGHT);				// ��������� ������������ ���������� ����� ����� X ����
	text1.setBackground(button);
	text2.setBackground(button);
	text3.setBackground(button);
	text4.setBackground(button);
	
 //action listeners       
        ActionListener again = new ActionListener() {				// ���������� ��������� again (��������� ������� ������� �� ������)
            @Override												// ���������� ��������� Override
             public void actionPerformed(ActionEvent ar) {			// ���������� ������ actionPerformed
                comboBox.setSelectedItem("");
                comboBox1.setSelectedItem("");
                comboBox2.setSelectedItem("");
                comboBox3.setSelectedItem("");
                comboBox4.setSelectedItem("");
            	comboBox1.setEnabled(true);	
               	Button1.setEnabled(false);							// ������� ������ Button3 � �� ��������� ��������� (��� �������) ������� setEnabled
            	Button2.setEnabled(false);							// ������� ������ Button4 � �� ��������� ��������� (��� �������) ������� setEnabled
                text1.setEnabled(true);
                log11.setVisible(true);
                log1.setVisible(true);
                log2.setVisible(true);
                log3.setVisible(true);
                log4.setVisible(true);
                log5.setVisible(true);
                text1.setVisible(true);
                comboBox.setVisible(true);
                comboBox1.setVisible(true);
                comboBox2.setVisible(true);
                comboBox3.setVisible(true);
                comboBox4.setVisible(true);
                Button1.setVisible(true);
                rubl1.setVisible(true);
                Button2.setVisible(false);
                log6.setVisible(false);
                log7.setVisible(false);
                log8.setVisible(false);
                text2.setVisible(false);
                text3.setVisible(false);
                text4.setVisible(false);
                rubl2.setVisible(false);
                rubl3.setVisible(false);
                rubl4.setVisible(false);
                result.setText("������� ����������� ������");
            }														// ����� ������ actionPerformed    
        };															//����� ������ ��������� again
        
        final ActionListener bnds1 = new ActionListener() {			// ���������� ��������� bnds1 (��������� ������� ������� �� ������)
            @Override												// ���������� ��������� Override
             public void actionPerformed(ActionEvent calc) {		// ���������� ������ actionPerformed	
               try {												// ���������� ��������� try (������� ��������� ��������)
                double cost2 = Double.parseDouble(text1.getText()); // ����������� ����(Double) ����������(cost2) ������� parseDouble,������������� ���������� cost2 ���������� �������� �� text1
                double nds2 = cost2 * 0.1;							// ����������� ���� ����������(nds2), ������������� nds2 �������� ���������
                double summas2 = cost2 + nds2;						// ����������� ���� ����������(summas2), ������������� summas2 �������� ���������
                double summabez2 = cost2; 							// ����������� ���� ����������(summabez2), ������������� summabez2 �������� ���������
                NumberFormat na = NumberFormat.getInstance();		// ���������� ������ NumberFormat ���������� na ������� getInstance
                na.setMaximumFractionDigits(2);   					// ����������� ���������� ���� ����� ������� �� 2-��
                text2.setText(""+na.format(summas2));				// ����� �������� summas2 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                text3.setText(""+na.format(summabez2));				// ����� �������� summabez2 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                text4.setText(""+na.format(nds2));					// ����� �������� nds2 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                result.setText("");									// ����� ������ "" � ����  result, ��������� ����� setText
                log11.setVisible(false);
                log1.setVisible(false);
                log2.setVisible(false);
                log3.setVisible(false);
                log4.setVisible(false);
                log5.setVisible(false);
                text1.setVisible(false);
                comboBox.setVisible(false);
                comboBox1.setVisible(false);
                comboBox2.setVisible(false);
                comboBox3.setVisible(false);
                comboBox4.setVisible(false);
                Button1.setVisible(false);
                rubl1.setVisible(false);
                Button2.setVisible(true);
                log6.setVisible(true);
                log7.setVisible(true);
                log8.setVisible(true);
                text2.setVisible(true);
                text3.setVisible(true);
                text4.setVisible(true);
                rubl2.setVisible(true);
                rubl3.setVisible(true);
                rubl4.setVisible(true);
                Button2.setEnabled(true);							// ������� ������ Button4 � ��������� ��������� (��� �������) ������� setEnabled
                comboBox1.setEnabled(false);						// ������� ������ comboBox1 � �� ��������� ��������� (��� �������) ������� setEnabled
                comboBox2.setEnabled(false);
                comboBox3.setEnabled(false);
                comboBox4.setEnabled(false);
                comboBox.setEnabled(false);
                text1.setEnabled(false);
                 }													// ����� ���������� �������� ��������� try
             catch ( NumberFormatException error ) {				// �������� ���������� ���������� catch
                    result.setText("��������� �������� ������"); 	// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                    result.setForeground(Color.RED);				// ��������� ����� ������ Jlabel result
              }														// ����� ���������� �������� ��� ��������� ���������� ���������� catch
             }														// ����� ������ actionPerformed    
         };															//����� ������ ��������� bnds1
            final ActionListener bnds2 = new ActionListener() {		// ���������� ��������� bnds2 (��������� ������� ������� �� ������)
            @Override												// ���������� ��������� Override
             public void actionPerformed(ActionEvent calc) {		// ���������� ������ actionPerformed	
                 try {												// ���������� ��������� try (������� ��������� ��������)
                    double cost3 = Double.parseDouble(text1.getText());		// ����������� ����(Double) ����������(cost3) ������� parseDouble,������������� ���������� cost3 ���������� �������� �� text1
                    double nds3 = 0;										// ����������� ���� ����������(nds3), ������������� nds3 �������� ���������
                    double summas3 = cost3 + nds3;							// ����������� ���� ����������(summas3), ������������� summas3 �������� ���������
                    double summabez3 = cost3; 								// ����������� ���� ����������(summabez3), ������������� summabez3 �������� ���������
                    NumberFormat na = NumberFormat.getInstance();			// ���������� ������ NumberFormat ���������� na ������� getInstance
                    na.setMaximumFractionDigits(2);  						// ����������� ���������� ���� ����� ������� �� 2-��
                    text2.setText(""+na.format(summas3));					// ����� �������� summas3 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    text3.setText(""+na.format(summabez3));					// ����� �������� summabez3 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    text4.setText(""+na.format(nds3));						// ����� �������� nds3 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    result.setText("");										// ����� ������ "" � ����  result, ��������� ����� setText
                    log11.setVisible(false);
                    log1.setVisible(false);
                    log2.setVisible(false);
                    log3.setVisible(false);
                    log4.setVisible(false);
                    log5.setVisible(false);
                    text1.setVisible(false);
                    comboBox.setVisible(false);
                    comboBox1.setVisible(false);
                    comboBox2.setVisible(false);
                    comboBox3.setVisible(false);
                    comboBox4.setVisible(false);
                    Button1.setVisible(false);
                    rubl1.setVisible(false);
                    Button2.setVisible(true);
                    log6.setVisible(true);
                    log7.setVisible(true);
                    log8.setVisible(true);
                    text2.setVisible(true);
                    text3.setVisible(true);
                    text4.setVisible(true);
                    rubl2.setVisible(true);
                    rubl3.setVisible(true);
                    rubl4.setVisible(true);
                    Button2.setEnabled(true);		// ������� ������ Button4 � ��������� ��������� (��� �������) ������� setEnabled
                    comboBox1.setEnabled(false);		// ������� ������  comboBox1 � �� ��������� ��������� (��� �������) ������� setEnabled
                    comboBox2.setEnabled(false);
                    comboBox3.setEnabled(false);
                    comboBox4.setEnabled(false);
                    comboBox.setEnabled(false);
                    text1.setEnabled(false);
                 }			// ����� ���������� �������� ��������� try
             catch ( NumberFormatException error ) {				// �������� ���������� ���������� catch
                    result.setText("��������� �������� ������"); 		// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                    result.setForeground(Color.RED);		// ��������� ����� ������ Jlabel result
              }			// ����� ���������� �������� ��� ��������� ���������� ���������� catch
             }			// ����� ������ actionPerformed    
         };				//����� ������ ��������� bnds2       
        final ActionListener snds1 = new ActionListener() {			// ���������� ��������� snds1 (��������� ������� ������� �� ������)
            @Override		// ���������� ��������� Override
             public void actionPerformed(ActionEvent calc) {		// ���������� ������ actionPerformed	
                 try {		// ���������� ��������� try (������� ��������� ��������)
                    double cost4 = Double.parseDouble(text1.getText());		// ����������� ����(Double) ����������(cost4) ������� parseDouble,������������� ���������� cost4 ���������� �������� �� text1
                    double nds4 = cost4-cost4/1.1;		// ����������� ���� ����������(nds4), ������������� nds4 �������� ���������
                    double summas4 = cost4;		// ����������� ���� ����������(summas4), ������������� summas4 �������� ���������
                    double summabez4 = cost4/1.1; 		// ����������� ���� ����������(summabez4), ������������� summabez4 �������� ���������
                    NumberFormat na = NumberFormat.getInstance();		// ���������� ������ NumberFormat ���������� na ������� getInstance
                    na.setMaximumFractionDigits(2); 		// ����������� ���������� ���� ����� ������� �� 2-��
                    text2.setText(""+na.format(summas4));		// ����� �������� summas4 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    text3.setText(""+na.format(summabez4));		// ����� �������� summabez4 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    text4.setText(""+na.format(nds4));		// ����� �������� nds4 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                    result.setText("");		// ����� ������ "" � ����  result, ��������� ����� setText
                    log11.setVisible(false);
                    log1.setVisible(false);
                    log2.setVisible(false);
                    log3.setVisible(false);
                    log4.setVisible(false);
                    log5.setVisible(false);
                    text1.setVisible(false);
                    comboBox.setVisible(false);
                    comboBox1.setVisible(false);
                    comboBox2.setVisible(false);
                    comboBox3.setVisible(false);
                    comboBox4.setVisible(false);
                    Button1.setVisible(false);
                    rubl1.setVisible(false);
                    Button2.setVisible(true);
                    log6.setVisible(true);
                    log7.setVisible(true);
                    log8.setVisible(true);
                    text2.setVisible(true);
                    text3.setVisible(true);
                    text4.setVisible(true);
                    rubl2.setVisible(true);
                    rubl3.setVisible(true);
                    rubl4.setVisible(true);
                    Button2.setEnabled(true);		// ������� ������ Button4 � ��������� ��������� (��� �������) ������� setEnabled
                    comboBox1.setEnabled(false);		// ������� ������ comboBox1 � �� ��������� ��������� (��� �������) ������� setEnabled
                    comboBox2.setEnabled(false);
                    comboBox3.setEnabled(false);
                    comboBox4.setEnabled(false);
                    comboBox.setEnabled(false);
                    text1.setEnabled(false);
                 }			// ����� ���������� �������� ��������� try
             catch ( NumberFormatException error ) {				// �������� ���������� ���������� catch		
                    result.setText("��������� �������� ������");		// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                    result.setForeground(Color.RED);		// ��������� ����� ������ Jlabel result ������� setForeground
              }			// ����� ���������� �������� ��� ��������� ���������� ���������� catch
             }			// ����� ������ actionPerformed    
         };				//����� ������ ��������� snds1        
         final ActionListener snds = new ActionListener() {		// ���������� ��������� snds (��������� ������� ������� �� ������)
              @Override		// ��������� ��������� Override
               public void actionPerformed(ActionEvent calc) {		// ���������� ������ actionPerformed
                   try {		// ���������� ��������� try (������� ��������� ��������)
                      double cost = Double.parseDouble(text1.getText());		// ����������� ����(Double) ����������(cost) ������� parseDouble, ������������� ���������� cost ���������� �������� �� text1
                      double nds = cost-cost/1.18;		// ����������� ���� ����������(nds), ������������� nds �������� ���������
                      double summas = cost;			// ����������� ���� ����������(summas), ������������� (summas �������� ���������		
                      double summabez = cost/1.18; 			// ����������� ���� ����������(summabez), ������������� summabez �������� ���������
                      NumberFormat na = NumberFormat.getInstance();		// ���������� ������ NumberFormat ���������� na ������� getInstance
                      na.setMaximumFractionDigits(2);  		// ����������� ���������� ���� ����� ������� �� 2-��
                      text2.setText(""+na.format(summas));		// ����� �������� summas � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                      text3.setText(""+na.format(summabez));		// ����� �������� summabez � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                      text4.setText(""+na.format(nds));		// ����� �������� nds � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                      result.setText("");		// ����� �����f "" � ����  result, ��������� ����� setText
                      log11.setVisible(false);
                      log1.setVisible(false);
                      log2.setVisible(false);
                      log3.setVisible(false);
                      log4.setVisible(false);
                      log5.setVisible(false);
                      text1.setVisible(false);
                      comboBox.setVisible(false);
                      comboBox1.setVisible(false);
                      comboBox2.setVisible(false);
                      comboBox3.setVisible(false);
                      comboBox4.setVisible(false);
                      Button1.setVisible(false);
                      rubl1.setVisible(false);
                      Button2.setVisible(true);
                      log6.setVisible(true);
                      log7.setVisible(true);
                      log8.setVisible(true);
                      text2.setVisible(true);
                      text3.setVisible(true);
                      text4.setVisible(true);
                      rubl2.setVisible(true);
                      rubl3.setVisible(true);
                      rubl4.setVisible(true);
                      Button2.setEnabled(true);		//������� ������ Button4 � ��������� ���������(��� �������) ������� setEnabled
                      comboBox1.setEnabled(false);		// ������� ������ comboBox1 � �� ��������� ��������� (��� �������) ������� setEnabled
                      comboBox2.setEnabled(false);
                      comboBox3.setEnabled(false);
                      comboBox4.setEnabled(false);
                      comboBox.setEnabled(false);
                      text1.setEnabled(false);
                   }			// ����� ���������� �������� ��������� try