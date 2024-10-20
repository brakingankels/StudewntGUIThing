import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetails {
    public JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton finalMarkButton;
    private JButton dpMarkButton;
    private JTextField textField6;
    private JTextField textField7;
    private JLabel Mark1;
    private JLabel Mark2;
    private JLabel ExamMark;
    private JLabel assignmentMark;
    private JLabel results;
    private JLabel DpMark;
    private JLabel FinalMark;

    public StudentDetails() {
        dpMarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ST = textField1.getText();
                String Name = textField6.getText();
                String surname = textField7.getText();
                double Mark1 = Double.parseDouble(textField3.getText());
                double Mark2 = Double.parseDouble(textField2.getText());
                double assignmentMark = Double.parseDouble(textField4.getText());
                double dpMark = (Mark1 + Mark2 + assignmentMark)/3;
                DpMark.setText("Dp Mark: " +dpMark );
                }
    });

        finalMarkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Mark1 = Double.parseDouble(textField3.getText());
                double Mark2 = Double.parseDouble(textField2.getText());
                double assignmentMark = Double.parseDouble(textField4.getText());
                double ExamMark =  Double.parseDouble(textField5.getText());
                double DpMark = (Mark1 + Mark2 + assignmentMark)/3;
                double fin = (ExamMark * 0.6) + (DpMark * 0.4);
                String li;
                if (fin >= 0 && fin <= 46) {
                    li = "Fail";
                } else if (fin >= 47 && fin <= 49) {
                    li = "Supp";
                } else if (fin >= 50 && fin <= 74) {
                    li = "Pass";
                } else if (fin >= 75 && fin <= 100) {
                    li = "Distinction";
                } else {
                    li = "Invalid marks!";
                }
                FinalMark.setText(("Final Mark: " + fin));
            }
        });
    }
}
