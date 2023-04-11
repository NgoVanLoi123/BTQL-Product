package view;

import handle.ProductHandle;
import entity.Product;

import java.util.Scanner;

public class Menu {

    public void createMenu(){
        System.out.println("---------------MENU--------------");
        System.out.println("choose 1: Sản phẩm dưới 50.000");
        System.out.println("choose 2: Sản phẩm từ 50.000 đến 100.000");
        System.out.println("choose 3: Sản phẩm t 100.000 trở lên");
    }
    public int chooseMenu(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời bạn nhập lựa chọn");
        int choose =Integer.parseInt(sc.nextLine());
        return choose;
    }

}
