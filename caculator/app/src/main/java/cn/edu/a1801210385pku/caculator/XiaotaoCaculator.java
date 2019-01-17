package cn.edu.a1801210385pku.caculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class XiaotaoCaculator extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private View.OnClickListener lisenter = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            editText = (EditText)findViewById(R.id.editText1);
            Button btn =(Button)v;
            try{

                switch(btn.getId())
                {
                    case R.id.Button01://1
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        break;
                    }
                    case R.id.ButtonJia://+
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "+";
                        editText.setText("");
                        break;
                    }
                    case R.id.Button02://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        break;
                    }
                    case R.id.ButtonDeng://操作符=
                    {
                        if(opt == "+")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            editText.setText((n1 + n2) + "");
                        }
                        else if(opt == "-")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            editText.setText((n1 - n2) + "");
                        }
                        else if(opt == "*")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            editText.setText((n1 * n2) + "");
                        }
                        else if(opt == "/")
                        {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            if(n2 == 0)
                            {
                                editText.setText("");
                                break;
                            }
                            else
                            {
                                editText.setText((n1 / n2) + "");
                            }
                        }

                        break;
                    }
                    case R.id.Button03://3
                    {
                        editText.setText(editText.getText().toString() + 3);
                        break;
                    }
                    case R.id.Button04://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        break;
                    }
                    case R.id.Button05://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        break;
                    }
                    case R.id.Button06://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        break;
                    }
                    case R.id.Button07://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        break;
                    }
                    case R.id.Button08://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        break;
                    }
                    case R.id.Button09://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        break;
                    }
                    case R.id.Button00://0
                    {
                        editText.setText(editText.getText().toString() + 0);
                        break;
                    }
                    case R.id.ButtonDian://.
                    {
                        String str = editText.getText().toString();
                        if(str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {

                        }
                        else //如果没有小数点
                        {
                            if(str.equals("0"))//如果开始为0，
                                editText.setText(("0" + ".").toString());
                            else if(str.equals(""))//如果初时显示为空，就什么也不做
                            {

                            }
                            else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.ButtonChu://操作符 /
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        break;
                    }
                    case R.id.ButtonCheng://操作符*
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        break;
                    }
                    case R.id.ButtonJian://操作符-
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        break;
                    }
                    case R.id.ButtonFan://+/-
                    {
                        String str =editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(str.length() > 0)
                            editText.setText(-n1 + "");
                        break;
                    }
                    case R.id.ButtonC://CE
                    {
                        String str =editText.getText().toString();
                        if(str.length() > 0)
                            editText.setText("");
                        break;
                    }
                    case R.id.ButtonBaifen:
                    {
                        String str =editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        if(str.length() > 0)
                            editText.setText(n1/100 + "");
                        break;
                    }

                }
            }catch(Exception e){}
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiaotaocaculator);

        btn1 = (Button) findViewById(R.id.Button01);//1
        btn2 = (Button) findViewById(R.id.ButtonJia);//+
        btn3 = (Button) findViewById(R.id.Button02);//2
        btn4 = (Button) findViewById(R.id.ButtonDeng);//=
        btn5 = (Button) findViewById(R.id.Button03);//3
        btn6= (Button) findViewById(R.id.Button04);//4
        btn7 = (Button) findViewById(R.id.Button05);//5
        btn8 = (Button) findViewById(R.id.Button06);//6
        btn9 = (Button) findViewById(R.id.Button07);//7
        btn10 = (Button) findViewById(R.id.Button08);//8
        btn11 = (Button) findViewById(R.id.Button09);//9
        btn12 = (Button) findViewById(R.id.Button00);//0
        btn13 = (Button) findViewById(R.id.ButtonDian);//.
        btn14 = (Button) findViewById(R.id.ButtonChu);// chu
        btn15 = (Button) findViewById(R.id.ButtonCheng);//X
        btn16 = (Button) findViewById(R.id.ButtonJian);//-
        btn17 = (Button) findViewById(R.id.ButtonFan);//(-)
        btn18 = (Button) findViewById(R.id.ButtonC);//c
        btn19 = (Button) findViewById(R.id.ButtonBaifen);// %

        //为按钮添加监听器
        btn1.setOnClickListener(lisenter);
        btn2.setOnClickListener(lisenter);
        btn3.setOnClickListener(lisenter);
        btn4.setOnClickListener(lisenter);
        btn5.setOnClickListener(lisenter);
        btn6.setOnClickListener(lisenter);
        btn7.setOnClickListener(lisenter);
        btn8.setOnClickListener(lisenter);
        btn9.setOnClickListener(lisenter);
        btn10.setOnClickListener(lisenter);
        btn11.setOnClickListener(lisenter);
        btn12.setOnClickListener(lisenter);
        btn13.setOnClickListener(lisenter);
        btn14.setOnClickListener(lisenter);
        btn15.setOnClickListener(lisenter);
        btn16.setOnClickListener(lisenter);
        btn17.setOnClickListener(lisenter);
        btn18.setOnClickListener(lisenter);
        btn19.setOnClickListener(lisenter);
    }

}