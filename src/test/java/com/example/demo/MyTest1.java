package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest1 {

    @Test
    void test1(){
        var given = List.of(3,-1,2);
        var result = new ArrayList<Integer>();
        for(var x : given){
            if(x > 0 ){
                result.add(x);
            }
        }
        var actual = result.size();
        Assertions.assertThat(actual).isEqualTo(2);
    }
}
