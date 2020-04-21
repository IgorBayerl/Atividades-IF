package demo;

import com.mtsystems.coot.String8;

import java.util.Scanner;

public class DemoTranslation {
	public static void main() {
		String8 string = new String8(41);
		byte[] contrario = new byte[41];
		int total = 0, j;
		boolean erro = false;

		System.out.print("Digite a palavra (ate 40 caracteres): ");
		string.copyFrom(STDIN_SCANNER.next());

		total = string.length();
		j = total;
		total++;
		j--;

		for(int i = 0; i < total; i++) {
			contrario[i] = string.get(j);
			j--;
		}

		total--;

		for(int i = 0; i < total; i++) {
			if(string.get(i) != contrario[i]) {
				erro = true;
			}
		}

		if(erro) {
			System.out.print("\nNao e palindromo.");
		} else {
			System.out.print("\nE palindromo.");
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}