import java.io.IOException;

public class ArrayData {
  private String[] schoolName = {};
  private String[] url = {};
  private String[] state = {};
  private String[] bigBoy = {};
  public ArrayData() {} // The instance method needs to do NOTHING.
  /*
    1: schoolName
    2: url
    3: state
    4: bigBoy
  */
  public void changeArray(String data, int variable) throws IOException {
    String[] temp;
    switch (variable) {
      case 1:
        temp = schoolName;
        schoolName = new String[schoolName.length + 1];
        for (int i = 0; i < temp.length; i++) {
          schoolName[i] = temp[i];
        }
        schoolName[schoolName.length - 1] = data;
        break;
      case 2:
        temp = url;
        url = new String[url.length + 1];
        for (int i = 0; i < temp.length; i++) {
          url[i] = temp[i];
        }
        url[schoolName.length - 1] = data;
        break;
      case 3:
        temp = state;
        state = new String[state.length + 1];
        for (int i = 0; i < state.length; i++) {
          state[i] = state[i];
        }
        url[state.length - 1] = data;
        break;
      default:
        throw new IOException("Attempted to write to an unknown array");
    }
  }


  ///*Testing
  public void printArray() {
    for (String i : schoolName) {
      System.out.println(i);
    }
  }
  //*/
}