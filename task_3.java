import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;  
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		{18, true},
        {19, true},
        {21, true},
        {17, false},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", result, isAdult);
	}
}
