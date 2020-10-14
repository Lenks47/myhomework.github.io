package Supermarket;

import java.util.*;
public class ShoppingCar {
	public List<Goods> goods;
	public ShoppingCar() {
		this.goods=new ArrayList<Goods>();
	}
	public void addgoods(Goods gd) {
		this.goods.add(gd);
	}
	public void delgoods(Goods gd) {
		this.goods.remove(gd);
	}
	public double gettotal() {
		double total=0;
		for(int i=0;i<this.goods.size();i++) {
			Goods temp=goods.get(i);
			total+=temp.getGp()*temp.getGc();
		}
		return total;
	}
}
