package handle;



import entity.Product;

import java.util.Scanner;

public class ProductHandle {
    public Product createProduct(int i, Scanner sc){
        System.out.println("Nhập sản phẩm thứ "+(i+1) );
        System.out.println("Nhập tên sản phẩm:");
        String name=sc.nextLine();
        System.out.println("Nhập mô tả:");
        String description =sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantity=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá bán:");
        double price=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập đơn vị tính:");
        String units=sc.nextLine();
        Product product =new Product(name,description,quantity,units,price);
        return product;
    }
    public void display(Product[] products){
        for(Product x:products){
            System.out.println(x);
        }
    }

    public String findProductByName(Product[] products, String name){
        boolean check = false;
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                check= true;
            }
        }
        if(!check){
            return "Không tìm thấy sản phẩm có tên là:  "+name;
        }
        return "Mời bạn thực hiện chức năng tiếp theo";
    }
    public Product findId(Product[] products,int id){
        for(Product x:products){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }
    public Product updateQuantityById(Product[] products,int updateId,int newQuantity){
        for(Product x: products){
            if(x.getId()==updateId){
                x.setQuantity(newQuantity);
                return x;
            }
        }
        return null;
    }

public String findQuantity(Product[] products){
    boolean check = false;
    for (Product x: products) {
        if (x.getQuantity()<5){
            System.out.println(x);
            check= true;
        }
    }
    if(!check){
        return "Không tìm thấy sản phẩm có số lượng < 5";
    }
    return "Mời bạn thực hiện chức năng tiếp theo";
}
    public void findProductByPrice(Product[] products,int choose){
        for(Product x: products){
            if(x.getPrice()<50000 && choose ==1){
                System.out.println(x);
            }else if(x.getPrice()>=50000 && x.getPrice()<100000 && choose ==2){
                System.out.println(x);
            }else if(choose==3){
                System.out.println(x);
            }

        }

    }
    public void sortByPrice(Product[] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length -1; j++) {
                if(products[j].getPrice()> products[j+1].getPrice()){
                    Product temp =  products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        System.out.println("Danh sách sắp xếp tăng dần theo price là:");
        for (Product x : products) {
            System.out.println(x);
        }
    }



}

