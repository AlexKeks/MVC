package by.htp.hotel.entities;

import by.htp.hotel.entities.enums.OrderStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.sql.Date;

import static javax.persistence.AccessType.PROPERTY;

@Entity
@Data
@NoArgsConstructor
@Table(name = "order")
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 12)
    @Access(PROPERTY)
    private OrderStatus status;


   // @Access(PROPERTY)
  //  private User user;

    @Getter
    @Access(PROPERTY)
    private Date arrivalDate;

    @Access(PROPERTY)
    private Date eventsDate;


    private Long total;

   // public Order(User user) {
   //     this.user = user;
   // }




    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setEventsDate(Date eventsDate) {
        this.eventsDate = eventsDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getEventsDate() {
        return eventsDate;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}

