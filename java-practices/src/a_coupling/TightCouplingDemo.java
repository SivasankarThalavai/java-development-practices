package a_coupling;

class Jenkins {

	DevDeployment dev;
	QADeployment qa;
	ProdDeployment prod; // new requirement

	// modify constructor for new requirement
	public Jenkins(DevDeployment dev, QADeployment qa) {
		this.dev = dev;
		this.qa = qa;
	}

	// modify constructor for new requirement
	public Jenkins(DevDeployment dev, QADeployment qa, ProdDeployment prod) {
		this(dev, qa); // //reusing constructor
		this.prod = prod;// add
	}

	public void doDeployment() {
		dev.deploy();
		qa.deploy();
		prod.deploy();// make call for new requirement
	}

}

class DevDeployment {

	public void deploy() {
		System.out.println("deployed to DEv env");
	}

}

class QADeployment {

	public void deploy() {
		System.out.println("deployed to QA env");
	}

}

class ProdDeployment {

	public void deploy() {
		System.out.println("deployed to PRDO env");
	}
}

public class TightCouplingDemo {

	public static void main(String[] args) {

		// First scenario

		DevDeployment dev = new DevDeployment();
		QADeployment qa = new QADeployment();

		// Jenkins jenkins1 = new Jenkins(dev, qa);
		// jenkins1.doDeployment();

		// new requirement
		ProdDeployment prod = new ProdDeployment();
		Jenkins jenkins2 = new Jenkins(dev, qa, prod);
		jenkins2.doDeployment();
	}

}
