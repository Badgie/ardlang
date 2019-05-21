package util;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class SourceContext {
    private int lineNumber;
    private int lineIndex;
    private String ctx;

    public SourceContext(String ctx, List<String> source) {
        this.lineNumber = getLineNumber(source, ctx);
        this.lineIndex = getLineIndex(source, ctx);
        this.ctx = ctx;
    }

    private int getLineNumber(List<String> source, String ctx) {
        int lineNumber = 0;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i).contains(ctx)) {
                lineNumber = i;
                break;
            }
        }
        return lineNumber;
    }

    private int getLineIndex(List<String> source, String ctx) {
        int lineIndex = 0;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i).contains(ctx)) {
                lineIndex = source.get(i).indexOf(ctx);
            }
        }
        return lineIndex;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getLineIndex() {
        return lineIndex;
    }

    public String getCtx() {
        return ctx;
    }
}
