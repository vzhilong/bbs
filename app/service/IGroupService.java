package service;

import models.Group;

import java.util.List;

/**
 * Created by vincent on 14-5-29.
 */
public interface IGroupService {

    List<Group> loadAllGroups();

    List<Group> loadAllGroupsWithForum();
}
