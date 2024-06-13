
package model;

public class Subject {
    private int id;
    private String description;
    private double price;
    private String sub_name;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the sub_name
     */
    public String getSub_name() {
        return sub_name;
    }

    /**
     * @param sub_name the sub_name to set
     */
    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
    
}
