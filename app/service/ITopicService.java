package service;

import models.Topic;

import java.util.List;

/**
 * Created by vincent on 14-5-29.
 */
public interface ITopicService {

    List<Topic> loadTopics(int groupId, int start, int size);
}
