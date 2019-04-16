package rocks.zipcode.io.objectorientation;

public class Television {

    Integer channel;
    TVChannel tvChannel;
    boolean on = false;

    public boolean turnOn() {
        on = true;
       return on;

    }

    public void setChannel(Integer channel) throws IllegalStateException {
            if(on) {
            tvChannel = TVChannel.getByOrdinal(channel);
            }else {

        throw new IllegalStateException();}



    }

    public TVChannel getChannel() {

        return tvChannel;
    }
}
