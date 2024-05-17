package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_items", schema = "screenwork_se_synos", catalog = "")
public class OrderItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "client_id")
    private long clientId;
    @Basic
    @Column(name = "order_id")
    private long orderId;
    @Basic
    @Column(name = "order_no")
    private int orderNo;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "product_art_no")
    private String productArtNo;
    @Basic
    @Column(name = "product_regular_price")
    private BigDecimal productRegularPrice;
    @Basic
    @Column(name = "product_sale_price")
    private BigDecimal productSalePrice;
    @Basic
    @Column(name = "product_ticket")
    private int productTicket;
    @Basic
    @Column(name = "product_code")
    private int productCode;
    @Basic
    @Column(name = "product_type")
    private String productType;
    @Basic
    @Column(name = "qty")
    private int qty;
    @Basic
    @Column(name = "totalPrice")
    private BigDecimal totalPrice;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductArtNo() {
        return productArtNo;
    }

    public void setProductArtNo(String productArtNo) {
        this.productArtNo = productArtNo;
    }

    public BigDecimal getProductRegularPrice() {
        return productRegularPrice;
    }

    public void setProductRegularPrice(BigDecimal productRegularPrice) {
        this.productRegularPrice = productRegularPrice;
    }

    public BigDecimal getProductSalePrice() {
        return productSalePrice;
    }

    public void setProductSalePrice(BigDecimal productSalePrice) {
        this.productSalePrice = productSalePrice;
    }

    public int getProductTicket() {
        return productTicket;
    }

    public void setProductTicket(int productTicket) {
        this.productTicket = productTicket;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemsEntity that = (OrderItemsEntity) o;

        if (id != that.id) return false;
        if (clientId != that.clientId) return false;
        if (orderId != that.orderId) return false;
        if (orderNo != that.orderNo) return false;
        if (productId != that.productId) return false;
        if (productTicket != that.productTicket) return false;
        if (productCode != that.productCode) return false;
        if (qty != that.qty) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productArtNo != null ? !productArtNo.equals(that.productArtNo) : that.productArtNo != null) return false;
        if (productRegularPrice != null ? !productRegularPrice.equals(that.productRegularPrice) : that.productRegularPrice != null)
            return false;
        if (productSalePrice != null ? !productSalePrice.equals(that.productSalePrice) : that.productSalePrice != null)
            return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (totalPrice != null ? !totalPrice.equals(that.totalPrice) : that.totalPrice != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + orderNo;
        result = 31 * result + productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productArtNo != null ? productArtNo.hashCode() : 0);
        result = 31 * result + (productRegularPrice != null ? productRegularPrice.hashCode() : 0);
        result = 31 * result + (productSalePrice != null ? productSalePrice.hashCode() : 0);
        result = 31 * result + productTicket;
        result = 31 * result + productCode;
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + qty;
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
