package controllers;

import com.google.gson.Gson;
import play.mvc.Controller;
import service.IGroupService;

import javax.inject.Inject;

public class ForumController extends Controller {

    @Inject
    private static IGroupService groupService;

    public static void index() {
        renderText(new Gson().toJson(groupService.loadAllGroups()));
    }

}