package uz.mm.entity.finance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.mm.entity.base.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(indexes = {
        @Index(name = "discount_status_index", columnList = "status"),
        @Index(name = "discount_courseId_index", columnList = "courseId")
})
public class Discount extends Auditable {
    @Column(nullable = false)
    private String courseId;

    private Double percentage;

    private Double amount;

    private LocalDateTime dueDate;
}
