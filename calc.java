import java.awt.*; 						// импорт пакета awt
import java.awt.event.ActionEvent; 		// импорт пакета awt.event.ActionEvent
import java.awt.event.ActionListener; 	// импорт пакета awt.event.ActionListener
import java.awt.event.ItemEvent; 		// импорт пакета awt.event.ItemEvent
import java.awt.event.ItemListener; 	// импорт пакета event.ItemListener
import java.text.*; 					// импорт пакета text

import javax.swing.*; 					// импорт пакета swing

import javafx.*;
public class nds
{										// открывающий символ
	private JLabel log;					// добавление часного модуля log типа Jlabel(надпись)
	private JLabel log11;				// добавление часного модуля log типа Jlabel(надпись)
	private JLabel log1;				// добавление часного модуля log1 типа Jlabel(надпись)
    private JLabel log2;				// добавление часного модуля log2 типа Jlabel(надпись)
    private JLabel log3;				// добавление часного модуля log3 типа Jlabel(надпись)
    private JLabel log4;				// добавление часного модуля log4 типа Jlabel(надпись)
    private JLabel log5;				// добавление часного модуля log5 типа Jlabel(надпись)
    private JLabel log6;				// добавление часного модуля log6 типа Jlabel(надпись)
    private JLabel log7;				// добавление часного модуля log7 типа Jlabel(надпись)
    private JLabel log8;				// добавление часного модуля log8 типа Jlabel(надпись)
    private JLabel rubl1;				// добавление часного модуля rubl1 типа Jlabel(надпись)
    private JLabel rubl2;				// добавление часного модуля rubl2 типа Jlabel(надпись)
    private JLabel rubl3;				// добавление часного модуля rubl3 типа Jlabel(надпись)
    private JLabel rubl4;				// добавление часного модуля rubl4 типа Jlabel(надпись)
    private JLabel result;				// добавление часного модуля result типа Jlabel(надпись)
    private JTextField text1;			// добавление часного модуля text1 типа JTextField(текстовое поле)
    private JTextField text2;			// добавление часного модуля text2 типа JTextField(текстовое поле)
    private JTextField text3;			// добавление часного модуля text3 типа JTextField(текстовое поле)
    private JTextField text4;			// добавление часного модуля text4 типа JTextField(текстовое поле)
    private JComboBox comboBox;			// добавление часного модуля comboBox типа JComboBox(выпадающий список)
    private JComboBox comboBox1;		// добавление часного модуля comboBox1 типа JComboBox(выпадающий список)
    private JComboBox comboBox2;		// добавление часного модуля comboBox2 типа JComboBox(выпадающий список)
    private JComboBox comboBox3;		// добавление часного модуля comboBox1 типа JComboBox(выпадающий список)
    private JComboBox comboBox4;		// добавление часного модуля comboBox1 типа JComboBox(выпадающий список)
    private ButtonGroup bg;				// добавление часного модуля bg типа ButtonGroup(группа кнопок)
    private ButtonGroup bg1;			// добавление часного модуля bg1 типа ButtonGroup(группа кнопок)
    private ButtonGroup bg2;			// добавление часного модуля bg2 типа ButtonGroup(группа кнопок)
    private ButtonGroup bg3;			// добавление часного модуля bg3 типа ButtonGroup(группа кнопок)
    private JButton Button1;			// добавление часного модуля Button3 типа JButton(кнопка)
    private JButton Button2;			// добавление часного модуля Button4 типа JButton(кнопка)
    private JFrame mainFrame;			// добавление часного модуля mainFrame типа JFrame(форма)
      
    nds() {								// начало класса
//colors
Color back = new Color(245,245,220);
Color font = new Color(132,132,130);
Color button = new Color(255, 229, 180);
//labels  
        log = new JLabel("Программа для расчета НДС");				// создание объекта log1 типа  Jlable
       	Font head = new Font("Verdana", Font.BOLD, 12);
       	log.setFont(head);
        log11 = new JLabel("Введите цену товара в поле");			// создание объекта log1 типа  Jlable
        log1 = new JLabel("Цена товара введена");					// создание объекта log1 типа  Jlable
    	log2 = new JLabel("Вид торговли");							// создание объекта log2 типа  Jlable
        log3 = new JLabel("Наличие комплекта документов");			// создание объекта log3 типа  Jlable
        log4 = new JLabel("Реализация специальных товаров");		// создание объекта log4 типа  Jlable
        log5 = new JLabel("Налогоплательщик это");					// создание объекта log5 типа  Jlable
        log6 = new JLabel("Сумма с НДС");       					// создание объекта log6 типа  Jlable
        log6.setVisible(false);
        log7 = new JLabel("Сумма без НДС");        					// создание объекта log7 типа  Jlable
        log7.setVisible(false);
        log8 = new JLabel("НДС");              						// создание объекта log8 типа  Jlable
        log8.setVisible(false);
       	Font font1 = new Font("", Font.BOLD, 13);
       	log6.setFont(font1);
       	log7.setFont(font1);
       	log8.setFont(font1);
        rubl1 = new JLabel("руб");									// создание объекта rubl1 типа  Jlable
        rubl2 = new JLabel("руб");									// создание объекта rubl2 типа  Jlable
        rubl2.setVisible(false);
        rubl3 = new JLabel("руб");									// создание объекта rubl3 типа  Jlable
        rubl3.setVisible(false);
        rubl4 = new JLabel("руб");									// создание объекта rubl4 типа  Jlable
        rubl4.setVisible(false);
        result = new JLabel("Введите необходимые данные");			// создание объекта result типа  JLabel
        result.setForeground(Color.RED);							// установка цвета текста Jlabel result
//buttons
        Button1 = new JButton("Расчитать");							// создание объекта Button3 типа  JButton
      	Button1.setEnabled(false);									// перевод кнопки Button3 в не доступное состояние (для нажатия) методом setEnabled
      	Button2 = new JButton("Заново");							// создание объекта Button4 типа  JButton
      	Button2.setVisible(false);
      	Button1.setBackground(button);
      	Button2.setBackground(button);
// comboboxes
    	String[] items = {											// создание строк текста 			
    			"",													// первая строка
                "Физическое лицо",									// вторая строка
                "Индивидуальный предприниматель"					// третья строка
            };														// конец создания строк			
    	JComboBox editComboBox = new JComboBox(items);				// объединение строк в выпадающий список                        
        comboBox = new JComboBox(items);							// создание объекта  comboBox типа  JComboBox
        comboBox.setEnabled(false);									// перевод выбора из списка comboBox в не доступное состояние (для нажатия) методом setEnabled
        
      	String[] items1 = {											// создание строк текста 			
    			"",													// первая строка
    			"С НДС",											// вторая строка
    			"Без НДС"											// третья строка
            };	

      	JComboBox editComboBox1 = new JComboBox(items1);
      	comboBox1 = new JComboBox(items1);
      	String[] items2 = {											// создание строк текста 			
    			"",													// первая строка
    			"Местная",											// вторая строка
    			"Экспорт"											// третья строка
            };	
      	JComboBox editComboBox2 = new JComboBox(items2);
      	comboBox2 = new JComboBox(items2);
      	comboBox2.setEnabled(false);
      	
      	String[] items3 = {											// создание строк текста 			
    			"",													// первая строка
    			"Есть",												// вторая строка
    			"Отсутствует"										// третья строка
            };	
      	JComboBox editComboBox3 = new JComboBox(items3);
      	comboBox3 = new JComboBox(items3);
      	comboBox3.setEnabled(false);
      	
      	String[] items4 = {											// создание строк текста 			
    			"",													// первая строка
    			"Да",												// вторая строка
    			"Нет"												// третья строка
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
        text1 = new JTextField("");									// создание объекта text1 типа  JTextField
        text1.setHorizontalAlignment(JTextField.RIGHT);				// установка выравнивания содержания метки вдоль X осей
        text2 = new JTextField("");									// создание объекта text2 типа  JTextField
        text2.setEditable(false);									// запрет редактирования поля  text2
        text2.setVisible(false);
        text2.setHorizontalAlignment(JTextField.RIGHT);				// установка выравнивания содержания метки вдоль X осей
        text3 = new JTextField("");									// создание объекта text3 типа  JTextField
        text3.setEditable(false);									// запрет редактирования поля  text3		
        text3.setVisible(false);
        text3.setHorizontalAlignment(JTextField.RIGHT);				// установка выравнивания содержания метки вдоль X осей
        text4 = new JTextField("");									// создание объекта text4 типа  JTextField
        text4.setEditable(false);									// запрет редактирования поля  text4		
        text4.setVisible(false);
        text4.setHorizontalAlignment(JTextField.RIGHT);				// установка выравнивания содержания метки вдоль X осей
	text1.setBackground(button);
	text2.setBackground(button);
	text3.setBackground(button);
	text4.setBackground(button);
	
 //action listeners       
        ActionListener again = new ActionListener() {				// объявление слушателя again (обработку события нажатия на кнопку)
            @Override												// добавление аннотации Override
             public void actionPerformed(ActionEvent ar) {			// объявление метода actionPerformed
                comboBox.setSelectedItem("");
                comboBox1.setSelectedItem("");
                comboBox2.setSelectedItem("");
                comboBox3.setSelectedItem("");
                comboBox4.setSelectedItem("");
            	comboBox1.setEnabled(true);	
               	Button1.setEnabled(false);							// перевод кнопки Button3 в не доступное состояние (для нажатия) методом setEnabled
            	Button2.setEnabled(false);							// перевод кнопки Button4 в не доступное состояние (для нажатия) методом setEnabled
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
                result.setText("Введите необходимые данные");
            }														// конец метода actionPerformed    
        };															//конец работы слушателя again
