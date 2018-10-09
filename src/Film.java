public class Film
{
    private String title;
    private String director;
    private int duration;
    public static int countFilm;

    //accessor methods


    public int getCountFilm()
    {
        return countFilm;
    }

    public String getTitle()
    {
        return title;
    }

    public int getDuration()
    {
        return duration;
    }

    public String getDirector()
    {
        return director;
    }
    //mutator methods


    public void setDirector(String director)
    {
        this.director = director;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    //no argument constructor

    public Film()
    {
        this.director="unknown";
        this.duration=0;
        this.title="unknown";
    }

    //three argument constructor

    public Film (String director, int duration, String title)
    {
        this.title=title;
        this.duration=duration;
        this.director=director;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDirector: " + director + "\nDuration: " + duration + " minutes long" +  "\nNumber of movies entered: " + getCountFilm();
    }


}
