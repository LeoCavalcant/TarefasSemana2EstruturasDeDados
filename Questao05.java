public class Questao05{
   
    public static void main(String[] args){
        int [][] matrix = new int[3][3];
		int contadorArgs = 0;
        for(int l = 0;l <= 2;l++){
            for(int c = 0;c <= 2;c++){
				
				matrix[l][c] = Integer.parseInt(args[contadorArgs]);
				contadorArgs = contadorArgs + 1;
            }
        }
        int resultado;
        resultado = ((matrix[0][0]*matrix[1][1]*matrix[2][2])+(matrix[0][1]*matrix[1][2]*matrix[2][0])+(matrix[0][2]*matrix[1][0]*matrix[2][1]))-((matrix[2][0]*matrix[1][1]*matrix[0][2])+(matrix[2][1]*matrix[1][2]*matrix[0][0])+(matrix[2][2]*matrix[1][0]*matrix[0][1]));
        System.out.printf("\n %d \n",resultado);
    }
}