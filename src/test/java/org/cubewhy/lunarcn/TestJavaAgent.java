package org.cubewhy.lunarcn;

import org.cubewhy.lunarcn.launcher.JavaAgent;

public class TestJavaAgent {
    public static void main(String[] args) {
        JavaAgent agent = new JavaAgent("1 path", "114514");
        System.out.println(agent.getExecArgs());
    }
}
