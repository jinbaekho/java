package day0816.com.acorn;

import java.io.IOException;


//우리 회사에는 창고가 있습니다. 창고에는 여러 상품들이 있으며, 각각의 상품들은 존으로 나뉘어진 구역에 정리가 되이 있습니다.
//작업자는 해당존을 보고, 상품(4종류)이 비어있으면 제조업체에 연락해 부족한 상품을 주문합니다.
//해당 업체는 주문량에 맞는 상품을 싣고 해당 창고에 차로 배송합니다.
//배송차가 창고에 도착하면, 창고담당자의 검수를 받고, 해당존에 상품을 두고 영수증을 받고 돌아갑니다.



public class Test01 {
	public static void main(String[] args) throws InterruptedException, IOException {
		int productA = (int) (Math.round(Math.random() * 10));
		int productB = (int) (Math.round(Math.random() * 10));
		int productC = (int) (Math.round(Math.random() * 10));
		int productD = (int) (Math.round(Math.random() * 10));
		while (true) {
			System.out.println("==================================");
			print(productA, "A");
			print(productB, "B");
			print(productC, "C");
			print(productD, "D");
			System.out.println();
			productA = sub(productA, "A");
			productB = sub(productB, "B");
			productC = sub(productC, "C");
			productD = sub(productD, "D");
			System.out.println();
			productA = add(productA, "A");
			productB = add(productB, "B");
			productC = add(productC, "C");
			productD = add(productD, "D");
			System.out.println();

			print(productA, "A");
			print(productB, "B");
			print(productC, "C");
			print(productD, "D");
			System.out.println();

			System.out.println("아무키나 누르시오");
			System.in.read();
		}

	}

	public static int sub(int product, String name) throws InterruptedException {
		int ranNUM = (int) (Math.round(Math.random() * 9));
		System.out.print("[" + name + " " + ranNUM + "개 주문]");
		if (ranNUM > product) {
			System.out.print("!" + name + "재고가 부족!");
			add(product, name);
		}
		product -= ranNUM;
		return product;
	}

	public static int add(int product, String name) throws InterruptedException {
		if (product < 3) {
			int addPRO = 10 - product;
			product += addPRO;
			System.out.print("...." + name + "재고 보충중 : " + addPRO + "개....");
			Thread.sleep(3000);
		}
		return product;
	}

	public static void print(int product, String name) {
		System.out.print("[" + name + "재고량 :" + product + "]");
	}

}
