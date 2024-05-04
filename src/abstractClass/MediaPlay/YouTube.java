package abstractClass.MediaPlay;

public class YouTube implements VideoMediaPlayer, AudioMediaPlayer
{
    @Override
    public void play() {
    System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void resume() {
        System.out.println("Resume");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
    @Override
    public boolean screenOffAllowed() {

        return false;
    }

    @Override
    public boolean chatAllowed() {

        return false;
    }
    public boolean subscribersAllowed(){
            return true;
        }
    }

