package service.impl;

import models.Topic;
import service.ITopicService;

import java.util.List;

/**
 * Created by vincent on 14-5-29.
 */
public class TopicServiceImpl implements ITopicService {

    @Override
    public List<Topic> loadTopics(int groupId, int page, int size) {

        return Topic.find("groupId = ? order by lastCommentAt desc", groupId).fetch(page, size);
    }
}
