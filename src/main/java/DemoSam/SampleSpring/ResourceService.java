package DemoSam.SampleSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService 
{
	@Autowired
	ResourceRepositary repo;
	
	public Resource create(Resource res)
	{
		return repo.save(res);
	}

}
