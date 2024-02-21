package dmytro.bozhor.employeeservice.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditableEntityListener.class)
@MappedSuperclass
public abstract class AuditableEntity {

    private LocalDateTime createdAt;

}
