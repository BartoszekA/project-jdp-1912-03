package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.GroupDto;
import com.kodilla.ecommercee.domain.GroupNotFountException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/groups")
public class GroupController {

    @RequestMapping(method = RequestMethod.GET, value = "getAllGroups")
    public List<GroupDto> getAllGroups(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.POST, value = "addNewGroup")
    public void addNewGroup(GroupDto groupDto){

    }

    @RequestMapping(method = RequestMethod.GET, value = "getGroup")
    public GroupDto getGroup(Long id) throws GroupNotFountException {
        return new GroupDto((long)5D, "Apples");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateGroup")
    public GroupDto updateGroup(GroupDto groupDto){
        return new GroupDto((long)5D,"More Apples");
    }


}
