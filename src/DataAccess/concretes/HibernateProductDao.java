package DataAccess.concretes;

import DataAccess.abstracts.ProductDao;
import Entity.concretes.Product;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.printf(product.getName()+" eklendi ");
        
    }

    @Override
    public void signİn(Product product,boolean x) {
        if(x)
        System.out.println(product.getE_mail()+" ile giriş yaptınız");
        else
        {
            System.out.println("Emailiniz doğrulanmadığı için giriş yapamıyorsunuz");
        }

    }
}
