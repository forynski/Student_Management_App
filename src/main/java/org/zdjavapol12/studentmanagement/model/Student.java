package org.zdjavapol12.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private Long indexNumber;
    private String firstName;
    private String lastName;
    private String fieldOfStudy;
    private Integer mobile;
    private LocalDate startDate;
    private LocalDate graduationDate;

}
