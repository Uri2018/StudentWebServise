package telran.students.entities;

import java.util.HashMap;
import java.util.Map;

public class Student {
int id;
String name;
String password;
Map<String,Integer>scores;

public Student(int id, String name, String password) {
	this.id = id;
	this.name = name;
	this.password = password;
	this.scores=new HashMap<>();
}

public Student() {

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getId() {
	return id;
}

public Map<String, Integer> getScores() {
	return scores;
}

public boolean addscore(String examname,int score)
{
	return scores.put(examname, score)!=null;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id != other.id)
		return false;
	return true;
}

}
