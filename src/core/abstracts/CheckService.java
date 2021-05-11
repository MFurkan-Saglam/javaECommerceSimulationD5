package core.abstracts;

import Entity.concretes.Product;

public interface CheckService {
    boolean checkPassword(Product product);
    boolean checkEmail(Product product);
    boolean checkName(Product product);

}
