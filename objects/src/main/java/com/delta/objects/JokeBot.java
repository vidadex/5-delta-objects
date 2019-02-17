package com.delta.objects;

import java.util.ArrayList;

public class JokeBot extends Bot {
    public static ArrayList<Joke> jokesIKnow = null;

    public JokeBot(ArrayList<Joke> jokesIKnow) {
        this.jokesIKnow = jokesIKnow;
    }

    public void tellJoke(){
        Double randomNumDouble = new Double(Math.random());
        int randomNum = randomNumDouble.intValue();
        Joke myJoke = jokesIKnow.get(randomNum);
        sayJoke(myJoke);
    }

    protected void sayJoke(Joke aJoke){
        talk(aJoke.getJokeSetup());
        talk(aJoke.getJokePunchline());
    }

}
