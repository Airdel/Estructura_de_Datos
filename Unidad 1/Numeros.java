/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darien Rafael Márquez Vázquez
 */
public class Numeros{
    int n=0;
    int ListaNumeros[];
    int TamArr;
    int op;
    //Object Primos;
    public Numeros() {
    }
    
  
    
    
    
    public static boolean Esprimo(int n){//metodo retornar un numPrimo
         int a=0,i;         
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
        return a==2;
    }

    public Numeros(int TamArr) {//constructor para Tamaño del Arrehglo
        this.TamArr = TamArr;
    }
    public int[] ArrayInterno(int TamArreglo,int op){
      ListaNumeros=new int[TamArreglo];
      
        switch(op){
            case 0:javax.swing.JOptionPane.showMessageDialog(null, "Selecciona Opcion Valida");
                    break;
            case 1:return Primos(TamArreglo);
            case 2:return fibonacci();
            case 3:return pares();
            case 4:return impares();
            case 5:return azar();
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Selecciona");
                break;  
      }
    for(int i=0;i<TamArreglo;i++)ListaNumeros[i]=0;
    return ListaNumeros;
    }
    //metodos de numeros------------------------------------------------------
    public int[] Primos(int Tam){
        boolean r;//variable para esPrimos de la clase
        int cont=0;//contador
        ListaNumeros=new int[Tam]; 
        for(int i=0;i<1000000;i++){
            r=Esprimo(i);//metodo clase 
            if (r){
                ListaNumeros[cont]=i;
                System.out.println(cont);
                cont++;
            }//End IF
            if(cont==Tam){
                break;//rompe el ciclo cuando se llene el arreglo
            }
        }//end for
       return ListaNumeros;
   }
    public int[] fibonacci(){
        ListaNumeros=new int[TamArr]; 
        ListaNumeros[0] = 0;
        ListaNumeros[1] = 1;
        for(int i=2; i < TamArr; i++){
            ListaNumeros[i]=ListaNumeros[i-1]+ListaNumeros[i-2];
        }
        return ListaNumeros;
    }
    public int[] pares(){
        ListaNumeros=new int[TamArr];
        int a=0;
        for (int i=0;i<(TamArr*2);i=i+2){
            ListaNumeros[a]=i;
            //System.out.println(i);
            //System.out.println(a);
            a++;
        }
        return ListaNumeros;
    }
    public int[] impares(){
    ListaNumeros=new int[TamArr];
    int a=0;
    for (int i=1;i<TamArr*2;i=i+2){
        ListaNumeros[a]=i;
        a++;
    }
    return ListaNumeros;
    }
    public int[] azar(){
        ListaNumeros=new int[TamArr];
        for(int i=0;i<TamArr;i++)
        ListaNumeros[i]=(int)(Math.random()*100);
        return ListaNumeros;    
    }    
}
