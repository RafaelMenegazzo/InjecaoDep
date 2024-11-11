public class HomeTheater {

    protected SistemaDeSom som;
    protected SistemaVideo video;

    public HomeTheater(){
        som = new SistemaDeSom();
        video = new SistemaVideo();
    }

    public void setSom(SistemaDeSom som) {
        this.som = som;
    }

    public SistemaDeSom getSom() {
        return som;
    }

    public void setVideo(SistemaVideo video) {
        this.video = video;
    }

    public SistemaVideo getVideo() {
        return video;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("video= [");
        builder.append(video);
        builder.append("]");

        builder.append("Som = [");
        builder.append(som);
        builder.append("]");

        return builder.toString();

    }
    
}
