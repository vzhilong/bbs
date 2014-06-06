package models;

import play.data.binding.As;
import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by vincent on 14-4-27.
 */
@Entity(name = "dg_topic_comment")
public class TopicComment extends BaseModel {

    @Required
    public String content;

    @Required
    @Column(name = "topic_id")
    public int topicId;

    @Required
    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    public Date create_time = new Date();

    @As("yyyy-MM-dd HH:mm:ss")
    @Column(name = "modify_time")
    public Date modify_time = new Date();

    @Required
    @Column(name = "user_id")
    public int userId;

}
