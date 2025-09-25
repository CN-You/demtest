package org.example;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

public class QLRunner {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("立马",1);
        context.put("回头",2);
        context.put("杭州",3);
        String express = "立马+回头*杭州-1";
        Object r = runner.execute(express, context, null, true, false);
        System.out.println(r);
    }
}
