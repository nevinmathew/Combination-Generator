/**
	This program generates all the possible combinations for 6 objects.
	Binary addition is done up to 2^6=64 to get this.
*/

package combo;

import java.util.Map;

public class CombinationGenerator {

	public static void main(String[] args) {

		Map<Integer, String> map = Map.ofEntries(Map.entry(0, "object 1"), Map.entry(1, "object 2"),
												Map.entry(2, "object 3"), Map.entry(3, "object 4"), 
												Map.entry(4, "object 5"), Map.entry(5, "object 6"));

		String leadingZeroes = "000000", binary, combinations;

		for (int num = 0; num < Math.pow(2, 6); num++) {
			binary = Integer.toBinaryString(num);
			if (binary.contains("1")) {
				combinations = leadingZeroes.substring(binary.length()) + binary;
				System.out.print(combinations + ": ");
				for (int i = 0; i < combinations.length(); i++)
					if (combinations.charAt(i) == '1')
						System.out.print(map.get(i) + " ");
				
				System.out.println("\n");
			}
		}
	}
}
