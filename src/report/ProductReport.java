package report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.*;
import model.*;
public class ProductReport {

	public List<Map<String, ?>> findAll(){
		List<Map<String, ?>> listProducts=new ArrayList<Map<String, ?>>();
		ProudctModel productmodel=new ProudctModel();
		for(Product p:productmodel.findAll())
		{
			Map<String,Object> m=new HashMap<String,Object>(); 
			m.put("id",p.getId());
			m.put("name", p.getName());
			m.put("price",p.getPrice());
			m.put("quantity",p.getQuantity());
			listProducts.add(m);
		}
		
		return listProducts;
	}
}
