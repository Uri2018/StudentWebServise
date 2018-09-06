package telran.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import telran.students.api.StudentURI;
import telran.students.dto.ScoreDto;
import telran.students.dto.StudentDto;
import telran.students.dto.StudentEditDto;
import telran.students.dto.StudentResponseDto;
import telran.students.service.IStudentService;

@RestController
public class StudentController {
 @Autowired
	IStudentService studentService;
	
	@PostMapping(StudentURI.STUDENT)
	public boolean addStudent(@RequestBody  StudentDto student)
	{
	  	return studentService.addStudent(student);
	}
	@DeleteMapping(StudentURI.STUDENT)
	public StudentResponseDto removeStudent(@RequestParam int id)
	{
		return studentService.deleteStudent(id);
	}
	@PutMapping(StudentURI.STUDENT+"/{id}")
	public StudentDto editStudent(
			@PathVariable int id,
			@RequestBody StudentEditDto student)
	{
		return studentService.editStudent(id, student);
	}
	@GetMapping(StudentURI.STUDENT+"/{id}")
	public StudentResponseDto getStudent(
			@PathVariable int id)
	{
		return studentService.getStudent(id);
	}
	@GetMapping(StudentURI.TEACHER+"/{id}")
	public boolean addScore(
		@PathVariable	int id,
		@RequestBody ScoreDto score)
	{
		return studentService.addScore(id, score);
	}
}
