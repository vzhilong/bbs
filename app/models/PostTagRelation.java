package models;

import play.data.validation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vincent on 14-4-27.
 */
@Entity(name = "dg_post_tag")
public class PostTagRelation extends BaseModel {

    @Required
    @Column(name = "post_id")
    public int postId;

    @Required
    @Column(name = "tag_id")
    public int tagId;
}
