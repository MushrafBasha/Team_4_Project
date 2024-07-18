package Boot_basics.project_basic;

import jakarta.annotation.PostConstruct;
import org.slf4j.IMarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app")
public class app_rest {

    @Autowired
    private app_services service;

    @GetMapping("/byProfile/{profileId}")
    public List<app_entity> callByProfile(@PathVariable("profileId") int profileId){
        return service.implementFindProfile(profileId);
    }

    @GetMapping("/{id}")
    public app_entity fetchOne(@PathVariable("id") int id){
        return service.implementFindById(id);
    }

    @PutMapping("/put")
    public app_entity progress(@RequestBody app_entity apps){
        return service.implementSave(apps);
    }

    @DeleteMapping("/del/{id}")
    public String discharge(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }

    @GetMapping("/get")
    public List<app_entity> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/post")
    public app_entity ab(@RequestBody app_entity apps){
        return service.implementSave(apps);
    }
}


