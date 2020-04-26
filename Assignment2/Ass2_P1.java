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
public class Ans1 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("School's Info");
        frame.setSize(800, 600);
        
        JLabel label1 = new JLabel("ID ");         label1.setBounds(200, 100, 250, 50);
        JLabel label2 = new JLabel("Name ");       label2.setBounds(200, 200, 250, 50);
        JLabel label3 = new JLabel("Age ");        label3.setBounds(200, 300, 250, 50); 
        
        JTextField id_txtField = new JTextField();    id_txtField.setBounds(300, 110, 250, 30);
        JTextField name_txtField = new JTextField();  name_txtField.setBounds(300, 210, 250, 30);    
        JTextField age_txtField = new JTextField();   age_txtField.setBounds(300, 310, 250, 30);
          
        
        JRadioButton option1_techer = new JRadioButton("Teacher");
        option1_techer.setBounds(400, 30, 100, 30);
        JRadioButton option2_student = new JRadioButton("Student");
        option2_student.setBounds(400, 60, 100, 30);
        
        ButtonGroup button_group = new ButtonGroup();
        button_group.add(option1_techer); button_group.add(option2_student);
       
        /*
         * A temporary label when the user click on teacher this label'll be eequal teacher and the same for the student
        */
        JLabel label_tmp = new JLabel(" ");
        label_tmp.setBounds(200, 400, 250, 50);
        label_tmp.setVisible(false);
        
        /*
         * There's only text field for salary or grade
        */
        JTextField SalaryOrGrade_txtField = new JTextField();
        SalaryOrGrade_txtField.setBounds(300, 410, 250, 30);
        SalaryOrGrade_txtField.setVisible(false);
        
        
        JButton btn_add = new JButton("Add");
        btn_add.setBounds(200, 500, 400, 30);
        
        
        
        option1_techer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                SalaryOrGrade_txtField.setVisible(true);
                label_tmp.setText("Salary");
                label_tmp.setVisible(true);
            }

        });

        option2_student.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                SalaryOrGrade_txtField.setVisible(true);
                label_tmp.setText("Grade");
                label_tmp.setVisible(true);
            }
        });

        
        btn_add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                
                  if (option1_techer.isSelected()) {
                      
                    int teacher_id = Integer.parseInt(id_txtField.getText());  
                    String teacher_name = name_txtField.getText();
                    int teacher_age = Integer.parseInt(age_txtField.getText());
                    double EnteredSalaryValue = Double.parseDouble(SalaryOrGrade_txtField.getText()); 
                    
 
                    InvalidInput invalidInput_obj = new InvalidInput();
                    
                    invalidInput_obj.checkSalary(EnteredSalaryValue);
                    
                    if (invalidInput_obj.isCheckingEx() == false) {
                        Teacher teacher_obj = new Teacher(teacher_id, teacher_name, teacher_age, EnteredSalaryValue);
                        JOptionPane.showMessageDialog(frame, "New teacher added");
                    }
                }
                  
                  else if (option2_student.isSelected()) {
                      
                    int student_id = Integer.parseInt(id_txtField.getText());
                    String student_name = name_txtField.getText();
                    int student_age = Integer.parseInt(age_txtField.getText());
                    double EnteredGradeValue = Double.parseDouble(SalaryOrGrade_txtField.getText()); 
                   
                    InvalidInput invalidInput_obj = new InvalidInput();
                    invalidInput_obj.checkGrade(EnteredGradeValue);
                    
                    if (invalidInput_obj.isCheckingEx() == false) {
                        Student s = new Student(student_id, student_name, student_age, EnteredGradeValue);
                        JOptionPane.showMessageDialog(frame, "New student added");
                    }
                }
                
              
            }
        });
        
        
        frame.add(label1);      frame.add(label2);           frame.add(label3);
        frame.add(id_txtField); frame.add(name_txtField);    frame.add(age_txtField);
        frame.add(option1_techer); frame.add(option2_student);
        
        frame.add(label_tmp);
        frame.add(SalaryOrGrade_txtField);
        
        frame.add(btn_add);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

//====================
abstract class Person {

    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    abstract Person display_info();

}

//================
class Teacher extends Person {

    private double salary;

    public Teacher(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    Person display_info() {
        Person teacher_obj = new Teacher(id, name, age, salary);
        teacher_obj.id = id;
        teacher_obj.name = name;
        teacher_obj.age = age;
        return teacher_obj;
    }
}

//================
class Student extends Person {

    private double grade;

    public Student(int id, String name, int age, double grade) {
        super(id, name, age);
        this.grade = grade;
    }

    Person display_info() {
        Person student_obj = new Student(id, name, age, grade);
        student_obj.id = id;
        student_obj.name = name;
        student_obj.age = age;

        return student_obj;
    }
}

//============
class InvalidInput {

    private boolean CheckingEx = false;

    public void checkSalary(double salary) {
        try {
            if (salary < 0) {
                throw new Exception("Salary can't be negative !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            CheckingEx = true;
        }
    }
    
    public void checkGrade(double grade) {
        try {
            if (grade < 0) {
                throw new Exception("Grade can't be negative !");
            } else if (grade > 100) {
                throw new Exception("Grade can't exceed 100 !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            CheckingEx = true;
        }
    }

    

    public boolean isCheckingEx() {
        return CheckingEx;
    }

}
