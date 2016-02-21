public class Questao01{
    
    public static void main(String[] args) {
        int[] item = new int[2];
        int resultado;
        item[0] = Integer.parseInt(args[0]);
        item[1] = Integer.parseInt(args[1]);
        if (item [1] > item [0]){
            
            resultado = item [1];
			
        }
        else{
            
            resultado = item [0];
            
        }
        System.out.printf("%d\n",resultado);
    }
    
}