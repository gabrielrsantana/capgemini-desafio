import java.util.Arrays;
class Mediana{
    public static void main(String[] args) {
        
       int vetor[] = new int[]{9,5,4,1,8,10,3};
       int i=0;
       int meio=0;
      Arrays.sort(vetor);
      meio=((vetor.length-1)/2);
            
      
    for(int nome : vetor)
            System.out.print(nome+",");
       
       // System.out.println("Hello, World! ="+vetor[0]); 
        System.out.println("mediana ="+vetor[meio]);
    }
    
}
