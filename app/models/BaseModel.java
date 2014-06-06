package models;

import play.db.jpa.GenericModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by vincent on 14-4-27.
 */
@MappedSuperclass
public class BaseModel extends GenericModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int Id;
}
