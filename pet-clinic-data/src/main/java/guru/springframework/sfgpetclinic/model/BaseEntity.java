import java.io.Serializable;

ddpackage guru.springframework.sfgpetclinic.model;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
