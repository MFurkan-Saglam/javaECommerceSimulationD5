package Business.concretes;

import Business.abstracts.ProductService;
import DataAccess.concretes.HibernateProductDao;
import Entity.concretes.Product;
import core.concretes.ServiceManager;

public class ProductManager implements ProductService {

    @Override
    public boolean signUp(Product product) {

        ServiceManager serviceManager=new ServiceManager();
        boolean x=serviceManager.checkName(product);
        boolean y=serviceManager.checkEmail(product);
        boolean z=serviceManager.checkPassword(product);
        return x && y && z;


    }
    @Override
    public void signIn(Product product,boolean a) {
        HibernateProductDao hibernateProductDao=new HibernateProductDao();
        hibernateProductDao.signİn(product,a);



    }

    @Override
    public void pressSignUpButton(boolean a,Product product) {
        if(a)
        {
            HibernateProductDao hibernateProductDao=new HibernateProductDao();
            hibernateProductDao.add(product);
            System.out.println("Size doğrulama e postası gönderildi.");
        }


    }
}
