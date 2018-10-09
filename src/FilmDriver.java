import javax.swing.*;

public class FilmDriver
{
    public static void main(String[] args)
    {
        int numFilm;
        String numFilmAsString = JOptionPane.showInputDialog("How many films do you want to take in?");
        numFilm=Integer.parseInt(numFilmAsString);

        Film catalogue[] = new Film[numFilm];
        //String filmDirector[] = new String[numFilm];
       // String filmDuration[] = new String[numFilm];



        for (numFilm = 0; numFilm < catalogue.length; numFilm++)
        {
            Film newFilm = new Film ();
            newFilm.setTitle(JOptionPane.showInputDialog("Please enter your movie title: "));
            newFilm.setDirector(JOptionPane.showInputDialog("Please enter your movie's director: "));
            newFilm.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Please enter your movie's duration: ")));

            catalogue[numFilm]=newFilm;
            Film.countFilm++;
        }

        for (numFilm = 0; numFilm < catalogue.length; numFilm++)
        {
            JOptionPane.showMessageDialog(null, "Films: " + "\n" + catalogue[numFilm].toString());
        }
        System.exit(0);


    }
   // public void printArrays(String filmTitle[],String filmDirector[], String filmDuration[])
   // {
   //     JOptionPane.showMessageDialog(null,"Film Details: \n" + filmDirector);
   // }
}
//need to pass the info into the array. the array stops when the array length exceeds the number inputted