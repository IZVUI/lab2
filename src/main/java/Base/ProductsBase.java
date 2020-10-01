package Base;

import Product.Product;


import java.util.ArrayList;

public class ProductsBase implements Base {
    private ArrayList<Product> products;

    public void clearBase() {
        try{
            if(products.size()==0) throw new BaseException("Base is empty");
            setProducts(new ArrayList<Product>());
        }
        catch (BaseException e)
        {
            return;
        }

    }

    public void RemoveItem(){
        try{
            if(products.size()==0) throw new BaseException("Base is empty");
            products.remove(products.size()-1);
        }
        catch (BaseException e){
            return;
        }
    }
    public void RemoveItem(Product product){
        try{
            if(products.size()==0) throw new BaseException("Base is empty");
            products.remove(product);
        }
        catch (BaseException e){
            return;
        }
    }



    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
