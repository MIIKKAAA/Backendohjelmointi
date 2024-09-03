package syksy24.viikkoharjoitus2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import syksy24.viikkoharjoitus2.domain.Friend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;



@Controller
public class FriendController {

	private List<Friend> friendList;

    public FriendController() {
        this.friendList = new ArrayList<>();

        friendList.add(new Friend("Mauno", "Koivisto"));
        friendList.add(new Friend("Tarja", "Halonen"));
        friendList.add(new Friend("Sauli", "Niinistö"));
        friendList.add(new Friend("Martti", "Ahtisaari"));

    }

    @GetMapping("addfriend")
    public String showFriendForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "friendform";
    }

    @PostMapping("addfriend")
    public String submitFriendForm(@ModelAttribute Friend friend, Model model) {
        friendList.add(friend);
        
        return "redirect:/friends"   ;
    }

    @GetMapping("friends")
    public String getFriends(Model model) {
 
        model.addAttribute("friends", friendList);

        return "friends";
    }

}
