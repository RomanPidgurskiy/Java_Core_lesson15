package ua.lviv.lgs;

public class Animal {
	
 public String type_of_animal;
 public String name;
 
 public Animal(String name, String type_of_animal) {
	super();
	this.type_of_animal = type_of_animal;
	this.name = name;
}

public String getType_of_animal() {
	return type_of_animal;
}

public void setType_of_animal(String type_of_animal) {
	this.type_of_animal = type_of_animal;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Animal [name=" + name +", type_animal=" + type_of_animal + "]";
}
 
 
}
