package config;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import service.IGroupService;
import service.ITopicService;
import service.impl.GroupServiceImpl;
import service.impl.TopicServiceImpl;

/**
 * Created by vincent on 14-5-29.
 */
public class GuicyDummyModel implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(IGroupService.class).to(GroupServiceImpl.class).in(Singleton.class);
        binder.bind(ITopicService.class).to(TopicServiceImpl.class).in(Singleton.class);
    }
}
