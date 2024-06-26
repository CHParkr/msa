package org.msa.item.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_ITEM")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	@Id
	@Column(name ="ID", length = 10)
	private String id;
	
	@Column(name ="ACCOUNT_ID")
	private String accountId;
	
	@Column(name ="NAME", length = 20)
	private String name;
	
	@Column(name ="DESCRIPTION", length = 200)
	private String description;
	
	@Column(name ="ITEM_TYPE", length = 1)
	private String itemType;
	
	@Column(name ="CNT", length = 10)
	private long count;

	@Column(name ="REG_DTS", length = 14)
	private String regDts;

	@Column(name ="UPD_DTS", length = 14)
	private String updDts;
	
}
