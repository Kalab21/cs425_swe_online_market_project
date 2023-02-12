package edu.miu.cs.cs425.swe_online_market_project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import edu.miu.cs.cs425.swe_online_market_project.constant.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="payments")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;

    @NotNull
    @NotBlank(message = "Required")
    @Column(nullable = false)
    private String cardName;

    @NotNull(message = "Required")
    @Column(nullable = false)
    private PaymentType type;

    @NotNull
    @NotBlank(message = "Required")
    @Column(nullable = false, unique = true)
    private String cardNumber;

    @NotNull(message = "Required")
    @Column(nullable = false)
    private int csv;

    @Column(name = "is_default")
    private boolean isDefault;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
   @JsonBackReference
    private User user;

}
