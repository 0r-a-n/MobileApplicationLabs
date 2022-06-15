package com.example.quizapp;

public class QuestionAnswer {
    public static String question[] ={
            "Which one is not from the Levels of security?",
            "only a limited amount of information about “individual” users can be learned",
            "A system records an incorruptible audit trail of who did each action",
            "if a message within an email is modified in transit, the email has lost",
            "A way to verify user identity (e.g. password)"
    };
    public static String choices[][] ={
            {"Partial access","Emergency access","Flow access","Access/no access"},
            {"Availability","Integrity","Confidentiality","Privacy"},
            {"Access control","Authentication","Authorization","Auditing"},
            {"Availability","Integrity","Confidentiality","Privacy"},
            {"Access control","Authentication","Authorization","Auditing"}
    };
    public static String correctAnswers[] ={
            "Flow access",
            "Privacy",
            "Auditing",
            "Integrity",
            "Authentication"
    };

}
