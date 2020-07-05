package com.sda.javagdy4.generic_questionnaire;

import com.sda.javagdy4.generic_questionnaire.model.Question;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FileLoader<Question> fileLoader = new FileLoader<>(Question.class);
        Map<Long, Question> questionMap = fileLoader.load();
    }
}
