package backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Penalty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Column(name = "penalty_amount")
    @JsonProperty("amount")
    private Double amount;

    private String status;

    @Column(name = "regulation_body")
    private String regulationBody;

    @Column(name = "due_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;

    // GETTERS
    public Long getId()               { return id; }
    public String getTitle()          { return title; }
    public String getDescription()    { return description; }
    public Double getAmount()         { return amount; }
    public String getStatus()         { return status; }
    public String getRegulationBody() { return regulationBody; }
    public LocalDate getDueDate()     { return dueDate; }
    public boolean getIsDeleted()     { return isDeleted; }

    // SETTERS
    public void setId(Long id)                           { this.id = id; }
    public void setTitle(String title)                   { this.title = title; }
    public void setDescription(String description)       { this.description = description; }
    public void setAmount(Double amount)                 { this.amount = amount; }
    public void setStatus(String status)                 { this.status = status; }
    public void setRegulationBody(String regulationBody) { this.regulationBody = regulationBody; }
    public void setDueDate(LocalDate dueDate)            { this.dueDate = dueDate; }
    public void setIsDeleted(boolean isDeleted)          { this.isDeleted = isDeleted; }
}