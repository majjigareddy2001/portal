package com.exam.service;

import java.util.Set;

import com.exam.modal.Question;
import com.exam.modal.Quiz;


public interface QuestionService {

	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public Set<Question> getQuestions();
	public Question getQuestion(Long questionId);
	public Set<Question> getQuestionOfQuiz(Quiz quiz);
	public void deleteQuestion(long questionId);
	
}
