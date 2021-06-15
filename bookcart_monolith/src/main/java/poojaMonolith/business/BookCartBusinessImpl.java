package poojaMonolith.business;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poojaMonolith.dao.BookCartDaoImpl;
import poojaMonolith.dao.model.Order;
import poojaMonolith.dao.model.UserDetails;

@Service
public class BookCartBusinessImpl {
	
	@Autowired
	private BookCartDaoImpl bookCartDao;
                                                                                                                    	// while transfer the data from controller to business  convention is
		public UserDetails getUser(final String id) {                            // to take parameter variable as final, so the para var will not modify within the method. 
		                                                                                                             //actual business logic is here
		// getting data from multiple users
			
		// close session connection
			
			return  bookCartDao.getUser(id);
		}
		
		public void orderBook(final Long bookId, final Long quantity) {
		// check book inventory
		// place an order
			
			final Order order= new Order();
			order.setBookId(bookId);
			// quantity 3
			order.setQuantity(quantity);
			
			BigDecimal basicPrice = BigDecimal.valueOf(200 * quantity);
			order.setNetOrderdPrice(basicPrice);
			// overall price
			// overall price= basicPrice+ GST+ texes + DeliveryChrges
			
			// save the order
		} 

}
