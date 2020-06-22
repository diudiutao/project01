package com.Tao.java;

import com.Tao.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author XiaoxuanTao
 * @date 2020/6/22-11:16
 */
public class TempalteTest {
    
    //模板六：prsf
    private static final Customer cust = new Customer();

    //变形
    public static final int Num = 1;
    public static final int num = 1;
    public static final String china ="China";
    public static final int NUMM = 1;

    //自定义模板演示prsc
    /**
     * 客户的名字
     */
    private String name;
    //模板一：psvm
    public static void main(String[] args) {


        //模板二：sout
        System.out.println();
        //变形: soutv soutp soutm
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempalteTest.main");
        System.out.println("args = " + args);

        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeiMei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);

        }

        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(o);
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        System.out.println("TempalteTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //模板五:ifn
        if (list == null) {
            
        }
        
        //变形：inn
        if (list != null) {
            
        }
        
        //变形：xx.nn
        if (list != null) {

        }

        

    }
    public void testMain(){

    }
}

