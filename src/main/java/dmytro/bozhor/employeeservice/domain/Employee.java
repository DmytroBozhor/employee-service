package dmytro.bozhor.employeeservice.domain;

import dmytro.bozhor.employeeservice.domain.embedded.components.PersonalInfo;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PersonalInfo personalInfo;

    private String phoneNumber;

    private String email;

    private BigInteger salary;

}
