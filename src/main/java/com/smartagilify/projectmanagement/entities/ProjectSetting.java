package com.smartagilify.projectmanagement.entities;

import com.smartagilify.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "PMS$T_PROJECT_SETTING")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectSetting extends BaseEntity {

    @ManyToMany
    @JoinColumn(name = "PROJECTS", foreignKey = @ForeignKey(name = "FK_PROJECT_SETTING"))
    private List<Project> projects;

    @Column(name = "ROLE_ID")
    private Long roleId;

}
