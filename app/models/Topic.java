package models;

import play.data.binding.As;
import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by vincent on 14-4-27.
 */
@Entity(name = "dg_topic")
public class Topic extends BaseModel {

    @Required
    public String subject;

    @Required
    public String content;

    @Required
    @Column(name = "forum_id")
    public int forumId;

    @Required
    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_at")
    public Date createAt = new Date();

    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_at")
    public Date updateAt = new Date();

    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "last_comment_at")
    public Date lastCommentAt = new Date();

    @Required
    @Column(name = "user_id")
    public int userId;
}
