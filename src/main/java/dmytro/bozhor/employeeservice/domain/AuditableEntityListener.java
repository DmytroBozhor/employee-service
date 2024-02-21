package dmytro.bozhor.employeeservice.domain;

import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public class AuditableEntityListener {

    @PrePersist
    public void processEntity(AuditableEntity auditableEntity) {
        auditableEntity.setCreatedAt(LocalDateTime.now());
    }

}
