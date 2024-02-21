package dmytro.bozhor.employeeservice.domain.embedded.components;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonalInfo {

    private String firstName;

    private String secondName;

    private Integer age;

}
