package DemoSam.SampleSpring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepositary extends CrudRepository<Resource, Integer>
{
	

}
