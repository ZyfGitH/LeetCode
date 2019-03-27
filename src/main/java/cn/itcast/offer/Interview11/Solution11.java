package cn.itcast.offer.Interview11;

import java.math.BigDecimal;

/**
 * Created by Yafei Zhang
 * on 2018-12-12 20:18
 */
public class Solution11 {
    public static double Power(double base, int exponent){
        if (base == 0 && exponent < 0){
            throw new RuntimeException("分母不能为0！");
        }
        if (exponent == 0)
            return 1;
        boolean flag = exponent >0?true:false;
        double result = 0;
        exponent = Math.abs(exponent);
        if (exponent != 0)
            result = base*Power(base,exponent -1);
        return flag?(result):(1/result);
    }

    /**
     * 优化：
     * 上面的代码需要递归exponent次
     * 但可以减少次数
     * 优化点：
     * 1.除以2，用位运算>>1,对2求余：&0x1
     */

    public static double Power2(double base, int exponent){
        int n = exponent;
        if (exponent == 0){
            return 1;
        }else if (exponent < 0){
            if (base == 0){
                throw new RuntimeException("分母不能為0！");
            }
            exponent = -exponent;
        }
        double res = PowerUnsignedExponent(base,exponent);
        return n>0?res:(1/res);
    }

    private static double PowerUnsignedExponent(double base, int n){
        if (n == 0)
            return 1;
        if (n == 1)
            return base;
        double res = PowerUnsignedExponent(base, n >> 1);
        res *= res;
        if ((n & 0x1) == 1){
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Power2(0.2,-2));
    }
}
