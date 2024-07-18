package Boot_basics.project_basic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity

    public class app_entity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int appId;
        private String appName;
        private String appVendor;
        private int downloadedCount;
        private double ratings;
        private int profileId;
    }



