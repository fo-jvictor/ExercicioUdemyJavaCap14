package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;
import entitites.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String clientName = input.nextLine();
		System.out.print("Email: ");
		String clientEmail = input.next();
		System.out.print("Data de nascimento: (DD/MM/YYYY)");
		Date clientBdata = sdf.parse(input.next());
		
		Client cliente = new Client(clientName,clientEmail,clientBdata);
		
		System.out.println("Entre com os dados do pedido: ");
		
		System.out.print("STATUS: ");
		String orderStatus = input.next();
		
		Order order = new Order(new Date(),OrderStatus.valueOf(orderStatus), cliente);
		
		System.out.print("Entre com o número de itens do pedido: ");
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Entre com os dados do item "+i+ ":");
			
			System.out.print("Nome do produto: ");
			String itemName = input.next();
			System.out.print("Preco do produto: ");
			double itemPrice = input.nextDouble();
			System.out.print("Quantidade: ");
			int itemQuantity = input.nextInt();
			
			Product product = new Product(itemName,itemPrice);
			
			OrderItem orderitem = new OrderItem(itemQuantity,itemPrice, product);
			
			order.addItem(orderitem);			
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		input.close();
		
		
		

	}

}
