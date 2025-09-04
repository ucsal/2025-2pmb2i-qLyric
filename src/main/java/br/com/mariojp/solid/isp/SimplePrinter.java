package br.com.mariojp.solid.isp;

public class SimplePrinter implements Printer, Scanner {
    @Override public void print(String content){ /* imprime */ }
    @Override public void scan(String targetFile){ throw new UnsupportedOperationException("Sem scanner"); }
}
