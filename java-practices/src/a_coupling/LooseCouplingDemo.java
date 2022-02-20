package a_coupling;

class Jenkins1 {

	IDeployer deployer;

	// modify constructor
	public Jenkins1(IDeployer deployer) {
		this.deployer = deployer;
	}

	public void doDeployment() {
		this.deployer.deploy();
	}

}

interface IDeployer {

	void deploy();

}

class DevDeployment1 implements IDeployer {

	public void deploy() {
		System.out.println("deployed to DEv env");
	}

}

class QADeployment1 implements IDeployer {

	public void deploy() {
		System.out.println("deployed to QA env");
	}

}

class ProdDeployment1 implements IDeployer {

	public void deploy() {
		System.out.println("deployed to PRDO env");
	}
}

public class LooseCouplingDemo {

	public static void main(String[] args) {

		// First scenario
		Jenkins1 devJEnkins = new Jenkins1(new DevDeployment1());
		Jenkins1 qaJEnkins = new Jenkins1(new QADeployment1());
		devJEnkins.doDeployment();
		qaJEnkins.doDeployment();

		// new requirement
		Jenkins1 prodJEnkins = new Jenkins1(new ProdDeployment1());
		prodJEnkins.doDeployment();

	}

}
