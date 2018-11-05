public class Entity {

    private int row;
    private int col;
    private String character;

    public Entity(int row, int col, String character){
        this.col = col;
        this.row = row;
        this.character = character;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
