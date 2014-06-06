package models;

import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vincent on 14-4-29.
 */
@Entity(name = "dg_user")
public class User extends BaseModel {

    @Required
    public String email;

    @Required
    @Column(name = "password_hash")
    public String passwordHash;

    public String nickname;
}
