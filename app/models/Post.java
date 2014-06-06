package models;

import play.data.binding.As;
import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by vincent on 14-5-29.
 */
@Entity(name = "dg_post")
public class Post extends BaseModel {

    @Required
    public String subject;

    @Required
    public String content;

    @Required
    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_at")
    public Date createAt = new Date();

    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_at")
    public Date updateAt = new Date();

    @Required
    @Column(name = "user_id")
    public int userId;
}
