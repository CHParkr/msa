package org.msa.authentication.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_ACCOUNT")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	@Column(name = "ACCOUNT_ID", length = 30)
	private String acoountId;
	
	@Column(name = "PASS_WD", length = 100)
	private String password;
	
	@Column(name = "TOKEN", length = 500)
	private String token;
}
