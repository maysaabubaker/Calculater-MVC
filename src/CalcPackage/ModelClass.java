package CalcPackage;
import javax.swing.JOptionPane;

public class ModelClass {
private double firstNumber;
private double secondNumber;
private double Result;
ControllerClass controller=new ControllerClass();
public void setFN(double FN) {
	
	firstNumber=FN;
}
public void setSN(double SN)
{	secondNumber=SN;
}

public double Cal(String Operation)
{
	switch(Operation)
	{case "add":
		Result=firstNumber+secondNumber;
		break;
	case "subtract":
		Result=firstNumber-secondNumber;
		break;
	case "multiply":
		Result=firstNumber*secondNumber;
		break;
	case "divide":
		if(secondNumber==0)
			{
			throw new IllegalArgumentException();}
		else
		{Result=firstNumber/secondNumber;
		break;
		}
		
		
	case "mod":
		Result=firstNumber%secondNumber;
		break;
	case "sqrt":
		if(firstNumber<0)
			{
			throw new ArithmeticException();
			}
		else
			{Result=Math.sqrt(firstNumber);
		break;}
	default:
		JOptionPane.showMessageDialog(null,"You don't enterd an operation");
		break;
	}
		return Result;}
}

