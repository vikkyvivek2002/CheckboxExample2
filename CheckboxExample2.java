import java.awt.*;  
import java.awt.event.*;  
public class CheckboxExample2 extends Frame implements ItemListener
{
     public CheckboxExample2() {
        Frame f= new Frame("CheckBox Example");  
        final Label label = new Label();          
        label.setAlignment(Label.CENTER);  
        label.setSize(400,100);  
        Checkbox checkbox1 = new Checkbox("C++");  
        checkbox1.setBounds(100,100, 50,50);  
        Checkbox checkbox2 = new Checkbox("Java");  
        checkbox2.setBounds(100,150, 50,50);  
        f.add(checkbox1); f.add(checkbox2); f.add(label);  
            f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
checkbox1.addItemListener(this); 
       checkbox2.addItemListener(this);
 
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });  

}
            public void itemStateChanged(ItemEvent e) {               
                label.setText("C++ Checkbox: "   
                + (e.getStateChange()==1?"checked":"unchecked"));  
             }  
            

             public void itemStateChanged(ItemEvent e) {               
                label.setText("Java Checkbox: "   
                + (e.getStateChange()==1?"checked":"unchecked"));  
             }  
                        
public static void main(String args[])  
{   
 new CheckboxExample2();
}  
}
 