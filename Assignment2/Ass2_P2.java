
package assignments_package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Abanoub Asaad
 */

public class Ans2 {

    
    public static void main(String[] args) {
        
        Emplyee[] emplyee =new Emplyee[3];
        
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        
        JLabel label1 = new JLabel("Employee ID ");                  label1.setBounds(100, 50, 250, 50);
        JLabel label2 = new JLabel("Employee Name ");                label2.setBounds(100, 150, 250, 50);
        JLabel label3 = new JLabel("Employee Password ");            label3.setBounds(100, 250, 250, 50); 
        JLabel label4 = new JLabel("Re-enter Employee Password ");   label4.setBounds(100, 350, 250, 50);
      
        JTextField id_txtField = new JTextField();               id_txtField.setBounds(350, 60, 250, 30);
        JTextField name_txtField = new JTextField();             name_txtField.setBounds(350, 160, 250, 30);    
        JTextField password_txtField = new JTextField();         password_txtField.setBounds(350, 260, 250, 30);
        JTextField repassword_txtField = new JTextField();       repassword_txtField.setBounds(350, 360, 250, 30);

        JRadioButton option1_manager = new JRadioButton("Manager");
        option1_manager.setBounds(550, 420, 200, 30);
        JRadioButton option2_permanantEmployee = new JRadioButton("Permanant Emplyee");
        option2_permanantEmployee.setBounds(550, 450, 200, 30);
        JRadioButton option3_tempEmployee = new JRadioButton("Temp Emplyee");
        option3_tempEmployee.setBounds(550, 480, 200, 30);
   
       ButtonGroup button_group = new ButtonGroup();
       button_group.add(option1_manager);
       button_group.add(option2_permanantEmployee);
       button_group.add(option3_tempEmployee);
       

       JButton btn_add = new JButton("Add Empolyee");
       btn_add.setBounds(250, 420, 150, 30);
       
       JButton btn_display = new JButton("Display Extra Attribute");
       btn_display.setBounds(250, 490, 200, 30);
         
      
        btn_add.addActionListener(new ActionListener() {
            boolean choose = false;

            public void actionPerformed(ActionEvent e) {

                try {
                    
                    
                    if(option1_manager.isSelected()){
                        choose = true;
                        Manager manager_obj = new Manager();
                        int manager_id = Integer.parseInt(id_txtField.getText());
                        String manager_name = name_txtField.getText();
                        String manager_password = password_txtField.getText();
                        String manager_repassword = repassword_txtField.getText();

                        if (!manager_password.equals(manager_repassword)) {
                            throw new InvalidDataException("The password you entered the second time does not match the first time");
                        }else{
                            manager_obj.setEmpID(manager_id);
                            manager_obj.setEmpName(manager_name);
                            manager_obj.setPassword(manager_password);
                            
                            for (int i = 0; i < 3; i++) {

                                if (emplyee[i] == null) {
                                    emplyee[i] = manager_obj;
                                    JOptionPane.showMessageDialog(frame, "New Manager added");
                                    break;
                                }
                                if (i == 2) {
                                    if (emplyee[2] != null) {
                                        JOptionPane.showMessageDialog(frame, "maximum data entiered");
                                        btn_add.setEnabled(false);
                                    }
                                }

                            }
                            
                            id_txtField.setText("");
                            name_txtField.setText("");
                            password_txtField.setText("");
                            repassword_txtField.setText("");
                            
                        }
                    }
                    
                    else if (option2_permanantEmployee.isSelected()) {
                        choose = true;
                        PermanantEmp permanantEmp_obj = new PermanantEmp();

                        int permanantEmp_id = Integer.parseInt(id_txtField.getText());
                        String permanantEmp_name = name_txtField.getText();
                        String permanantEmp_password = password_txtField.getText();
                        String permanantEmp_repassword = repassword_txtField.getText();

                        if (!permanantEmp_password.equals(permanantEmp_repassword)) {
                            throw new InvalidDataException("The password you entered the second time does not match the first time");
                        } else {
                            permanantEmp_obj.setEmpID(permanantEmp_id);
                            permanantEmp_obj.setEmpName(permanantEmp_name);
                            permanantEmp_obj.setPassword(permanantEmp_password);

                            for (int i = 0; i < 3; i++) {

                                if (emplyee[i] == null) {
                                    emplyee[i] = permanantEmp_obj;
                                    JOptionPane.showMessageDialog(frame, "New PermanantEmp added");
                                    break;
                                }
                                if (i == 2) {
                                    if (emplyee[2] != null) {
                                        JOptionPane.showMessageDialog(frame, "maximum data entiered");
                                        btn_add.setEnabled(false);
                                    }
                                }

                            }

                            id_txtField.setText("");
                            name_txtField.setText("");
                            password_txtField.setText("");
                            repassword_txtField.setText("");
                        }
                    }
                    
                    else if(option3_tempEmployee.isSelected()){
                        choose = true ;
                        TempEmp tempEmp_obj = new TempEmp();

                        int tempEmp_id = Integer.parseInt(id_txtField.getText());
                        String tempEmp_name = name_txtField.getText();
                        String tempEmp_password = password_txtField.getText();
                        String tempEmp_repassword = repassword_txtField.getText();

                        if(!tempEmp_password.equals(tempEmp_repassword)){
                            throw new InvalidDataException("The password you entered the second time does not match the first time");
                        }else{
                            tempEmp_obj.setEmpID(tempEmp_id);
                            tempEmp_obj.setEmpName(tempEmp_name);
                            tempEmp_obj.setPassword(tempEmp_password);
                            
                            for (int i = 0; i < 3; i++) {

                                if (emplyee[i] == null) {
                                    emplyee[i] = tempEmp_obj;
                                     JOptionPane.showMessageDialog(frame, "New TempEmp added");
                                    break;
                                }
                                if (i == 2) {
                                    if (emplyee[2] != null) {
                                        JOptionPane.showMessageDialog(frame, "maximum data entiered");
                                        btn_add.setEnabled(false);
                                    }
                                }

                            }

                            id_txtField.setText("");
                            name_txtField.setText("");
                            password_txtField.setText("");
                            repassword_txtField.setText("");
                        }
                    }
                    
                    if(choose == false){
                throw new InvalidDataException("Must Select Employee Type");} 
                    
                } catch (InvalidDataException invalid_ex) {
                     JOptionPane.showMessageDialog(frame, invalid_ex.getMessage());
                }
            }
        });
       
       btn_display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager manager_obj=new Manager();
                PermanantEmp permanantEmp_obj=new PermanantEmp();
                TempEmp tempEmp_obj=new TempEmp() ;
                for(int i=0;i<3;i++){
                     if(emplyee[i]==null)
                    {
                        if(emplyee[i-1] instanceof Manager ){
                            JOptionPane.showMessageDialog(frame, "Number Of Employees Managed = "+manager_obj.getNumberOfEmployeesManaged());
                        }
                        else if (emplyee[i-1] instanceof PermanantEmp){
                            JOptionPane.showMessageDialog(frame, "Bonus Rate = "+permanantEmp_obj.getBonusRate());
                        }
                        else if(emplyee[i-1] instanceof TempEmp){
                            JOptionPane.showMessageDialog(frame, "Hourly Rate = "+tempEmp_obj.getHourlyRate());
                        }
                        break;
                    }
                }
                   
            }
        } );
       
      
        
       
        frame.add(option1_manager);
        frame.add(option2_permanantEmployee);
        frame.add(option3_tempEmployee);     
        frame.add(btn_add);   
        frame.add(btn_display);   
        frame.add(label1);      frame.add(label2);  frame.add(label3);  frame.add(label4);   
        frame.add(id_txtField); frame.add(name_txtField);  frame.add(password_txtField); frame.add(repassword_txtField);   
       
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

//=========

abstract class Emplyee {

    private String EmpName;
    private int EmpID;
    private String password;
    static int nEmployees;

    
    
    public void setPassword(String password) {
        this.password = password;

    }

    public String getPassword() {
        return password;
    }
    
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public int getEmpID() {
        return EmpID;
    }

    
}


//==========

class PermanantEmp extends Emplyee {

    private double BonusRate;

    PermanantEmp() {
        BonusRate = 0.1;
    }

    public double getBonusRate() {
        return BonusRate;
    }

    public void setBonusRate(double BonusRate) {
        this.BonusRate = BonusRate ;

    }
}


//===========
class TempEmp extends Emplyee {

    private float HourlyRate;

    public TempEmp() {
        HourlyRate = 150;
    }

    public void setHourlyRate(float HourlyRate) {
        this.HourlyRate = HourlyRate ;
    }

    public float getHourlyRate() {
        return HourlyRate;
    }
}

//========

  class Manager extends PermanantEmp {

    private int NumberOfEmployeesManaged;

    Manager() {
        NumberOfEmployeesManaged = 200;
    }
    
    public void setNumberOfEmployeesManaged(int NumberOfEmployeesManaged) {
        this.NumberOfEmployeesManaged = NumberOfEmployeesManaged;
    }
    
    public int getNumberOfEmployeesManaged() {
        return NumberOfEmployeesManaged;
    }
}

//===
class InvalidDataException extends Exception {

    static int nEntries;
    
    InvalidDataException(String Message) {
        super(Message);
    }
}
