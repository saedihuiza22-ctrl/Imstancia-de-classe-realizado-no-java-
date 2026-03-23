/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2instancia;
import javax.swing.JOptionPane;
public class NewClass {
    
    public static void main(String[] args){
            
            NewClass1instancia obj= new   NewClass1instancia();  
       
      int opc = 0;
      int vetor[ ] = new int[4];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n    2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
      switch (opc)
         {
            case 1:
            	vetor = obj.CarregaVetor(vetor);
                break;
            case 2:
               	vetor = obj.ClassificaVetor(vetor);
                JOptionPane.showMessageDialog(null,"Vetor Classificado");
                break;
            case 3:
                obj.MostraVetor(vetor);
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"FIM");
                 System.exit(0);
                 break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }
   }
 }
}
            
            
            
            
            

