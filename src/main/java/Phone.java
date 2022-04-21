public class Phone {

    private String model;
    private String colour;
    private int series;
    private boolean camera;

    public Phone(String model, String colour, int series){
        this.model = model;
        this.colour = colour;
        this.series = series;
    }

    public Phone(String model, String colour, int series, boolean camera){
        this.model = model;
        this.colour = colour;
        this.series = series;
        this.camera = camera;

    }

    public String getModel(){
        return model;
    }

    public int getSeries(){
        return series;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setSeries(int series){
        this.series = series;
    }

}
