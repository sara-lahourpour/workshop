package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {

    //if 0 , single vote
    //if 1 , multiple votes
    private int type;
    private String question;

    private ArrayList<Person> voters;

    //keys are the choices
    //values are : date , Person(firstName , lastName)
    private HashMap<String, HashSet<Vote>> choices;

    public Voting(int type, String question){
        this.type=type;
        this.question=question;
        voters =new ArrayList<>();
        choices = new HashMap<>();
    }

    public Voting(){
        voters =new ArrayList<>();
        choices = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * Create another choice for voting
     *
     * @param choice choice to be added to voting
     */
    public void createChoice(String choice){

    }

    /**
     * Store the votes
     *
     * @param p person which vote
     * @param votes choice(or choices) that person have voted for one voting
     */
    public void vote(Person p, ArrayList<String> votes){
        //if false , there is no such person in our voters list
        //if true , person have already voted
        boolean check=false;
        for (int i = 0; i < voters.size() ; i++) {
            if (voters.get(i).equals(p)){
                check =true;
                break;
            }
        }
        if ( check)
            System.out.println("Have already voted!");
        else {
            voters.add(p);

        }
    }

    /**
     * Print the result of voting
     *
     */
    public void printResult(){
        String choice = "";
        int numOfVotes =0;
        for (HashMap.Entry<String,HashSet<Vote>> entry : choices.entrySet() ) {
            if ( numOfVotes < entry.getValue().size() ){
                numOfVotes = entry.getValue().size();
                choice = entry.getKey();
            }
        }

        System.out.println("Choice : " + choice);
        System.out.println("has the highest votes : " + numOfVotes + " votes");
    }

}
