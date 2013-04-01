package at.edu.hti.shop;

import java.util.ArrayList;

import at.edu.hti.shop.domain.OrderLine;

public class Order extends ArrayList<OrderLine>{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(OrderLine e) {
	
		if(e!=null) return false;
		
		return super.add(e);
	}
	
	public double calcPrize()
	{
		double sum =0;
		
		for (OrderLine line : this) {
			sum += line.getAmount()*line.getProduct().getPrize();
		}		
		return sum;
	}
	
	
}
