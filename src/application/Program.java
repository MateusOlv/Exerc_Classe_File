package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the file path: ");
		String strPath = sc.nextLine();
		
		File file = new File(strPath);
		String folder = file.getParent();
		boolean success = new File(folder + "\\out").mkdir();
		
		String newFile = folder + "\\out\\summary.csv";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(strPath));
			
			String line = br.readLine();
			
			while(line != null) {
				String [] parts = line.split(",");
				String name = parts[0];
				Double unitValue = Double.parseDouble(parts[1]);
				Integer quantity = Integer.parseInt(parts[2]);
				
				list.add(new Product(name, unitValue, quantity));
				
				line = br.readLine();
			}
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
				
				for(Product product : list) {
					bw.write(product.getName() + "," + String.format("%.2f", product.getTotalValue()));
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error: " + e);
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		sc.close();
	}

}
