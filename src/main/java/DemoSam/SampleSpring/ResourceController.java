package DemoSam.SampleSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController 
{
	@Autowired
	ResourceService service;
	
	@PostMapping("/onenew")
	public String makecreate(@RequestBody Resource res)
	{
		return service.create(res).getResourceName()+" has beed added successfully";
	}

}
