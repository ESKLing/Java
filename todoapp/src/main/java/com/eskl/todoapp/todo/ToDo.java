package com.eskl.todoapp.todo;

import javax.persistence.*;

@Entity
@Table
public class ToDo {

    @Id
    @SequenceGenerator(
            name = "todo_sequence",
            sequenceName = "todo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_sequence"
    )

    private Long id;
    private String name;

    private boolean checked;

    public ToDo(Long id, String name, boolean checked) {
        this.id = id;
        this.name = name;
        this.checked = checked;
    }

    // as the database will automatically generate the ID for us
    public ToDo(String name) {
        this.name = name;
    }

    //default constructor needed
    public ToDo() {
    }

    // getters and setters needed in order for serialisation of this object into JSON?
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", name='" + name +
                ", checked='" + checked + '\'' +
                '}';
    }
}
