package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.print("Enter file full path: ");
		try (Scanner sc = new Scanner(System.in)) {
			String path = sc.nextLine().trim();
			Map<String, Integer> map = new HashMap<>();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line;
				while ((line = br.readLine()) != null) {
					String[] fields = line.split(",");
					if (fields.length < 2)
						continue;
					String name = fields[0].trim();
					int votes;
					try {
						votes = Integer.parseInt(fields[1].trim());
					} catch (NumberFormatException e) {
						continue;
					}
					map.put(name, map.getOrDefault(name, 0) + votes);
				}
			}

			System.out.println();
			System.out.println("Total votes by name:");
			map.keySet().stream().sorted().forEach(name -> System.out.println(name + ": " + map.get(name)));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
