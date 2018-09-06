package telran.students.service;

import telran.students.dto.ScoreDto;
import telran.students.dto.StudentDto;
import telran.students.dto.StudentEditDto;
import telran.students.dto.StudentResponseDto;

public interface IStudentService {
	
boolean addStudent(StudentDto student);

StudentResponseDto deleteStudent(int id);

StudentDto editStudent(int id,StudentEditDto student);

StudentResponseDto getStudent(int id);

boolean addScore(int id,ScoreDto score);

}
