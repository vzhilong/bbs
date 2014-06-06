package models;

import play.data.validation.Required;

import javax.persistence.Entity;

/**
 * Created by vincent on 14-4-27.
 */
@Entity(name = "dg_tag")
public class Tag extends BaseModel {

    @Required
    public String display;

}
