package by.overone.project.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "t_user")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column (name = "t_user_name") //
    private String name;

    @Column (name = "t_user_secondName") //
    private String secondName;

    @Column (name = "t_user_age") //
    private String age;

}

