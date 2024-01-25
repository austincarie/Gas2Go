
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Register<resetButton> extends Component implements ActionListener{

    JFrame frame;

    JLabel formTitle = new JLabel("GAS2GO REGISTER");
    JLabel firstNameLabel = new JLabel("First Name");
    JLabel lastNameLabel = new JLabel("Last Name");
    JLabel passwordLabel = new JLabel("Password");
    JLabel confirmPasswordLabel = new JLabel("Confirm Password");
    JLabel phoneLabel = new JLabel("Phone");
    JLabel emailLabel = new JLabel("Email");
    JLabel streetLabel = new JLabel("Street Address");
    JLabel cityLabel = new JLabel("City");
    JLabel stateLabel = new JLabel("State Initials");
    JLabel zipcodeLabel = new JLabel("6 Digit Zip Code");
    JTextField firstNameField = new JTextField();
    JTextField lastNameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();
    JTextField phoneField = new JTextField();
    JTextField emailField = new JTextField();
    JTextField streetField = new JTextField();
    JTextField cityField = new JTextField();
    JTextField stateField = new JTextField();
    JTextField zipcodeField = new JTextField();
    JButton register1Button = new JButton("REGISTER");
    JButton resetButton = new JButton("RESET");


    Register() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
    }

    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Register");
        frame.setBounds(40,40,380,800);
        frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
    }

    public void setLocationAndSize() {
        formTitle.setBounds(130,0,200,75);
        firstNameLabel.setBounds(20,20,80,70);
        firstNameField.setBounds(180,43,165,23);
        lastNameLabel.setBounds(20, 70,80,70);
        lastNameField.setBounds(180,93,165,23);
        passwordLabel.setBounds(20,120,100,70);
        passwordField.setBounds(180,143,165,23);
        confirmPasswordLabel.setBounds(20,170,140,70);
        confirmPasswordField.setBounds(180,193,165,23);
        phoneLabel.setBounds(20,220,100,70);
        phoneField.setBounds(180,243,165,23);
        emailLabel.setBounds(20,270,100,70);
        emailField.setBounds(180,293,165,23);
        streetLabel.setBounds(20,320,140,70);
        streetField.setBounds(180,343,165,23);
        cityLabel.setBounds(20,370,100,70);
        cityField.setBounds(180,393,165,23);
        stateLabel.setBounds(20,420,140,70);
        stateField.setBounds(180,443,165,23);
        zipcodeLabel.setBounds(20,470,100,70);
        zipcodeField.setBounds(180,493,165,23);
        register1Button.setBounds(70,600,100,35);
        resetButton.setBounds(220,600,100,35);
    }

    public void addComponentsToFrame() {
        frame.add(formTitle);
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(streetLabel);
        frame.add(streetField);
        frame.add(cityLabel);
        frame.add(cityField);
        frame.add(stateLabel);
        frame.add(stateField);
        frame.add(zipcodeLabel);
        frame.add(zipcodeField);
        frame.add(register1Button);
        frame.add(resetButton);
    }
    public void actionEvent() {
        register1Button.addActionListener(this);
        resetButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == register1Button) {
            String firstNameTxt;
            String lastNameTxt;
            String passTxt;
            String confirmPassTxt;
            String phoneTxt;
            String emailTxt;
            String streetTxt;
            String cityTxt;
            String stateTxt;
            String zipTxt;
            /*
            firstNameTxt = firstNameTxt.getText();
            lastNameTxt = lastNameTxt.getText();
            passTxt = passTxt.getText();
            confirmPassTxt = confirmPassTxt.getText();
            phoneTxt = phoneTxt.getText();
            emailTxt = emailTxt.getText();
            streetTxt = streetTxt.getText();
            cityTxt = cityTxt.geText();
            stateTxt = stateTxt.getText();
            zipTxt = zipTxt.getText();


            if (firstNameTxt.equalsIgnoreCase("first name") && lastNameTxt.equalsIgnoreCase("last name")
                    && passTxt.equalsIgnoreCase("password") && confirmPassTxt.equalsIgnoreCase("confirm password")
                    && phoneTxt.equalsIgnoreCase("phone") && emailTxt.equalsIgnoreCase("email") && emailTxt.equalsIgnoreCase("email")
                    && streetTxt.equalsIgnoreCase("street address") && cityTxt.equalsIgnoreCase("city") &&
                    stateTxt.equalsIgnoreCase("state initials") && zipTxt.equalsIgnoreCase("zipcode")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username/Password");
            }


             */
        }

    }
//          try {
//              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas2go","root","mysql");
//
//              PreparedStatement PStatement = connection.prepareStatement("INSERT INTO 'customers' (`first_name`, `last_name`, `phone`, `email`, `street`, `city`, `state`, `zip_code`) VALUES(?,?,?,?,?,?,?,?,?,?)");
//              PStatement.setString(1,firstNameField.getText());
//              PStatement.setString(2,lastNameField.getText());
//              PStatement.setString(3,passwordField.getText());
//              PStatement.setString(4,confirmPasswordField.getText());
//              PStatement.setString(5,phoneField.getText());
//              PStatement.setString(6,emailField.getText());
//              PStatement.setString(7,streetField.getText());
//              PStatement.setString(8,cityField.getText());
//              PStatement.setString(9,stateField.getText());
//              PStatement.setString(10,zipcodeField.getText());
//
//              if (passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText())) {
//                  PStatement.executeUpdate();
//                  JOptionPane.showMessageDialog(null, "Registered Successfully");
//              } else {
//                  JOptionPane.showMessageDialog(null,"Make sure passwords match");
//              }
//          } catch (SQLException e1) {
//              e1.printStackTrace();
//          }
/*
      if (e.getSource() == resetButton) {
        firstNameField.setText("");
        lastNameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        phoneField.setText("");
        emailField.setText("");
        streetField.setText("");
        cityField.setText("");
        stateField.setText("");
        zipcodeField.setText("");


 */
    }



