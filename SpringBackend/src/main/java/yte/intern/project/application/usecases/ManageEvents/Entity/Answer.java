package yte.intern.project.application.usecases.ManageEvents.Entity;

import lombok.*;
import yte.intern.project.application.usecases.common.Entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@SequenceGenerator(name="idgen",sequenceName = "EVENT_SEQ")
public class Answer extends BaseEntity {

    @Column( name = "QUESTION_NAME")
    private String questionName;

    @Column( name = "ANSWER")
    private String answer;
}
