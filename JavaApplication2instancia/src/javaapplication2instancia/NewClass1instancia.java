/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2instancia;
import javax.swing.JOptionPane;

public class NewClass1instancia {
    
      public int[ ] CarregaVetor(int vt[ ])
	{
	  int cta;
                    for ( cta = 0 ; cta < 4 ; cta++ ){
	       vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               }
      return vt;
  }
        
        
        
     
  public int[ ] ClassificaVetor(int vt[ ])  {
	  int i,j, aux;
          for ( i = 0 ; i < 3 ; i++ ){
              for ( j = i+1 ; j < 4 ; j++ ){
	    if ((vt[i] > vt[j])) {
                          aux = vt[i];
                          vt[i] = vt[j];
                         vt[j] = aux; }
                     }   }
      return vt;  
  }
    
    
public void MostraVetor(int vt[ ])
	{
	  int cta;
                  for ( cta = 0 ; cta < 4 ; cta++ ){
	     System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	  }
            System.out.println ("**********");
      }   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

