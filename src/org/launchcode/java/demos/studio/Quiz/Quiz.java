package org.launchcode.java.demos.studio.Quiz;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
private int score;
private int total;

        public Quiz(ArrayList<Question> questions) {
            this.questions = questions;
            this.score = 0;
            this.total = 0;
        }

        public void addQuestion(Question question){
            questions.add(question);
        }

        public Quiz(ArrayList<Question> questions) {
            this.questions = questions;
                this.score = 0;
                this.total = 0;
                for (int i = 0; i < questions.size(); i++) {
                    this.total = this.total + questions.get(i).getPointValue();
                }
            }


        public void addQuestion(Question newQuestion){
            this.questions.add(newQuestion);
            this.total = this.total + newQuestion.getPointValue();

        }
    public void runQuiz(){
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).displayQuestion();
            questions.get(i).displayAnswers();
            int pts = questions.get(i).getAnswers();
            updateScore(pts);
        }
    }


}
