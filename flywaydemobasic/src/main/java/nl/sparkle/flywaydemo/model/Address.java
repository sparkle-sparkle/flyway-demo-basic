package nl.sparkle.flywaydemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "street")
	private String street;

	@Column(name = "house_number")
	private Integer houseNumber;

	@Column(name = "postalcode")
	private String postalcode;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(street)
				.append(houseNumber)
				.append(postalcode)
				.append(city)
				.append(country)
				
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		 if (obj == null) { return false; }
		   if (obj == this) { return true; }
		   if (obj.getClass() != getClass()) {
		     return false;
		   }
		   Address other = (Address) obj;
		   return new EqualsBuilder()
                 .appendSuper(super.equals(obj))
                 .append(id, other.id)
                 .append(street, other.street)
                 .append(houseNumber, other.houseNumber)
                 .append(postalcode, other.postalcode)
                 .append(city, other.city)
                 .append(country, other.country)

                 .isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			       .append("id", id)
			       .append("street", street)
			       .append("houseNumber", houseNumber)
			       .append("postalcode", postalcode)
			       .append("city", city)
			       .append("country", country)
			       
			       .toString();
	}

}
