package soybox.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public Map<String,Object> main() {
		
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("hello", "world");
		
		
		System.out.println("이슈1에서 커밋!");
		return result;
	}
}
