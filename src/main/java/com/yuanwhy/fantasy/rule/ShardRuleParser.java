package com.yuanwhy.fantasy.rule;

/**
 * Created by yuanwhy on 17/3/11.
 */
public class ShardRuleParser {

    public static String parserTbIndex(int userId) {
        return String.valueOf(userId % 10);
    }


}
