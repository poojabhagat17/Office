package poojaMonolith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import poojaMonolith.business.BookCartBusinessImpl;
import poojaMonolith.dao.model.BookDetails;
import poojaMonolith.dao.model.Inventory;
import poojaMonolith.dao.model.UserDetails;


@RestController("bookcart")
public class BookCartController {            // in controller we just pass ui request to business layer
	
	@Autowired
	private BookCartBusinessImpl bookCartBusiness;
	//localhost:8080/bookcart/user
	
	
	@GetMapping(path="user/{id}")
	public UserDetails getUser(@PathVariable String id) {
               // no need to do this all business class will do it for you, you just need to call it.  
		
		//  check user access
		
		// check user type - Admin or  customer
		
		return  bookCartBusiness.getUser(id);
	}
	
	public BookDetails getBookDetails(String id) {
	// Create database connection                                    //we have six function in our app
	// open session 
	//get user  

	// close session connection
		
		return new BookDetails();
	}
	
	public Inventory getInventryDetails(String id) {
	// Create database connection                                    //we have six fuction in our app
	// open session 
	//get user  
	
	// close session connection
		
	return new Inventory();
	}
}
