package task9;

public class Ball {

    private final String color;
    private final int weight;

    public Ball(){
        weight = (int)(Math.random() * (1000 - 100 + 1) + 100);
        String[] colors = new String[]{"red", "green", "blue", "yellow", "white"};
        color = colors[(int) Math.floor(Math.random() * colors.length)];
    }

    public Ball(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('{').append(color).append(", ").append(weight).append('}');
        return sb.toString();
    }

    public boolean equals(Ball o){
        boolean result = this.getWeight() == o.getWeight() && this.getColor().equals(o.getColor());
        return result;
    }

    public int getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }

}
