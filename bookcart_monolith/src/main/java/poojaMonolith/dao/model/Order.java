package poojaMonolith.dao.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Order {
	
	private Long id;
	private Long userId;
	private Long bookId;
	private  Long quantity;
	private Date date; 
    private BigDecimal netOrderdPrice;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getNetOrderdPrice() {
		return netOrderdPrice;
	}
	public void setNetOrderdPrice(BigDecimal netOrderdPrice) {
		this.netOrderdPrice = netOrderdPrice;
	}

}
