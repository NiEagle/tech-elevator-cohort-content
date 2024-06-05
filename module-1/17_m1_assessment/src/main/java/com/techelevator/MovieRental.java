package com.techelevator;

public class MovieRental {
    //CLASS VARIABLES
    /*
    title: indicates the title of the movie.
format: indicates the format of the movie (VHS, DVD, or Blu-ray).
is premium movie: indicates if the movie is a premium movie. Premium movies cost more.
rental price: indicates the rental price (VHS $0.99, DVD $1.99, BluRay $2.99). Premium movies add an additional $1.00 to the rental price. (Hint: What could you call from outside of the object to return the appropriate rental price? How could you derive the appropriate price?)
     */
    private String titleOfMovie;
    private String formatOfMovie;
    private boolean isMoviePremium;
    private double priceOfMovie;
//CONSTRUCTOR
    public MovieRental(String titleOfMovie,String formatOfMovie, boolean isMoviePremium) {
    this.titleOfMovie = titleOfMovie;
    this.formatOfMovie = formatOfMovie;
    this.isMoviePremium = isMoviePremium;

    }


//METHOD
        public String toString(){

           return "MOVIE: {" + getTitleOfMovie() + "} - FORMAT: {" + getFormatOfMovie() + "} PRICE: {" + getPriceOfMovie() + "}";

        }

    public String getTitleOfMovie() {
        return titleOfMovie;
    }

    public String getFormatOfMovie() {
        return formatOfMovie;
    }

    public boolean isMoviePremium() {
        return isMoviePremium;
    }

    public double getPriceOfMovie() {
        double premiumFee = 1.00;
        if (isMoviePremium) {


            if (formatOfMovie == "VHS") {
                return 0.99 + premiumFee ;
            } else if (formatOfMovie == "DVD") {
               return  1.99 + premiumFee;
            } else if (formatOfMovie == "Blu-ray") {
                return 2.99 + premiumFee;
            }

        }
        if (formatOfMovie == "VHS") {
            return 0.99;
        } else if (formatOfMovie == "DVD") {
            return 1.99;
        } else if (formatOfMovie == "Blu-ray") {
            return 2.99;
        }
    return priceOfMovie;
    }
    }



