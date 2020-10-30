package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person sara = new Person("Sara","Lahourpour");
        Person nastaran = new Person("Nastaran","Tabak");
        Person nooshin = new Person("Nooshin","Ghotbi");
        Person saghar = new Person("Saghar","Kashani");
        Person khatere = new Person("Khatere","Yaghmoori");



        Vote vote = new Vote(sara,"10/28/2020");
        Vote vote1 = new Vote(nastaran,"10/27/2020");
        Vote vote2 = new Vote(nooshin,"10/27/2020");
        Vote vote3 = new Vote(saghar,"10/26/2020");
        Vote vote4 = new Vote(khatere,"10/28/2020");



        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("Which day you would like to set the exam?",1);
        Voting voting = new Voting();
        voting.createChoice("29 October");
        voting.createChoice("31 October");

//        votingSystem.createVoting("How hard was the exam?",);


        ArrayList<String> votes = new ArrayList<>();
        votes.add("29 October");
        votingSystem.vote(0,sara,votes);

//        ArrayList<String> votes1 = new ArrayList<>();
//        votes1.add("29 October");
//        votingSystem.vote(0,nastaran,votes1);
//
//        ArrayList<String> votes2 = new ArrayList<>();
//        votes2.add("31 October");
//        votingSystem.vote(0,nooshin,votes2);
//
//        ArrayList<String> votes3 = new ArrayList<>();
//        votes3.add("29 October");
//        votingSystem.vote(0,saghar,votes3);
//
//        ArrayList<String> votes4 = new ArrayList<>();
//        votes4.add("29 October");
//        votingSystem.vote(0,khatere,votes4);

        votingSystem.printListOfVoting();
        votingSystem.printVoting(0);
        votingSystem.printResult(0);
    }
}
