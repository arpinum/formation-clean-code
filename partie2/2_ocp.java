public class class Basket {

	public void addProduct(String producReference, String pricingStrategy) {
		Product product = ProductRepository.get(producReference);
		Line line = new Line(product);
		switch(pricingStrategy) {
			case: "NORMAL":
				line.setPrice(product.price);
				break;
			case :"VIP":
				line.setPrice(product.price/2);
				break;
		}
	}

}
