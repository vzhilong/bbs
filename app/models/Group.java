package models;

import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

/**
 * Created by vincent on 14-4-27.
 */
@Entity(name = "dg_group")
public class Group extends BaseModel {

    @Required
    public String display;

    public String description;

    @Column(name = "order_num")
    public int orderNum;

    @Transient
    public List<Forum> forums;

}
