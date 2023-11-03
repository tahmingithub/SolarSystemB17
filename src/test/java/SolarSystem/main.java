package SolarSystem;

import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main (String[] args){
        solarSystemBasics solarsys=new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

       // *****FeatureSun****

        FeatureSun sun= new FeatureSun();
        sun.name="panther";
        sun.color="black";
        sun.temp="1234555";


        // Planet 2

        Planet2 xaros= new Planet2();
        xaros.name="nehe";
        xaros.color="blue";

        //  planet1

        Planet1 plato=new Planet1();
        plato.color="green";
        plato.name="abbaa";
        plato.temp="10000";
        plato.radius="8900";
        




    }
}
