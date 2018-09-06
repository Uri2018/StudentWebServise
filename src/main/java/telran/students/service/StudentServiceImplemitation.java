package telran.students.service;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import telran.students.dao.IStudentRepository;

import telran.students.dto.ScoreDto;
import telran.students.dto.StudentDto;
import telran.students.dto.StudentEditDto;
import telran.students.dto.StudentResponseDto;
import telran.students.entities.Student;

@Service
public class StudentServiceImplemitation implements IStudentService {
@Autowired

	IStudentRepository studentRepository;
	@Override
	public boolean addStudent(StudentDto student) {
		Student newStudent=new Student(student.getId(), student.getName(), student.getPassword());
		return studentRepository.addStudent(newStudent);
	}

	@Override
	public StudentResponseDto deleteStudent(int id) {
		
		StudentResponseDto dto=deleteStudent(id);
		return dto;
	}

	@Override
	public StudentDto editStudent(int id, StudentEditDto student) {
		StudentDto dto= editStudent(id, student);
		return  dto;
	}

	@Override
	public StudentResponseDto getStudent(int id) {
		Student student=studentRepository.getStudentById(id);
		StudentResponseDto studentResponse=new StudentResponseDto();
		studentResponse.setId(student.getId());
		studentResponse.setName(student.getName());
		studentResponse.setScores(student.getScores());
		return studentResponse;
	}

	@Override
	public boolean addScore(int id, ScoreDto score) {
		Student student=studentRepository.getStudentById(id);
		return student.addscore(score.getExamName(),score.getScore());
	}

}
