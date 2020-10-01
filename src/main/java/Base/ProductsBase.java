package Base;

import Product.Product;


import java.util.ArrayList;

public class ProductsBase implements Base {
    private ArrayList<Product> products;

    public void clearBase() {
        try{
            if(products.size()==0) throw new BaseException("Base is empty");
        }
        catch (BaseException e)
        {
            return;
        }
        setProducts(new ArrayList<Product>());

    }



    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
