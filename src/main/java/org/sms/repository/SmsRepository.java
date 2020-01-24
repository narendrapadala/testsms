package org.sms.repository;
import org.sms.entites.Sms;
import org.springframework.data.repository.CrudRepository;


public interface SmsRepository extends CrudRepository<Sms, Long>  {

}
