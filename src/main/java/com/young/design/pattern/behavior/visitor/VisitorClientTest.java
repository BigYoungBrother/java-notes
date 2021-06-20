package com.young.design.pattern.behavior.visitor;

/**
 * 访问者模式测试
 *
 * @author Young
 * @Date 2021-06-20 20:07
 */
public class VisitorClientTest {
    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
