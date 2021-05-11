package Business.abstracts;

import Entity.concretes.Product;

public interface ProductService {
    boolean signUp(Product product);
    void signIn(Product product,boolean a);
    void pressSignUpButton(boolean a,Product product);
}
