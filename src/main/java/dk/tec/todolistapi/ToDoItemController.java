package dk.tec.todolistapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/todoitem")
public class ToDoItemController {

    ToDoItemRepository repository;


    ToDoItemController(ToDoItemRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    void create(@RequestBody ToDoItem toDoItem){
        repository.save(toDoItem);
    }

    @GetMapping
    public List<ToDoItem> getAll(){
        return repository.findAll();
    }

//    From demo https://medium.com/@karbhariumer64/title-building-a-crud-application-with-h2-database-in-spring-boot-a-step-by-step-guide-af05e5685f71
//    @GetMapping("/{id}")
//    public ResponseEntity<ToDoItem> getById (@PathVariable int id) {
//        Optional<ToDoItem> itemOptional = repository.findById(id);
//        return itemOptional.map(item -> ResponseEntity.ok().body(item)).orElse(ResponseEntity.notFound().build());
//    }

    @GetMapping("/{id}")
    ToDoItem GetById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PutMapping()
    void updateById(@RequestBody ToDoItem toDoItem){
        repository.save(toDoItem);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id){
        repository.deleteById(id);
    }



}
