package com.kosta.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class Prob4 {

	public static void main(String[] args) throws IOException {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"삼성전자"),
				new Product("15UD340-LX2CK",400000,"LG전자"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();
		
	}

	
	private static HashSet makeHashSet(Product[] prodList, int price) {
		HashSet set = new HashSet();

		for(Product p : prodList) {
			if(p.getPrice() > price) {
				set.add(p);
			}
		}
		return set;
	}


	private static void makeFile(HashSet resultList) throws IOException  {
		File file = new File("C:\\KOSTA\\JavaProject\\src\\data.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("*특정 금액 이상의 상품 결과입니다.*****************");
		
		for(Object o : resultList) {
			Product p = (Product)o;
			System.out.println(p.toString());
			oos.writeObject(p);
		}
		
		oos.flush();
		oos.close();
		fos.close();
	}
	
	private static void readFile() throws IOException  {
		FileInputStream fis = new FileInputStream("C:\\KOSTA\\JavaProject\\src\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("readFile결과입니다.*****************");
		
	}

}


class Product implements Serializable{
	private String model_name;
	private int price;
	private String company;
	
	
	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	

}