package dmytro.bozhor.employeeservice.domain;

import dmytro.bozhor.employeeservice.domain.embedded.components.PersonalInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private PersonalInfo personalInfo;

    private String phoneNumber;

    private String email;

    private BigInteger salary;

}
