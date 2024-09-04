package dk.tec.todolistapi;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

enum TypeOfTask {CLEANING,COOKING,GARDENING,PLANNING}
enum PlaceOfTask {KITCHEN, BATHROOM, LIVINGROOM, BEDROOM, HALLWAY, OUTSIDE}

@Entity
public class ToDoItem {

    // ID of task
    // UUID id = UUID.randomUUID();
    @Id
    @GeneratedValue
    int id;

    // Main Task
    String title;
    String description;

    // Dates and time, Maybe LocalDateTime
    Date startDate;
    Date completionDate;
    Date deadline;

    // Priority and importance of task
    Boolean isPriority;
    Boolean isRepeatable;

    // Types and places of tasks
    TypeOfTask typeOfTask;
    PlaceOfTask placeOfTask;

    // Coins awarded for a task
    int coinsAwarded;

    // Contains both filename and uri
    String photo;

    // If tasks area blocked by other tasks
    @OneToMany
    List<ToDoItem> toDoItemListBlockers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Boolean getPriority() {
        return isPriority;
    }

    public void setPriority(Boolean priority) {
        isPriority = priority;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public TypeOfTask getTypeOfTask() {
        return typeOfTask;
    }

    public void setTypeOfTask(TypeOfTask typeOfTask) {
        this.typeOfTask = typeOfTask;
    }

    public PlaceOfTask getPlaceOfTask() {
        return placeOfTask;
    }

    public void setPlaceOfTask(PlaceOfTask placeOfTask) {
        this.placeOfTask = placeOfTask;
    }

    public int getCoinsAwarded() {
        return coinsAwarded;
    }

    public void setCoinsAwarded(int coinsAwarded) {
        this.coinsAwarded = coinsAwarded;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<ToDoItem> getToDoItemListBlockers() {
        return toDoItemListBlockers;
    }

    public void setToDoItemListBlockers(List<ToDoItem> toDoItemListBlockers) {
        this.toDoItemListBlockers = toDoItemListBlockers;
    }
}
