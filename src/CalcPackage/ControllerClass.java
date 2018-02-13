package CalcPackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControllerClass  implements ActionListener {
 ViewClass v;
private ModelClass m;
String opr;
Double res;

public void addModel(ModelClass m)
{this.m=m;}
public void addView(ViewClass v)
{this.v=v;}
public void initModel(int N1,int N2)
{m.setFN(N1);
m.setSN(N2);}

@Override
public void actionPerformed(ActionEvent event) {
if(event.getSource()==v.add)	
{
	m.setFN(Double.parseDouble(v.CalTextField.getText()));
	opr="add";
	v.CalTextField.setText(v.CalTextField.getText()+" + ");}

else if (event.getSource()==v.subtract)	
{m.setFN(Double.parseDouble(v.CalTextField.getText()));
opr="subtract";
v.CalTextField.setText(v.CalTextField.getText()+" - ");}
else if(event.getSource()==v.multiply)	
{m.setFN(Double.parseDouble(v.CalTextField.getText()));
opr="multiply";
v.CalTextField.setText(v.CalTextField.getText()+" * ");
	}
else if(event.getSource()==v.divide)	
{m.setFN(Double.parseDouble(v.CalTextField.getText()));
opr="divide";
v.CalTextField.setText(v.CalTextField.getText()+" / ");}
else if(event.getSource()==v.mod)	
{m.setFN(Double.parseDouble(v.CalTextField.getText()));
opr="mod";
v.CalTextField.setText(v.CalTextField.getText()+" Mod ");}
else if(event.getSource()==v.sqrt)	
{m.setFN(Double.parseDouble(v.CalTextField.getText()));
opr="sqrt";
v.CalTextField.setText("sqrt ("+v.CalTextField.getText()+") ");}
else if(event.getSource()==v.equal)
{if(!opr.equals("sqrt"))
	{String tokens[]=v.CalTextField.getText().split(" ");
	
	m.setSN(Double.parseDouble(tokens[2]));}

res=m.Cal(opr);
v.CalTextField.setText(res+"");
opr="";	}

}

}



