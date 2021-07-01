
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class DatePickerClass extends JFrame implements ActionListener {
    
    private JDatePickerImpl datePicker;
    private Date downloadedDate; 
    private JTextField jTextField2;
    int year = Calendar.getInstance().get(Calendar.YEAR);
    int month = Calendar.getInstance().get(Calendar.MONTH);
    int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

    public DatePickerClass() {
                super("Calendar Component Demo");
		setLayout(new FlowLayout());
		
		add(new JLabel("Wybierz datę: "));
		
		UtilDateModel model = new UtilDateModel();
		model.setDate(year, month, day);
		model.setSelected(true);
		
//		SqlDateModel model = new SqlDateModel(); <--- accesing by sql
		Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		add(datePicker);
		
		JButton buttonOK = new JButton("OK");
		buttonOK.addActionListener(this);
                
                add(buttonOK);
    }
    
    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new DatePickerClass().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// for UtilDateModel, the value returned is of type java.util.Date
		Date selectedDate = (Date) datePicker.getModel().getValue();
                this.downloadedDate = selectedDate;
                
                
                
                // Accesing by sql:
		// for SqlDateModel, the value returned is of type java.sql.Date
                // java.sql.Date selectedDate = (java.sql.Date) datePicker.getModel().getValue();
	
                String pattern = "MM/dd/yyyy";
                //String pattern = "MM/dd/yyyy HH:mm:ss"; <--- alternative format
                DateFormat df = new SimpleDateFormat(pattern);
                String chosenDate = df.format(datePicker.getModel().getValue());
                jTextField2.setText(chosenDate);
                dispose();
	}

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public JDatePickerImpl getDatePicker() {
        return datePicker;
    }
        
    public Date getDownloadedDate (){
        return downloadedDate;
    }
        
}
