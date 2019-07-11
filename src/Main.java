import com.Controller.ProductController;
import com.Model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // write your code here
            ProductController productController = new ProductController();
            int choice;
            int index;
            int size = productController.size();
            do {
                menu();
                Scanner input = new Scanner(System.in);
                System.out.println("Nhap vao lua chon:");
                choice = input.nextInt();
                switch (choice) {
                    case 1: {
                        Product[] listProduct = productController.showlist();
                        for (int i = 0; i < listProduct.length; i++) {
                            if (listProduct[i] != null) {
                                System.out.println("ID: " + listProduct[i].getId() + " NAME: " + listProduct[i].getName());
                            }
                        }
                        break;
                    }
                    case 2: {
                        Product product = new Product();
                        System.out.println("Nhap vi tri ban muon them:");
                        index = input.nextInt();
                        if (index < 0 && index >= size) {
                            System.out.println("Khong hop le");
                            break;
                        }
                        System.out.println("Nhap thong tin san pham can them:");
                        product.setProductInfo();
                        productController.add(index, product);
                        size++;
                        break;
                    }
                    case 3 :{
                        System.out.println("Nhap vi tri ban muon xoa");
                        index = input.nextInt();
                        if (index < 0 && index >= size) {
                            System.out.println("Khong hop le");
                            break;
                        }
                        productController.remove(index);
                        size--;
                        break;
                    }
                    case 4 :{
                        Product product = new Product();
                        System.out.println("Nhap vi tri ban muon sua");
                        index = input.nextInt();
                        if (index < 0 && index >= size) {
                            System.out.println("Khong hop le");
                            break;
                        }
                        System.out.println("Nhap thong tin san pham can sua");
                        product.setProductInfo();
                        productController.set(index,product);
                        break;
                    }
                    case 5: {
                        input.nextLine();
                        System.out.println("Nhap ten san pham ban can tim kiem:");
                        String productName = input.nextLine();
                        System.out.println(productController.find(productName));
                        break;
                    }
                    case 6:{
                        Product[] listProduct = productController.showlist();
                        productController.sort();
                        for (int i = 0; i < listProduct.length; i++) {
                            if (listProduct[i] != null) {
                                System.out.println("ID: " + listProduct[i].getId() + " NAME: " + listProduct[i].getName());
                            }
                        }
                        break;

                    }
}
            } while (choice != 0);
                    }


        public static void menu() {
            System.out.println("\n");
            System.out.println("-----Quan ly san pham-----");
            System.out.println("1. Hien thi san pham");
            System.out.println("2. Them san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Sua san pham");
            System.out.println("5. Tim kiem san pham");
            System.out.println("6. Sap xep san pham");
            System.out.println("0. Thoat");
        }
}
