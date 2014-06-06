package service.impl;

import models.Forum;
import models.Group;
import service.IGroupService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vincent on 14-5-29.
 */
public class GroupServiceImpl implements IGroupService {

    @Override
    public List<Group> loadAllGroupsWithForum() {
        List<Group> groups = Group.find("order by orderNum asc").fetch();
        for (Group group : groups) {
            group.forums = Forum.find("groupId = ? order by orderNum asc", group.Id).fetch();
        }

        return groups;
    }

    @Override
    public List<Group> loadAllGroups() {
        List<Group> groups = Group.find("order by orderNum asc").fetch();

        return groups;
    }
}
