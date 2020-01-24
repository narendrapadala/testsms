
package org.sms.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sms")
public class Sms {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "smsid")
	private long smsId;

	@Column(name = "sms")
	private String sms;

	@Column(name = "created_at")
	private String createdAt;
}
