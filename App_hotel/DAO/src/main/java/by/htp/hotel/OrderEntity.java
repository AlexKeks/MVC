package by.htp.hotel;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "order", schema = "app_hotel", catalog = "")
public class OrderEntity {
    private int id;
    private String orderstatus;
    private String user;
    private Date arrivaldate;
    private Date eventsdate;
    private int total;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderstatus", nullable = false, length = 50)
    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    @Basic
    @Column(name = "user", nullable = false, length = 50)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "arrivaldate", nullable = false)
    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    @Basic
    @Column(name = "eventsdate", nullable = false)
    public Date getEventsdate() {
        return eventsdate;
    }

    public void setEventsdate(Date eventsdate) {
        this.eventsdate = eventsdate;
    }

    @Basic
    @Column(name = "total", nullable = false)
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (total != that.total) return false;
        if (orderstatus != null ? !orderstatus.equals(that.orderstatus) : that.orderstatus != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (arrivaldate != null ? !arrivaldate.equals(that.arrivaldate) : that.arrivaldate != null) return false;
        if (eventsdate != null ? !eventsdate.equals(that.eventsdate) : that.eventsdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderstatus != null ? orderstatus.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (arrivaldate != null ? arrivaldate.hashCode() : 0);
        result = 31 * result + (eventsdate != null ? eventsdate.hashCode() : 0);
        result = 31 * result + total;
        return result;
    }
}
