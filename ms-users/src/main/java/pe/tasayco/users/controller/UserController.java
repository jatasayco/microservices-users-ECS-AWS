package pe.tasayco.users.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.tasayco.users.domain.*;

@RestController
@RequestMapping("/users")
public class UserController {
	@RequestMapping(method = RequestMethod.GET)
    public List<User> listUser(){
		List<User> user = new ArrayList<>();
		
		User obj = new User();
		obj.setId(1);
		obj.setName("Jair");
		user.add(obj);
		
		User obj_2 = new User();
		obj_2.setId(2);
		obj_2.setName("Antonio");
		user.add(obj_2);
		
        return user;
    }
}
