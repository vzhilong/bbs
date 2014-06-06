package models;

import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vincent on 14-5-29.
 */
@Entity(name = "dg_forum")
public class Forum extends BaseModel {

    @Required
    public String display;

    public String description;

    @Column(name = "order_num")
    public int orderNum;

    @Column(name = "group_id")
    public int groupId;
}
