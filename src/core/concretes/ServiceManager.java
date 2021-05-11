package core.concretes;

import Entity.concretes.Product;
import core.abstracts.CheckService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceManager implements CheckService {
    @Override
    public boolean checkPassword(Product product) {
        if(product.getPassword().length()<6)
        {
            System.out.println("Parola en az 6 karakter olmalıdır.");
            return false;
        }
        else {
            return true;
            //System.out.println("Parola formatı doğru");
        }


    }

    @Override
    public boolean checkEmail(Product product) {
        Pattern pattern=Pattern.compile("[\\w]{1,25}@gmail.com");
        Matcher matcher=pattern.matcher(product.getE_mail());
        boolean m=matcher.matches();
        if(m )
        {
            return true;
           // System.out.println("Email formatı onaylandı");

        }
        else
        {
            System.out.println("E mail formatı hatalı.Emailiniz @gmail.com ile bitmeli ve character olmalı.");
            return false;

        }

    }



    @Override
    public boolean checkName(Product product) {
        if(product.getName().length()<2&&product.getLastname().length()<2)
        {
            System.out.println("İsim ve soyisim hatalı formattadır.Tekrar deneyiniz.");
            return false;
        }

        else
            return true;

    }
}
