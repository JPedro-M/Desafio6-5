package desafio6.pkg5;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio65 {
    public static void main(String[] args) {
        int ordem, n, termo; 
        String O, T;
        O= "";
        T= "";
        termo=-1;
        n=Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor N:"));
        
        for(ordem=1; ordem<=n;ordem++){
           if(ordem==1){
                O += "Ordem:";   
                T += "Termo: "+termo;
           }else{
                T += " "+termo;
           }
           if(ordem>n){
                O += "  "+ordem+"\n";
           }else{
                O += "  "+ordem;
           }
           if(ordem % 2 != 0){
                termo ++;
           }else{
                termo += 5;
           }
 
        }
        JOptionPane.showMessageDialog(null,"Resultado\n"+O+"\n"+T   );
    } 
}
