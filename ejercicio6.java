import java.util.*;

public class ejercicio6{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);

		int contador = 0;
		int edad;
		int totalMenores = 0;
		int totalMayores = 0;
		int TotalMenores = 0;
		int TotalMayores = 0;
		double promedioMayores = 0;
		double promedioMenores = 0;

		for(int i=0;i<3;i++){
			System.out.print("Ingrese su edad: ");
			edad = scanner.nextInt();

			if (edad < 25){
				totalMenores ++;
				TotalMenores = TotalMenores + edad;
				promedioMenores = TotalMenores/totalMenores;
			} else {
				totalMayores ++;
				TotalMayores = totalMayores + edad;
                promedioMayores = TotalMayores/totalMayores;
                
			}
            
            
			contador ++;
		}

		System.out.print(" El promedio de edad mayores de 25 años es " + promedioMayores +" años, y menores de 25 es " +promedioMenores +" años");
	}
}