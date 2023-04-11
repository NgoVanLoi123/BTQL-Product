

import entity.Product;
import handle.ProductHandle;
import view.Menu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm cần hiển thị:");
        int n =Integer.parseInt(sc.nextLine());
        Product[] products =new Product[n];
        ProductHandle productHandle =new ProductHandle();
        for(int i=0;i<n;i++){
            products[i]=productHandle.createProduct(i,sc);
        }
        productHandle.display(products);
        System.out.println("Mời bạn nhập tên cần tìm kiếm: ");
        String name=sc.nextLine();
        System.out.println("Danh sách tìm sản phẩm theo tên là:");
        System.out.println(productHandle.findProductByName(products,name));
        System.out.println("Mời bạn nhập id can tìm kiếm:");
        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Danh sách tìm kiếm theo id là:");
        System.out.println(productHandle.findId(products,id));
        System.out.println("update");
        System.out.println("Mời bạn nhập id cần cập nhật:");
        int updateId=Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn cập nhật số lượng mới:");
        int newQuantity =Integer.parseInt(sc.nextLine());
        System.out.println("Danh sách sau khi cập nhật:");
        System.out.println(productHandle.updateQuantityById(products,updateId,newQuantity));
        System.out.println("Danh sách các sản phẩm có số lượng dưới 5 là:");
        System.out.println(productHandle.findQuantity(products));
        Menu menu =new Menu();
        menu.createMenu();
        productHandle.findProductByPrice(products,menu.chooseMenu());
        productHandle.sortByPrice(products);






    }
}