package DemoSam.SampleSpring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resource 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resourceId;
	//@Column(name = "")
	private String resourceName;
	private double resourceSalary;
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resource(int resourceId, String resourceName, double resourceSalary) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceSalary = resourceSalary;
	}
	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceName=" + resourceName + ", resourceSalary="
				+ resourceSalary + "]";
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public double getResourceSalary() {
		return resourceSalary;
	}
	public void setResourceSalary(double resourceSalary) {
		this.resourceSalary = resourceSalary;
	}

}
