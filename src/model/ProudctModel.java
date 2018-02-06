package model;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class ProudctModel {
   public List<Product> findAll(){
	   List<Product> listProducts=new ArrayList<Product>();
	   listProducts.add(new Product("p1","Name 1",5,1000));
	   listProducts.add(new Product("p2","Name 2",6,2000));
	   listProducts.add(new Product("p3","Name 3",7,3000));
	   listProducts.add(new Product("p4","Name 4",8,4000));
	   listProducts.add(new Product("p5","Name 5",9,5000));
	   return listProducts;
   }
}
