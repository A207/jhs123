package com.example.administrator.jisuanqi;

        import android.os.Bundle;
        import android.app.Activity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends Activity {

    private String str = "";
    private EditText et_show;// ��ʾ��
    private int sign = 0, flag = 0;// sign���� ,flag�ݴ�
    private double num1 = 0.0, num2 = 0.0, result = 0.0;//
    private View vi;

    public double calculater() {
        switch (sign) {
            case 0:
                result = num2;
                break; // ����
            case 1:
                result = num1 + num2;
                break;// ��
            case 2:
                result = num1 - num2;
                break;// ��
            case 3:
                result = num1 * num2;
                break;// ��
            case 4:
                result = num1 / num2;
                break;// ��

        }
        num1 = result;
        sign = 0;
        return result;
    }

    // ��������
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ��ð���
        final Button number[] = new Button[10];// ����
        final Button mark[] = new Button[9];// ����
        mark[0] = (Button) findViewById(R.id.jiaBtn);// ��
        mark[1] = (Button) findViewById(R.id.jianBtn);// ��
        mark[2] = (Button) findViewById(R.id.chengBtn);// ��
        mark[3] = (Button) findViewById(R.id.chuBtn);// ��
        mark[4] = (Button) findViewById(R.id.equalBtn);// ����
        mark[5] = (Button) findViewById(R.id.pointBtn);// С����
        mark[6] = (Button) findViewById(R.id.tuiBtn);// ����
        mark[7] = (Button) findViewById(R.id.clearBtn);// ȫ��


        number[0] = (Button) findViewById(R.id.zeroBtn);// 0
        number[1] = (Button) findViewById(R.id.oneBtn);// 1
        number[2] = (Button) findViewById(R.id.twoBtn);// 2
        number[3] = (Button) findViewById(R.id.threeBtn);// 3
        number[4] = (Button) findViewById(R.id.fourBtn);// 4
        number[5] = (Button) findViewById(R.id.fiveBtn);// 5
        number[6] = (Button) findViewById(R.id.sixBtn);// 6
        number[7] = (Button) findViewById(R.id.sevenBtn);// 7
        number[8] = (Button) findViewById(R.id.eightBtn);// 8
        number[9] = (Button) findViewById(R.id.nineBtn);// 9

        et_show = (EditText) findViewById(R.id.output);// ��ʾ��
        et_show.setKeyListener(null);// �����ı�Ϊֻ��
        et_show.setText(str);// ��ֵ

        number[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 0;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    char ch1[];
                    ch1 = str.toCharArray();
                    if (!(ch1.length == 1 && ch1[0] == '0')) {
                        str += 0;
                        et_show.setText(str);
                    }

                }
                vi = v;
            }
        });

        number[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 1;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 1;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 2;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 2;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 3;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 3;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 4;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 4;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 5;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 5;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 6;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 6;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 7;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 7;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 8;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 8;
                    et_show.setText(str);
                }
                vi = v;
            }
        });

        number[9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    str = "";
                    str += 9;
                    et_show.setText(str);
                    flag = 0;
                } else {
                    str += 9;
                    et_show.setText(str);
                }
                vi = v;
            }
        });
        // �趨���ż�
        //��
        mark[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (str != "") {
                    if (vi == mark[0] || vi == mark[1] || vi == mark[2] || vi == mark[3]) {
                        sign = 1;
                    } else {
                        num2 = Double.parseDouble(str);
                        calculater();
                        str = "" + result;
                        et_show.setText(str);
                        sign = 1;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });

        //��
        mark[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (str != "") {
                    if (vi == mark[0] || vi == mark[1] || vi == mark[2] || vi == mark[3]) {
                        sign = 2;
                    } else {
                        num2 = Double.parseDouble(str);
                        calculater();
                        str = "" + result;
                        et_show.setText(str);
                        sign = 2;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });

        //��
        mark[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (str != "") {
                    if (vi == mark[0] || vi == mark[1] || vi == mark[2] || vi == mark[3]) {
                        sign = 3;
                    } else {
                        num2 = Double.parseDouble(str);
                        calculater();
                        str = "" + result;
                        et_show.setText(str);
                        sign = 3;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });

        //��
        mark[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (str != "") {
                    if (vi == mark[0] || vi == mark[1] || vi == mark[2] || vi == mark[3]) {
                        sign = 4;
                    } else {
                        num2 = Double.parseDouble(str);
                        calculater();
                        str = "" + result;
                        et_show.setText(str);
                        sign = 4;
                        flag = 1;
                        vi = v;
                    }
                }
            }
        });

        //�Ⱥ�
        mark[4].setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (str != "" && vi != mark[0] && vi != mark[1] && vi != mark[2] && vi != mark[3]) {
                    num2 = Double.parseDouble(str);
                    calculater();
                    str = "" + result;
                    et_show.setText(str);
                    flag = 1;
                    vi = v;

                }
            }
        });
        // С����
        mark[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (str == "") {
                    str += ".";
                    et_show.setText(str);
                } else {
                    char ch1[];
                    int x = 0;
                    ch1 = str.toCharArray();
                    for (int i = 0; i < ch1.length; i++)
                        if (ch1[i] == '.')
                            x++;
                    if (x == 0) {
                        str += ".";
                        et_show.setText(str);
                    }
                }

            }
        });
        //����
        mark[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str = "";
                et_show.setText(str);
                vi = v;
            }
        });
        //ȫ��
        mark[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = 0.0;
                num2 = 0;
                result = 0.0;
                str = "";
                et_show.setText(str);

            }
        });
    }
}

