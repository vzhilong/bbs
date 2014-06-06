package models;

import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vincent on 14-5-29.
 */
@Entity(name = "dg_topic_tag")
public class TopicTagRelation extends BaseModel {

    @Required
    @Column(name = "topic_id")
    public int topicId;

    @Required
    @Column(name = "tag_id")
    public int tagId;
}
