public class Questao03{
    
    public static void main(String[] args){
        int[] item = new int[3];
        int estoque;
        for(int a = 0;a <= 2;a++){

            item[a] = Integer.parseInt(args[a]);
			
        }
        for(int b = 0;b <= 2;b++){
			
            for(int c = 0;c < 2;c++){
				
                if(item[c] < item[c+1]){
					
                    estoque = item[c];
                    item[c] = item[c+1];
                    item[c+1] = estoque;
					
                }
				
            }    
			
        }
		System.out.printf("\n");
        for(int d = 0;d <= 2;d++){
			
            System.out.printf(" %d ",item[d]);
			
        }
        System.out.printf("\n");
        
    }
    
}