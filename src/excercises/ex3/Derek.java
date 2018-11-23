package excercises.ex3;

public class Derek {

    private Tool tool = new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }


    public Boolean canHangPainting() {
        String name = tool.getToolName();
        return name.equals("Hammer");
    }

    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("Yes, i can hang the painting!");
        } else {
            System.out.println("I miss the Hammer so i can't!");
        }

    }
}