package com.generics.service;
import com.generics.model.*;
import java.util.*;
public class Repository<T extends Student>
{
private Map<String,T>studentIdWiseMap;
public Repository()
{
this.studentIdWiseMap=new HashMap<>();
}
public void add(T student)throws StudentException
{


String id=student.getId();

if(id == null || id.trim().isEmpty()) {
    throw new StudentException("Invalid Student Id: " + id);
}
id=id.trim();
String name=student.getName();
if(name == null || name.trim().isEmpty()) {
    throw new StudentException("Invalid Student Name: " + name);
}

String email=student.getEmail();
name = name.trim();
if(email == null || email.trim().isEmpty()) {
    throw new StudentException("Invalid Email: " + email);
}


email = email.trim();
if(studentIdWiseMap.containsKey(id))
{
throw new StudentException("Student with Student Id: "+id+" Already Exists");
}

studentIdWiseMap.put(id,student);

}

public void update(T student) throws StudentException {

    String id = student.getId();

    if (id == null || id.trim().isEmpty()) {
        throw new StudentException("Invalid Student Id: " + id);
    }

    id = id.trim();

    String name = student.getName();

    if (name == null || name.trim().isEmpty()) {
        throw new StudentException("Invalid Student Name: " + name);
    }

    name = name.trim();

    String email = student.getEmail();

    if (email == null || email.trim().isEmpty()) {
        throw new StudentException("Invalid Student Email: " + email);
    }

    email = email.trim();

    if (!studentIdWiseMap.containsKey(id)) {
        throw new StudentException(
            "Student with Student Id: " + id + " Does Not Exist"
        );
    }

    studentIdWiseMap.put(id, student);

    System.out.println("Student Updated Successfully!");

}
public void delete(String id) throws StudentException {

    if (id == null || id.trim().isEmpty()) {
        throw new StudentException("Invalid Student Id: " + id);
    }

    id = id.trim();

    if (!studentIdWiseMap.containsKey(id)) {
        throw new StudentException(
            "Student with Student Id: " + id + " Does Not Exist"
        );
    }

    studentIdWiseMap.remove(id);

    System.out.println("Student Deleted Successfully!");

}
public List<T> getAll()throws StudentException
{
if(studentIdWiseMap.size()==0)
{
throw new StudentException("No Records");
}
    return new ArrayList<>(studentIdWiseMap.values());
}

public T getStudentById(String id) throws StudentException {

    if (id == null || id.trim().isEmpty()) {
        throw new StudentException("Invalid Student Id: " + id);
    }

    id = id.trim();

    if (!studentIdWiseMap.containsKey(id)) {
        throw new StudentException(
            "Student with Student Id: " + id + " Does Not Exist"
        );
    }

    return studentIdWiseMap.get(id);
}

}