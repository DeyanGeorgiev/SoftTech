package issuetracker.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "issues")
public class Issue {

    private Integer id;
    private String title;
    private String content;
    private Integer priority;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column
    @NotNull
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column
    @NotNull
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Issue() {
    }

    public Issue(Integer id, String title, String content, Integer priority) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.priority = priority;
    }
}
