import java.util.Comparator;

class AscendingOrderByName implements Comparator<Merchandise>
{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		// TODO Auto-generated method stub
		return ((m1.getItemCode()).compareTo(m2.getItemCode()));
	}
	
}
class DescendingOrderByPrice implements Comparator<Merchandise>
{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		// TODO Auto-generated method stub
		return (((Double)m2.getUnitPrice()).compareTo((Double)m1.getUnitPrice()));
	}
	
}
public class Merchandise {
	
	private String itemCode;
	private int quantity; 
	private double unitPrice;
	
	public Merchandise(String itemCode, int quantity, double unitPrice) {

		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	@Override
	public String toString() {
		return "Merchandise [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
