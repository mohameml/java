package packages.boids;
import java.awt.Point;

import java.awt.Color;

import gui.GUISimulator;
import gui.Oval;
import gui.Simulable;

public class BoidsSimulator implements Simulable 
{
    /* boids pour la simulation : */
    private Boids boids = new Boids();
    
    /* une interface graphique pour la simulation : */
    private GUISimulator gui ;



    /* un constructuer: */
    public BoidsSimulator(GUISimulator gui )
    {
        // simulation par défaut :
        this.gui = gui ;
        this.gui.setSimulable(this);

        // ajouter des boids :
        for(int i =0 ; i< 100 ; i++)
        {
            this.boids.addBoid(new Boid());

        }
            
        // this.boids.addBoid(new Boid(new Point(50,100) , new Point(2,1)));
        // this.boids.addBoid(new Boid(new Point(100,100) , new Point(0,0)));


        // this.boids.addBoid(new Boid(new Point(200,100) , new Point(0,0)));
        // this.boids.addBoid(new Boid(new Point(200,50) , new Point(0,0)));
        // this.boids.addBoid(new Boid(new Point(200,150) , new Point(0,0)));
        // this.boids.addBoid(new Boid(new Point(250,100) , new Point(0,0)));

        // this.boids.addBoid(new Boid(new Point(50,200) , new Point(0,0)));
        // this.boids.addBoid(new Boid(new Point(50,250) , new Point(0,0)));


        draw();

    }

    /* surcharge du constructuer : */
    public BoidsSimulator(GUISimulator gui , Boids boids )
    {
        this.gui = gui ;
        this.boids = boids ;
    
        this.gui.setSimulable(this);
        draw();
    }   




    @Override 
    public void next()
    {   
        double L = gui.getPanelHeight();
        int l = gui.getPanelWidth();



        gui.reset();

        for(Boid boid : this.boids.getBoids())
        {
            
            boid.upadet(L ,l , this.boids.getBoids());
            
            // on dessine :
            gui.addGraphicalElement
            (
            new Oval((int) boid.getPosition().getPoint().getX(),(int) boid.getPosition().getPoint().getY() , 
            Color.YELLOW, Color.BLACK, 10)
            );
           
        }

    }

    @Override
    public void restart()
    {
        this.boids.reInit();
        draw();
    }


    public void draw()
    {
        gui.reset(); // supprimer tout 
        // pour lr dession du systeme de boids :
        for(Boid boid : boids.getBoids())
        {
            Point point = boid.getPosition().getPoint();

            gui.addGraphicalElement(new Oval( (int)point.getX(), (int)point.getY(), Color.YELLOW, Color.BLACK, 10));


        }
    }
    
}
