package backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PenaltyRequest {

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @NotNull(message = "Amount is required")
    private Double amount;

    @NotBlank(message = "Status is required")
    private String status;

    private String regulationBody;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getRegulationBody() { return regulationBody; }
    public void setRegulationBody(String regulationBody) { this.regulationBody = regulationBody; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}