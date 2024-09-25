package springmvc4;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	EntityManager em;
	@RequestMapping("/createpage")
	public ModelAndView createPage() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createpage.jsp");
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@RequestParam String name, @RequestParam String email,@RequestParam long phone,@RequestParam String password) {
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		User dbUser=em.merge(u);
		et.commit();
		
		
		ModelAndView mv = new ModelAndView();
		Query q = em.createQuery("from User");
		List<User> users = q.getResultList();
		mv.setViewName("allusers.jsp");
		mv.addObject("msg","User Created Successfully");
		mv.addObject("users",users);
		return mv;
	}
	
	@RequestMapping("/allusers")
	public ModelAndView findAllUsers() {
		Query q = em.createQuery("from User");
		List<User> users = q.getResultList();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("allusers.jsp");
		mv.addObject("users",users);
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteUserById(@RequestParam int id) {
		User u = em.find(User.class, id);
		String mesg;
		EntityTransaction et = em.getTransaction();
		if(u!=null) {
			et.begin();
			em.remove(u);
			et.commit();
			mesg = "User Deleted Succesfully" ;
		}else {
			mesg= "Invalid Operation";
		}
		
		ModelAndView mv = new ModelAndView();
		Query q = em.createQuery("from User");
		List<User> users = q.getResultList();
		
		mv.setViewName("allusers.jsp");
		mv.addObject("msg",mesg);
		mv.addObject("users",users);
		return mv;
	}
	@RequestMapping("/updatepage")
	public ModelAndView updatepage(@RequestParam int id) {
		User u = em.find(User.class, id);
		String mesg;
		ModelAndView mv = new ModelAndView();
		if(u!=null) {
			mv.setViewName("update.jsp");
			mv.addObject("id",id);
			mv.addObject("name",u.getName());
			mv.addObject("email",u.getEmail());
			mv.addObject("phone", u.getPhone());
			
		}else {
			mv.setViewName("allusers.jsp");
			mv.addObject("msg","Users Does not Exist ");
		}
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam int id, @RequestParam String name,@RequestParam String email , @RequestParam String phone,@RequestParam String password1,@RequestParam String password2) {
		User u = em.find(User.class, id);
		String mesg;
		EntityTransaction et = em.getTransaction();
		if(u!=null) {
			
			if(name != null) {
				u.setName(name);
			}
			if(email != null) {
				u.setEmail(email);
			}
			if(phone != null) {
				u.setPhone(Long.parseLong(phone));
			}
			if(password1 != "" || password2 != ""  && password1 == password2) {
				System.out.println("UserController.update()");
				System.out.println(password1 + " "+password2);
				u.setPassword(password2);
			}
			et.begin();
			em.merge(u);
			et.commit();
			mesg = "Updated Successfully...";
		}
		else {
			mesg = "no such user found";
		}
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("allusers.jsp");
		Query q = em.createQuery("from User");
		List<User> users = q.getResultList();
		
		mv.setViewName("allusers.jsp");
		mv.addObject("msg",mesg);
		mv.addObject("users",users);
		return mv;
	}
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String searchQuery) {
		Query q = em.createQuery("from User");
		List<User> ul = q.getResultList();
		ArrayList<User> users = new ArrayList<User>();
		for(User u : ul) {
			if(
					(u.getId()+"").equalsIgnoreCase(searchQuery)||
					(u.getId()+"").contains(searchQuery)||
					(u.getName()+"").equalsIgnoreCase(searchQuery) ||
					(u.getName()+"").contains(searchQuery) ||
					(u.getEmail()+"").equalsIgnoreCase(searchQuery) ||
					(u.getName()+"").contains(searchQuery) ||
					(u.getPhone()+"").equalsIgnoreCase(searchQuery)||
					(u.getPhone()+"").contains(searchQuery)
			  ){
				  users.add(u);
			  }
		}
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("allusers.jsp");
		mv.addObject("msg","Query Executed");
		mv.addObject("users",users);
		return mv;
	}
}
