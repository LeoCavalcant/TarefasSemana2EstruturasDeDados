public class Questao04 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])},
            {Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5])},
            {Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8])}
                
        };
		System.out.printf("\n");
        System.out.print(matrix[0][1]);
		System.out.printf(" ");
        System.out.print(matrix[2][1]);
		System.out.printf("\n");
    }
    
}