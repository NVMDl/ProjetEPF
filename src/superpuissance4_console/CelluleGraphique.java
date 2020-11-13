/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_console;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author delah
 */
public class CelluleGraphique extends JButton{
   Cellule celluleAssociee;
   ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
   
   public CelluleGraphique (Cellule unecellule){
       celluleAssociee = unecellule;
   }
   
   @Override
   public void paintComponent (Graphics G){
       super.paintComponent(G);
      setIcon(img_vide); //on attribut l'image celluleVide.png
   }
}
