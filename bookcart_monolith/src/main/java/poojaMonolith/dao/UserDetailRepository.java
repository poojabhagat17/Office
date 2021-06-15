package poojaMonolith.dao;

import org.springframework.data.repository.CrudRepository;

import poojaMonolith.dao.model.UserDetails;

public interface UserDetailRepository extends CrudRepository<UserDetails, Integer> {

}
