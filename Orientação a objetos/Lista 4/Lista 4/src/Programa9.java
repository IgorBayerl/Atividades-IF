import java.util.*;

public class Programa9 {

	public static void main(String[] args) {

        int n;

        String temp;

        Scanner myObj = new Scanner(System.in);

        System.out.print("entre com o numero de nomes que deseja preencher: ");

        n = myObj.nextInt();

        String names[] = new String[n];

        Scanner s1 = new Scanner(System.in);

        System.out.println("preencha todos os nomes:");

        for(int i = 0; i < n; i++)

        {

            names[i] = s1.nextLine();

        }

        for (int i = 0; i < n; i++) 

        {

            for (int j = i + 1; j < n; j++) 

            {

                if (names[i].compareTo(names[j])>0) 

                {

                    temp = names[i];

                    names[i] = names[j];

                    names[j] = temp;

                }

            }

        }

        System.out.print("Nomes separados em ordem: ");

        for (int i = 0; i < n - 1; i++) 

        {

            System.out.print(names[i] + ",");

        }

        System.out.print(names[n - 1]);

    }

}
