package lovivido;

import javax.swing.JOptionPane;

public class Lovivido {

public static void main(String[] args) {
String nombre;
String edad;

int meses;
int dias;
int horas;
int respuestaEdad;

nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
edad = JOptionPane.showInputDialog ("Escriba su edad: ");
 
respuestaEdad = Integer.parseInt (edad);
 
meses = (respuestaEdad*12);
dias = (respuestaEdad*365);
horas = (dias*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +meses,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +dias,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +horas,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
   

}
