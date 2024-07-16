package p1;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class project1 {

	private JFrame frmPrakruthHotel;
	private JTextField txtb;
	private JTextField txtt;
	private JTextField txtd;
	private JTextField txtdp;
	private JTextField txttb;
	int tot;
	double d,tax;
	/**
	 * Launch the application.
	 */
	//DefaultListModel<String> Model_Items=new DefaultListModel<String>();
	DefaultListModel<String> Model_Item=new DefaultListModel<String>();
	DefaultListModel<Integer> Model_Item1=new DefaultListModel<Integer>();
	DefaultListModel<Integer> Model_Item2=new DefaultListModel<Integer>();
	DefaultListModel<Integer> Model_Item3=new DefaultListModel<Integer>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					project1 window = new project1();
					window.frmPrakruthHotel.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrakruthHotel = new JFrame();
		frmPrakruthHotel.getContentPane().setBackground(Color.CYAN);
		frmPrakruthHotel.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frmPrakruthHotel.setTitle("PRAKRUTH HOTEL");
		frmPrakruthHotel.setBounds(100, 100, 1014, 788);
		frmPrakruthHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrakruthHotel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRAKRUTH TIFFINS");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel.setBounds(318, 27, 177, 30);
		frmPrakruthHotel.getContentPane().add(lblNewLabel);
	
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(21, 105, 314, 259);
		frmPrakruthHotel.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbldosa = new JLabel("dosa");
		lbldosa.setBounds(10, 39, 46, 14);
		panel.add(lbldosa);
		
		JLabel lblmasaladosa = new JLabel("masala dosa");
		lblmasaladosa.setBounds(10, 70, 46, 14);
		panel.add(lblmasaladosa);
		
		JLabel lblpannerdosa = new JLabel("panner dosa");
		lblpannerdosa.setBounds(10, 101, 46, 14);
		panel.add(lblpannerdosa);
		
		JLabel lbloniondosa = new JLabel("onion dosa");
		lbloniondosa.setBounds(10, 132, 46, 14);
		panel.add(lbloniondosa);
		
		JLabel lblgheedosa = new JLabel("ghee dosa");
		lblgheedosa.setBounds(10, 163, 46, 14);
		panel.add(lblgheedosa);
		
		JLabel lblspecialdosa = new JLabel("special dosa");
		lblspecialdosa.setBounds(10, 197, 46, 20);
		panel.add(lblspecialdosa);
				
		JSpinner spinner = new JSpinner();

		spinner.addChangeListener(new ChangeListener() {
			 int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lbldosa.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lbldosa.getText());
		          Model_Item2.addElement(40);
		          n=(Integer)spinner.getValue();
		          price=n*40;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner.getValue();
		          price=n*40;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
			});
		
		spinner.setBounds(69, 36, 41, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblmasaladosa.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblmasaladosa.getText());
		          Model_Item2.addElement(80);
		          n=(Integer)spinner_1.getValue();
		          price=n*80;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1.getValue();
		          price=n*80;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1.setBounds(69, 67, 41, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblpannerdosa.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblpannerdosa.getText());
		          Model_Item2.addElement(100);
		          n=(Integer)spinner_1_1.getValue();
		          price=n*100;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_1.getValue();
		          price=n*100;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_1.setBounds(69, 98, 41, 20);
		panel.add(spinner_1_1);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lbloniondosa.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lbloniondosa.getText());
		          Model_Item2.addElement(150);
		          n=(Integer)spinner_1_2.getValue();
		          price=n*150;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_2.getValue();
		          price=n*150;
		          Model_Item1.remove(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_2.setBounds(69, 129, 41, 20);
		panel.add(spinner_1_2);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblgheedosa.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblgheedosa.getText());
		          Model_Item2.addElement(200);
		          n=(Integer)spinner_1_3.getValue();
		          price=n*200;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_3.getValue();
		          price=n*200;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_3.setBounds(69, 160, 41, 20);
		panel.add(spinner_1_3);
		
		JSpinner spinner_1_4 = new JSpinner();
		spinner_1_4.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
			      public void stateChanged(ChangeEvent e) {
			        index=Model_Item.indexOf(lblspecialdosa.getText());
			        if(flag==0)
			        {
			          Model_Item.addElement(lblspecialdosa.getText());
			          Model_Item2.addElement(250);
			          n=(Integer)spinner_1_4.getValue();
			          price=n*250;
			          Model_Item1.addElement(n);
			          Model_Item3.addElement(price);
			          flag++;
			        }
			        else
			        {
			          n=(Integer)spinner_1_4.getValue();
			          price=n*250;
			          Model_Item1.removeElementAt(index);
			          Model_Item3.remove(index);
			          Model_Item1.add(index,n);
			          Model_Item3.add(index,price);
			        }
			        if(n==0)
			        {
			          Model_Item.remove(index);
			          Model_Item1.remove(index);
			          Model_Item2.remove(index);
			          Model_Item3.remove(index);
			          flag=0;
			        }
			      }
		});
		spinner_1_4.setBounds(69, 194, 41, 20);
		panel.add(spinner_1_4);
		
		JLabel lblNewLabel_7 = new JLabel("40");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(133, 39, 31, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("80");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_1.setBounds(133, 70, 31, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("100");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_2.setBounds(133, 101, 31, 14);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("150");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_3.setBounds(133, 132, 31, 14);
		panel.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("200");
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_4.setBounds(133, 163, 31, 14);
		panel.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_5 = new JLabel("250");
		lblNewLabel_7_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_5.setBounds(133, 197, 31, 14);
		panel.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\anure\\OneDrive\\Pictures\\Saved Pictures\\dosa.jpg"));
		lblNewLabel_10.setBounds(160, 36, 144, 175);
		panel.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 447, 243, 218);
		frmPrakruthHotel.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblss = new JLabel("ice cream, fruit juice ,lassi\r\n");
		lblss.setBounds(25, 21, 197, 32);
		panel_3.add(lblss);
		
		JSpinner spinnerss = new JSpinner();
		spinnerss.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblss.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblss.getText());
		          Model_Item2.addElement(499);
		          n=(Integer)spinnerss.getValue();
		          price=n*499;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinnerss.getValue();
		          price=n*499;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinnerss.setBounds(96, 56, 41, 20);
		panel_3.add(spinnerss);
		
		
		JLabel lblNewLabel_7_5_3 = new JLabel("499");
		lblNewLabel_7_5_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_5_3.setBounds(183, 59, 31, 14);
		panel_3.add(lblNewLabel_7_5_3);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\anure\\OneDrive\\Pictures\\Saved Pictures\\combo.jpg"));
		lblNewLabel_12.setBounds(10, 86, 223, 121);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_1 = new JLabel("HOTEL");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\anure\\OneDrive\\Pictures\\Saved Pictures\\hotel.jpg"));
		lblNewLabel_1.setBounds(616, 11, 237, 83);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BILL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(653, 416, 53, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("TAX");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(653, 447, 53, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("DISCOUNT");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(653, 478, 71, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("DISCOUNT%");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(653, 509, 71, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("TOTAL BILL");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(653, 539, 85, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_2_4);
		
		txtb = new JTextField();
		txtb.setBounds(747, 416, 86, 20);
		frmPrakruthHotel.getContentPane().add(txtb);
		txtb.setColumns(10);
		
		txtt = new JTextField();
		txtt.setColumns(10);
		txtt.setBounds(747, 448, 86, 20);
		frmPrakruthHotel.getContentPane().add(txtt);
		
		txtd = new JTextField();
		txtd.setColumns(10);
		txtd.setBounds(747, 479, 86, 20);
		frmPrakruthHotel.getContentPane().add(txtd);
		
		txtdp = new JTextField();
		txtdp.setColumns(10);
		txtdp.setBounds(747, 510, 86, 20);
		frmPrakruthHotel.getContentPane().add(txtdp);
		
		txttb = new JTextField();
		txttb.setColumns(10);
		txttb.setBounds(747, 540, 86, 20);
		frmPrakruthHotel.getContentPane().add(txttb);
		
		JList item = new JList(Model_Item);
		item.setBounds(303, 449, 95, 289);
		frmPrakruthHotel.getContentPane().add(item);
		
		JList quautity = new JList(Model_Item1);
		quautity.setBounds(408, 449, 45, 289);
		frmPrakruthHotel.getContentPane().add(quautity);
		
		JList price = new JList(Model_Item2);
		price.setBounds(463, 449, 45, 289);
		frmPrakruthHotel.getContentPane().add(price);
		
		JList total = new JList(Model_Item3);
		total.setBounds(518, 449, 45, 289);
		frmPrakruthHotel.getContentPane().add(total);
		
		JLabel lblNewLabel_4 = new JLabel("dosa");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(240, 81, 63, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("vada");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4_1.setBounds(543, 81, 63, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("idly");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4_2.setBounds(885, 81, 63, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("SummerSpecial");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setBounds(48, 424, 147, 20);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("item");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(318, 420, 46, 14);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("quautity");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_1.setBounds(398, 420, 57, 14);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("price");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_2.setBounds(464, 420, 46, 14);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("total");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_3.setBounds(525, 420, 46, 14);
		frmPrakruthHotel.getContentPane().add(lblNewLabel_6_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setBounds(374, 105, 306, 259);
		frmPrakruthHotel.getContentPane().add(panel_1);
		
		JLabel lblvada = new JLabel("vada");
		lblvada.setBounds(10, 39, 46, 14);
		panel_1.add(lblvada);
		
		JLabel lblsambarvada = new JLabel("sambar vada");
		lblsambarvada.setBounds(10, 70, 46, 14);
		panel_1.add(lblsambarvada);
		
		JLabel lblpannervada = new JLabel("panner vada");
		lblpannervada.setBounds(3, 101, 59, 14);
		panel_1.add(lblpannervada);
		
		JLabel lblonionvada = new JLabel("onion vada");
		lblonionvada.setBounds(10, 132, 56, 14);
		panel_1.add(lblonionvada);
		
		JLabel lbldonutvada = new JLabel("donut vada");
		lbldonutvada.setBounds(3, 163, 56, 14);
		panel_1.add(lbldonutvada);
		
		JLabel lblspecialvada = new JLabel("special vada");
		lblspecialvada.setBounds(0, 194, 59, 20);
		panel_1.add(lblspecialvada);
		
		
		JSpinner spinnerv = new JSpinner();
		spinnerv.addChangeListener(new ChangeListener() {
			 int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblvada.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblvada.getText());
		          Model_Item2.addElement(40);
		          n=(Integer)spinnerv.getValue();
		          price=n*40;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinnerv.getValue();
		          price=n*40;
		          Model_Item1.remove(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinnerv.setBounds(69, 36, 41, 20);
		panel_1.add(spinnerv);
		
		JSpinner spinners = new JSpinner();
		spinners.addChangeListener(new ChangeListener() {
				int flag=0,n,price,index;
			      public void stateChanged(ChangeEvent e) {
			        index=Model_Item.indexOf(lblsambarvada.getText());
			        if(flag==0)
			        {
			          Model_Item.addElement(lblsambarvada.getText());
			          Model_Item2.addElement(80);
			          n=(Integer)spinners.getValue();
			          price=n*80;
			          Model_Item1.addElement(n);
			          Model_Item3.addElement(price);
			          flag++;
			        }
			        else
			        {
			          n=(Integer)spinners.getValue();
			          price=n*80;
			          Model_Item1.removeElementAt(index);
			          Model_Item3.remove(index);
			          Model_Item1.add(index,n);
			          Model_Item3.add(index,price);
			        }
			        if(n==0)
			        {
			          Model_Item.remove(index);
			          Model_Item1.remove(index);
			          Model_Item2.remove(index);
			          Model_Item3.remove(index);
			          flag=0;
			        }
			      }
		});
		spinners.setBounds(69, 67, 41, 20);
		panel_1.add(spinners);
		
		JSpinner spinnerp = new JSpinner();
		spinnerp.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblpannervada.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblpannervada.getText());
		          Model_Item2.addElement(100);
		          n=(Integer)spinnerp.getValue();
		          price=n*100;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinnerp.getValue();
		          price=n*100;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinnerp.setBounds(69, 98, 41, 20);
		panel_1.add(spinnerp);
		
		JSpinner spinner0 = new JSpinner();
		spinner0.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblonionvada.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblonionvada.getText());
		          Model_Item2.addElement(150);
		          n=(Integer)spinner0.getValue();
		          price=n*150;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner0.getValue();
		          price=n*150;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner0.setBounds(69, 129, 41, 20);
		panel_1.add(spinner0);
		
		JSpinner spinnerd = new JSpinner();
		spinnerd.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lbldonutvada.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lbldonutvada.getText());
		          Model_Item2.addElement(200);
		          n=(Integer)spinnerd.getValue();
		          price=n*200;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinnerd.getValue();
		          price=n*200;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinnerd.setBounds(69, 160, 41, 20);
		panel_1.add(spinnerd);
		
		JSpinner spinnersv = new JSpinner();
		spinnersv.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblspecialvada.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblspecialvada.getText());
		          Model_Item2.addElement(250);
		          n=(Integer)spinnersv.getValue();
		          price=n*250;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinnersv.getValue();
		          price=n*250;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinnersv.setBounds(69, 194, 41, 20);
		panel_1.add(spinnersv);
		
		JLabel lblNewLabel_7_6 = new JLabel("40");
		lblNewLabel_7_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_6.setBounds(133, 39, 31, 14);
		panel_1.add(lblNewLabel_7_6);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("80");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_1_1.setBounds(133, 70, 31, 14);
		panel_1.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("100");
		lblNewLabel_7_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_2_1.setBounds(133, 101, 31, 14);
		panel_1.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("150");
		lblNewLabel_7_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_3_1.setBounds(133, 132, 31, 14);
		panel_1.add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_7_4_1 = new JLabel("200");
		lblNewLabel_7_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_4_1.setBounds(133, 163, 31, 14);
		panel_1.add(lblNewLabel_7_4_1);
		
		JLabel lblNewLabel_7_5_1 = new JLabel("250");
		lblNewLabel_7_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_5_1.setBounds(133, 197, 31, 14);
		panel_1.add(lblNewLabel_7_5_1);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\anure\\OneDrive\\Pictures\\Saved Pictures\\vada.jpg"));
		lblNewLabel_11.setBounds(162, 39, 139, 172);
		panel_1.add(lblNewLabel_11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setToolTipText("");
		panel_2.setBounds(709, 105, 335, 259);
		frmPrakruthHotel.getContentPane().add(panel_2);
		

		JLabel lblidly = new JLabel("idly");
		lblidly.setBounds(10, 39, 46, 14);
		panel_2.add(lblidly);
		
		JLabel lblkaramidly = new JLabel("karam idly");
		lblkaramidly.setBounds(10, 70, 46, 14);
		panel_2.add(lblkaramidly);
		
		JLabel lblgunturidly = new JLabel("guntur idly");
		lblgunturidly.setBounds(10, 101, 46, 14);
		panel_2.add(lblgunturidly);
		
		JLabel lblgheeidly = new JLabel("ghee idly");
		lblgheeidly.setBounds(10, 132, 46, 14);
		panel_2.add(lblgheeidly);
		
		JLabel lblchoidly = new JLabel("cho idly");
		lblchoidly.setBounds(10, 163, 46, 14);
		panel_2.add(lblchoidly);
		
		JLabel lblspecialidly = new JLabel("special idly");
		lblspecialidly.setBounds(10, 197, 46, 20);
		panel_2.add(lblspecialidly);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
			      public void stateChanged(ChangeEvent e) {
			        index=Model_Item.indexOf(lblidly.getText());
			        if(flag==0)
			        {
			          Model_Item.addElement(lblidly.getText());
			          Model_Item2.addElement(40);
			          n=(Integer)spinner_3.getValue();
			          price=n*40;
			          Model_Item1.addElement(n);
			          Model_Item3.addElement(price);
			          flag++;
			        }
			        else
			        {
			          n=(Integer)spinner_3.getValue();
			          price=n*40;
			          Model_Item1.removeElementAt(index);
			          Model_Item3.remove(index);
			          Model_Item1.add(index,n);
			          Model_Item3.add(index,price);
			        }
			        if(n==0)
			        {
			          Model_Item.remove(index);
			          Model_Item1.remove(index);
			          Model_Item2.remove(index);
			          Model_Item3.remove(index);
			          flag=0;
			        }
			      }
		});
		spinner_3.setBounds(69, 36, 41, 20);
		panel_2.add(spinner_3);
		
		JSpinner spinner_1_6 = new JSpinner();
		spinner_1_6.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblkaramidly.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblkaramidly.getText());
		          Model_Item2.addElement(80);
		          n=(Integer)spinner_1_6.getValue();
		          price=n*80;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_6.getValue();
		          price=n*80;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_6.setBounds(69, 67, 41, 20);
		panel_2.add(spinner_1_6);
		
		JSpinner spinner_1_1_2 = new JSpinner();
		spinner_1_1_2.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblgunturidly.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblgunturidly.getText());
		          Model_Item2.addElement(100);
		          n=(Integer)spinner_1_1_2.getValue();
		          price=n*100;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_1_2.getValue();
		          price=n*100;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_1_2.setBounds(69, 98, 41, 20);
		panel_2.add(spinner_1_1_2);
		
		JSpinner spinner_1_2_2 = new JSpinner();
		spinner_1_2_2.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblgheeidly.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblgheeidly.getText());
		          Model_Item2.addElement(150);
		          n=(Integer)spinner_1_2_2.getValue();
		          price=n*150;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_2_2.getValue();
		          price=n*150;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_2_2.setBounds(69, 129, 41, 20);
		panel_2.add(spinner_1_2_2);
		
		JSpinner spinner_1_3_2 = new JSpinner();
		spinner_1_3_2.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblchoidly.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblchoidly.getText());
		          Model_Item2.addElement(200);
		          n=(Integer)spinner_1_3_2.getValue();
		          price=n*200;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_3_2.getValue();
		          price=n*200;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_3_2.setBounds(69, 160, 41, 20);
		panel_2.add(spinner_1_3_2);
		
		JSpinner spinner_1_4_2 = new JSpinner();
		spinner_1_4_2.addChangeListener(new ChangeListener() {
			int flag=0,n,price,index;
		      public void stateChanged(ChangeEvent e) {
		        index=Model_Item.indexOf(lblspecialidly.getText());
		        if(flag==0)
		        {
		          Model_Item.addElement(lblspecialidly.getText());
		          Model_Item2.addElement(250);
		          n=(Integer)spinner_1_4_2.getValue();
		          price=n*250;
		          Model_Item1.addElement(n);
		          Model_Item3.addElement(price);
		          flag++;
		        }
		        else
		        {
		          n=(Integer)spinner_1_4_2.getValue();
		          price=n*250;
		          Model_Item1.removeElementAt(index);
		          Model_Item3.remove(index);
		          Model_Item1.add(index,n);
		          Model_Item3.add(index,price);
		        }
		        if(n==0)
		        {
		          Model_Item.remove(index);
		          Model_Item1.remove(index);
		          Model_Item2.remove(index);
		          Model_Item3.remove(index);
		          flag=0;
		        }
		      }
		});
		spinner_1_4_2.setBounds(69, 194, 41, 20);
		panel_2.add(spinner_1_4_2);
		
		JLabel lblNewLabel_7_7 = new JLabel("40");
		lblNewLabel_7_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_7.setBounds(133, 39, 31, 14);
		panel_2.add(lblNewLabel_7_7);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("80");
		lblNewLabel_7_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_1_2.setBounds(133, 70, 31, 14);
		panel_2.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_7_2_2 = new JLabel("100");
		lblNewLabel_7_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_2_2.setBounds(133, 101, 31, 14);
		panel_2.add(lblNewLabel_7_2_2);
		
		JLabel lblNewLabel_7_3_2 = new JLabel("150");
		lblNewLabel_7_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_3_2.setBounds(133, 132, 31, 14);
		panel_2.add(lblNewLabel_7_3_2);
		
		JLabel lblNewLabel_7_4_2 = new JLabel("200");
		lblNewLabel_7_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_4_2.setBounds(133, 163, 31, 14);
		panel_2.add(lblNewLabel_7_4_2);
		
		JLabel lblNewLabel_7_5_2 = new JLabel("250");
		lblNewLabel_7_5_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_5_2.setBounds(133, 197, 31, 14);
		panel_2.add(lblNewLabel_7_5_2);
		
		
		JLabel lblNewLabel_11_1 = new JLabel("New label");
		lblNewLabel_11_1.setIcon(new ImageIcon("C:\\Users\\anure\\OneDrive\\Pictures\\Saved Pictures\\idly.jpg"));
		lblNewLabel_11_1.setBounds(161, 39, 118, 172);
		panel_2.add(lblNewLabel_11_1);
		

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("d");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()==true)
				{
					txtd.setEnabled(true);
					txtdp.setEnabled(true);
				}
				else
				{
					txtd.setEnabled(false);
					txtdp.setEnabled(false);
				}
			}
		});
			rdbtnNewRadioButton_1.setBounds(597, 478, 39, 23);
		frmPrakruthHotel.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnCalu = new JButton("CALULATE");
		btnCalu.setForeground(new Color(0, 0, 0));
		btnCalu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bill,dis,damt,t;
				int total = 0,c;
				c=Model_Item3.getSize();
				for(int i=0;i<c;i++)
				{
					total=total+Model_Item3.getElementAt(i);
				}
				tot=total;
				txtb.setText(Integer.toString(total));
				tax=total*0.18;
				txtt.setText(Double.toString(tax));
				bill=tot+tax;
				if(txtd.isEnabled()==true)
				{
					dis=Double.parseDouble(txtd.getText());
					damt=dis*0.01*tot;
					t=bill-damt;
					txtdp.setText(Double.toString(damt));
					txttb.setText(Double.toString(t));
				}
				else
				{
					txttb.setText(Double.toString(bill));
				}
			}
		});
		btnCalu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnCalu.setBounds(653, 602, 111, 20);
		frmPrakruthHotel.getContentPane().add(btnCalu);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinner.setValue(0);
				spinner0.setValue(0);
				spinner_1.setValue(0);
				spinner_1_1.setValue(0);
				spinner_1_1_2.setValue(0);
				spinner_1_2.setValue(0);
				spinner_1_2_2.setValue(0);
				spinner_1_3.setValue(0);
				spinner_1_3_2.setValue(0);
				spinner_1_4.setValue(0);
				spinner_1_4_2.setValue(0);
				spinner_1_6.setValue(0);
				spinner_3.setValue(0);
				spinnerd.setValue(0);
				spinnerp.setValue(0);
				spinners.setValue(0);
				spinnerss.setValue(0);
				spinnersv.setValue(0);
				spinnerv.setValue(0);
				Model_Item.removeAllElements();
				Model_Item1.removeAllElements();
				Model_Item2.removeAllElements();
				Model_Item3.removeAllElements();
				txtb.setText(null);
				txtd.setText(null);
				txtdp.setText(null);
				txtt.setText(null);
				txttb.setText(null);
				rdbtnNewRadioButton_1.setSelected(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(774, 601, 89, 23);
		frmPrakruthHotel.getContentPane().add(btnNewButton);
		
	}
}
