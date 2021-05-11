import Business.concretes.ProductManager;
import Entity.concretes.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product=new Product("furkan","sağlam","mffff@gmail.com","124567");
        Product product1=new Product("M Furkan","sağlam","mffff@gmail.com","124tt7");
        ProductManager productManager=new ProductManager();
        boolean a=productManager.signUp(product1);
        productManager.pressSignUpButton(a,product1);
        productManager.signIn(product, a);


    }
}
