public class AppData {

    private String[] headers;
    private int[][] data;

    public AppData() {
        this.headers = new String[]{"Value1", "Value2", "Value3"};
        this.data = new int[3][3];
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void fillData(int add) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = add;
            }

        }
    }
}
