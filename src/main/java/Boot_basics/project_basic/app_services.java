package Boot_basics.project_basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class app_services {


    @Autowired
    app_jpa remote;

    public List<app_entity> implementFindProfile(int profileId){
        return remote.findAllByProfileId(profileId);
    }

    public app_entity implementFindById(int appsID){
        return remote.findById(appsID).orElse(new app_entity());
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<app_entity> implementFindAll(){
        return remote.findAll();
    }

    public app_entity implementSave(app_entity apps){
        return remote.save(apps);

    }
}

