package com.delta.objects;

public class ComedianBot extends JokeBot {

    public ComedianBot(String aName){
        super(null);
        setName(aName);
        jokesIKnow = JokeWriter.getJokeListTwo();
    }

    public void performShow(){
        talk("Good evening everyone, my name is " + getName());
        talk("Why dont I tell you some of my favorite jokes?");

        for (Joke oneJoke : jokesIKnow){
            sayJoke(oneJoke);
        }

        talk("Thanks everyone, Goodnight!");
    }

    @Override
    protected void sayJoke(Joke aJoke) {
        talk(aJoke.getJokeSetup() + ",,," + aJoke.getJokePunchline());
    }
}
