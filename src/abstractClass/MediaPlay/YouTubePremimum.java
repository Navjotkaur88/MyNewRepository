package abstractClass.MediaPlay;

public class YouTubePremimum extends YouTube implements AudioMediaPlayer, VideoMediaPlayer {
    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public boolean screenOffAllowed() {
        return super.screenOffAllowed();
    }

    @Override
    public boolean chatAllowed() {
        return super.chatAllowed();
    }

    @Override
    public boolean subscribersAllowed() {
        System.out.println("Something which is not allowed in premium");
        return false;
    }
}
