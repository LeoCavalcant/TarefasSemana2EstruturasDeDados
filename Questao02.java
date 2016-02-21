public class Questao02 {

    public static void main(String[] args) {
        int item[] = new int[2];
		int caixa;
        item[0] = Integer.parseInt(args[0]);
        item[1] = Integer.parseInt(args[1]);
        if (item[1] < item[0]){ 
		
            caixa = item[1];
			item[1] = item[0];
			item[0] = caixa;
			
        }
        System.out.printf("\n %d - %d \n",item[0],item[1]);
            
        
    }
    
}