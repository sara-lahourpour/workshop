package com.company;

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem(){
        votingList = new ArrayList<>();
    }

    /**
     * Create a voting by question and the type of voting
     *
     * @param question question of the voting
     * @param type type of the voting
     */
    public void createVoting(String question, int type){
        Voting voting = new Voting(type, question);
        votingList.add(voting);

    }

    /**
     * Vote method
     *
     * @param index index of votingList
     * @param p person that want to vote
     * @param votes votes that person want to vote
     */
    public void vote(int index, Person p, ArrayList<String> votes){
        votingList.get(index).vote(p,votes);
    }

    /**
     * print the question of all voting
     */
    public void printListOfVoting(){
        for (int i = 0; i < votingList.size() ; i++) {
            System.out.println("[" + (i+1) + "]" + votingList.get(i).getQuestion());
        }
    }

    /**
     * print the question and the choices of one voting
     *
     * @param index index of ArrayList Voting
     */
    public void printVoting(int index){
        System.out.println( "Question : " + votingList.get(index).getQuestion());
//        for (int i = 0; i < votingList.get(index).getChoices().keySet().size() ; i++) {
//            System.out.println("Choice " + " : " + votingList.get(index).getChoices().);
//        }
//        int i=1;
//        for ( String iterator : votingList.get(index).getChoices().keySet() ) {
//            System.out.println("Choice " + i + " : " + iterator);
//            i++;
//        }
        votingList.get(index).getChoices().forEach((k,v)->System.out.println("Choice : " + k ));


    }

    public void printResult(int index){
        votingList.get(index).printResult();
    }

}

