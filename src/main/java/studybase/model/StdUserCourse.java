package studybase.model;

import javax.persistence.*;

/**
 * Created by BlackAngel on 26.05.2016.
 */
@Entity
@Table(name = "std_user_course")
public class StdUserCourse {

    @Id
    @GeneratedValue
    @Column
    int id;

}
