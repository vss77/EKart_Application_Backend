package com.ekart.ekartb.dto;

import java.util.Objects;

import jakarta.validation.Valid;
import jakarta.validation.constraints.PositiveOrZero;

public class CartProductDTO {
	
	private Integer cartProductId;
	@Valid
	private ProductDTO product;
	@PositiveOrZero(message="{cartproduct.invalid.quantity}")
	private Integer quantity;
	public Integer getCartProductId() {
		return cartProductId;
	}
	public void setCartProductId(Integer cartProductId) {
		this.cartProductId = cartProductId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cartProductId, product, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartProductDTO other = (CartProductDTO) obj;
		return Objects.equals(cartProductId, other.cartProductId) && Objects.equals(product, other.product)
				&& Objects.equals(quantity, other.quantity);
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}

}
