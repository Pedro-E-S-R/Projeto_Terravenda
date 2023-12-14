package terravenda.com.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_imovel")
public class Imovel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adress;
    private Double priceSale;
    private Double priceRent;
    private String image;
    private String description;
    private String cityAndState;

    public Imovel(){

    }

    public Imovel(Long id, String adress, Double priceSale, Double priceRent, String image, String description, String cityAndState) {
        this.id = id;
        this.adress = adress;
        this.priceSale = priceSale;
        this.priceRent = priceRent;
        this.image = image;
        this.description = description;
        this.cityAndState = cityAndState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(Double priceSale) {
        this.priceSale = priceSale;
    }

    public Double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(Double priceRent) {
        this.priceRent = priceRent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCityAndState() {
        return cityAndState;
    }

    public void setCityAndState(String cityAndState) {
        this.cityAndState = cityAndState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Imovel imovel)) return false;
        return Objects.equals(getId(), imovel.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
