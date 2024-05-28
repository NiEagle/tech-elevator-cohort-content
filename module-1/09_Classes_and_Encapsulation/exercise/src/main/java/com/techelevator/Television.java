package com.techelevator;

public class Television {
//Class Variables
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;


//Getters
    public boolean isOn() {
        return isOn;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
//methods
    public void turnOff(){
        if(this.isOn){
            this.isOn = false;
        }
    }
    public void turnOn(){
        if(!this.isOn){
            this.isOn = true;
        }
    }
      public void changeChannel(int newChannel){
        if(this.isOn){
            if(newChannel > this.currentChannel){
            this.currentChannel = this.currentChannel + (newChannel - this.currentChannel);
            }
            else if(newChannel < this.currentChannel){
                this.currentChannel = this.currentChannel + (newChannel - this.currentChannel);
            }
            }
      }
    public void channelUp(){
        if(this.isOn) {
            if (this.currentChannel <= 17) {
                this.currentChannel = this.currentChannel + 1;
            }
            else if(this.currentChannel == 18) {
                this.currentChannel = this.currentChannel - 15;
            }
        }
    }

    public void channelDown(){
            if(this.isOn){
                if (this.currentChannel >= 4) {
                this.currentChannel = this.currentChannel - 1;
            }
                else if(this.currentChannel == 3) {
                this.currentChannel = this.currentChannel + 15;
                }
            }
    }
   public void raiseVolume(){
        if(this.isOn){
            if (this.currentVolume <= 9) {
           this.currentVolume = this.currentVolume + 1;
            }
        }

   }
  public void lowerVolume(){
      if(this.isOn){
          if (this.currentVolume >= 1) {
              this.currentVolume = this.currentVolume - 1;
          }
      }
  }




}
