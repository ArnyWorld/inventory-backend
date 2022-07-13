package com.company.inventory.model;

import java.io.Serializable;
<<<<<<< HEAD

import javax.persistence.Basic;
=======
import java.util.Locale.Category;

>>>>>>> 3b415050656c5ad28567c3673120bbaae71b6e41
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.Lob;
=======
>>>>>>> 3b415050656c5ad28567c3673120bbaae71b6e41
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7461389651533509262L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int price;
	
	private int account;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Category category;
	
<<<<<<< HEAD
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name="picture")
=======
	@Column(name="picture", length = 1000)
>>>>>>> 3b415050656c5ad28567c3673120bbaae71b6e41
	private byte[] picture; 
}
