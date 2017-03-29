package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  	public Husky() {
		this("Fido");
	}

  	public Husky(String name) {
		super(name, "Husky");
	}

	public void pullSled(){
		System.out.println("Pullin that sled");
	}

	public void bark() {
		System.out.println(this+" barks like a Husky");
	}

	public void hug() {
		System.out.println(this+" hug hugs");
	}
}