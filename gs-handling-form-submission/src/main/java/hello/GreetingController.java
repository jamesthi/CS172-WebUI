package hello;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import edu.ucr.qlyu001.Lucene.App;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) throws IOException, ParseException{
    	App ranker = new App();
    	String res = ranker.rankQueryHTML(greeting.getContent(), greeting.getNumResults());
    	greeting.setResults(res);
        return "result";
    }

}
