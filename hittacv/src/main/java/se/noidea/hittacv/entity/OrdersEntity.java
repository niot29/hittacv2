package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "orders", schema = "screenwork_se_synos", catalog = "")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "client_id")
    private long clientId;
    @Basic
    @Column(name = "order_no")
    private int orderNo;
    @Basic
    @Column(name = "contact_id")
    private int contactId;
    @Basic
    @Column(name = "dueDate")
    private Timestamp dueDate;
    @Basic
    @Column(name = "discount")
    private BigDecimal discount;
    @Basic
    @Column(name = "sum")
    private BigDecimal sum;
    @Basic
    @Column(name = "totalVat")
    private BigDecimal totalVat;
    @Basic
    @Column(name = "totalSum")
    private BigDecimal totalSum;
    @Basic
    @Column(name = "totalQty")
    private int totalQty;
    @Basic
    @Column(name = "status")
    private Object status;
    @Basic
    @Column(name = "invoiced")
    private int invoiced;
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

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public BigDecimal getTotalVat() {
        return totalVat;
    }

    public void setTotalVat(BigDecimal totalVat) {
        this.totalVat = totalVat;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(BigDecimal totalSum) {
        this.totalSum = totalSum;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public int getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(int invoiced) {
        this.invoiced = invoiced;
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

        OrdersEntity that = (OrdersEntity) o;

        if (id != that.id) return false;
        if (clientId != that.clientId) return false;
        if (orderNo != that.orderNo) return false;
        if (contactId != that.contactId) return false;
        if (totalQty != that.totalQty) return false;
        if (invoiced != that.invoiced) return false;
        if (dueDate != null ? !dueDate.equals(that.dueDate) : that.dueDate != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (sum != null ? !sum.equals(that.sum) : that.sum != null) return false;
        if (totalVat != null ? !totalVat.equals(that.totalVat) : that.totalVat != null) return false;
        if (totalSum != null ? !totalSum.equals(that.totalSum) : that.totalSum != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + orderNo;
        result = 31 * result + contactId;
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        result = 31 * result + (totalVat != null ? totalVat.hashCode() : 0);
        result = 31 * result + (totalSum != null ? totalSum.hashCode() : 0);
        result = 31 * result + totalQty;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + invoiced;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
