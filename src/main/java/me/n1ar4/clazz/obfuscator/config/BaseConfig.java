package me.n1ar4.clazz.obfuscator.config;

import me.n1ar4.clazz.obfuscator.utils.ColorUtil;

import java.util.Arrays;

public class BaseConfig {
    private String logLevel;

    private boolean enableFieldName;
    private boolean enableMethodName;
    private boolean enableParamName;
    private boolean enableAdvanceString;
    private String advanceStringName;

    private boolean enableHideMethod;
    private boolean enableHideField;

    private boolean enableXOR;
    private boolean enableAES;
    private boolean enableJunk;
    private boolean enableDeleteCompileInfo;

    private int junkLevel;
    private int maxJunkOneClass;

    private String aesKey;
    private String aesDecName;
    private String[] obfuscateChars;
    private String[] methodBlackList;

    public static BaseConfig Default() {
        BaseConfig config = new BaseConfig();
        config.setLogLevel("info");
        // 默认不开隐藏
        config.setEnableHideField(false);
        config.setEnableHideMethod(false);
        // 默认开启所有混淆
        config.setEnableAdvanceString(true);
        config.setEnableFieldName(true);
        config.setEnableXOR(true);
        config.setEnableAES(true);
        config.setAesKey("OBF_DEFAULT_KEYS");
        config.setAesDecName("iiLLiLi");
        config.setEnableDeleteCompileInfo(true);
        config.setEnableParamName(true);
        config.setEnableMethodName(true);
        // 默认花指令配置
        config.setEnableJunk(true);
        config.setJunkLevel(3);
        config.setMaxJunkOneClass(1000);
        // 默认额外配置
        config.setObfuscateChars(new String[]{"i", "l", "L", "1", "I"});
        config.setAdvanceStringName("iii");
        config.setMethodBlackList(new String[]{"main"});
        return config;
    }

    public void show() {
        System.out.println(ColorUtil.purple("[GLOBAL] Log Level -> ") +
                ColorUtil.green(logLevel));
        System.out.println(ColorUtil.purple("[GLOBAL] Obfuscate Chars -> ") +
                ColorUtil.green(Arrays.toString(obfuscateChars)));
        System.out.println(ColorUtil.purple("[GLOBAL] Method Blacklist -> ") +
                ColorUtil.green(Arrays.toString(methodBlackList)));
        System.out.println(ColorUtil.yellow("Enable Delete Compile Info Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableDeleteCompileInfo)));
        System.out.println(ColorUtil.yellow("Enable Field Name Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableFieldName)));
        System.out.println(ColorUtil.yellow("Enable Method Name Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableMethodName)));
        System.out.println(ColorUtil.yellow("Enable Param Name Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableParamName)));
        System.out.println(ColorUtil.yellow("Enable Hide Method Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableHideMethod)));
        System.out.println(ColorUtil.yellow("Enable Hide Field Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableHideField)));
        System.out.println(ColorUtil.yellow("Enable XOR Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableXOR)));
        System.out.println(ColorUtil.yellow("Enable String AES Encrypt -> ") +
                ColorUtil.green(String.valueOf(enableAES)));
        System.out.println(ColorUtil.yellow("AES Decrypt KEY-> ") +
                ColorUtil.green(String.valueOf(aesKey)));
        System.out.println(ColorUtil.yellow("AES Decrypt Method-> ") +
                ColorUtil.green(String.valueOf(aesDecName)));
        System.out.println(ColorUtil.yellow("Enable Advance String Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableAdvanceString)));
        System.out.println(ColorUtil.cyan("[Advance String] Global List Name -> ") +
                ColorUtil.green(String.valueOf(advanceStringName)));
        System.out.println(ColorUtil.yellow("Enable Junk Obfuscate -> ") +
                ColorUtil.green(String.valueOf(enableJunk)));
        System.out.println(ColorUtil.cyan("[Junk Obfuscate] Junk Obfuscate Level -> ") +
                ColorUtil.green(String.valueOf(junkLevel)));
        System.out.println(ColorUtil.cyan("[Junk Obfuscate] Max Number in One Class -> ") +
                ColorUtil.green(String.valueOf(maxJunkOneClass)));
    }

    public String getAesDecName() {
        return aesDecName;
    }

    public void setAesDecName(String aesDecName) {
        this.aesDecName = aesDecName;
    }

    public String getAesKey() {
        return aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public boolean isEnableAES() {
        return enableAES;
    }

    public void setEnableAES(boolean enableAES) {
        this.enableAES = enableAES;
    }

    public boolean isEnableHideField() {
        return enableHideField;
    }

    public void setEnableHideField(boolean enableHideField) {
        this.enableHideField = enableHideField;
    }

    public boolean isEnableHideMethod() {
        return enableHideMethod;
    }

    public void setEnableHideMethod(boolean enableHideMethod) {
        this.enableHideMethod = enableHideMethod;
    }

    public String[] getMethodBlackList() {
        return methodBlackList != null ? methodBlackList : new String[0];
    }

    public void setMethodBlackList(String[] methodBlackList) {
        this.methodBlackList = methodBlackList;
    }

    public String getAdvanceStringName() {
        return advanceStringName;
    }

    public void setAdvanceStringName(String advanceStringName) {
        this.advanceStringName = advanceStringName;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public boolean isEnableFieldName() {
        return enableFieldName;
    }

    public void setEnableFieldName(boolean enableFieldName) {
        this.enableFieldName = enableFieldName;
    }

    public boolean isEnableMethodName() {
        return enableMethodName;
    }

    public void setEnableMethodName(boolean enableMethodName) {
        this.enableMethodName = enableMethodName;
    }

    public boolean isEnableParamName() {
        return enableParamName;
    }

    public void setEnableParamName(boolean enableParamName) {
        this.enableParamName = enableParamName;
    }

    public boolean isEnableAdvanceString() {
        return enableAdvanceString;
    }

    public void setEnableAdvanceString(boolean enableAdvanceString) {
        this.enableAdvanceString = enableAdvanceString;
    }

    public boolean isEnableXOR() {
        return enableXOR;
    }

    public void setEnableXOR(boolean enableXOR) {
        this.enableXOR = enableXOR;
    }

    public boolean isEnableJunk() {
        return enableJunk;
    }

    public void setEnableJunk(boolean enableJunk) {
        this.enableJunk = enableJunk;
    }

    public boolean isEnableDeleteCompileInfo() {
        return enableDeleteCompileInfo;
    }

    public void setEnableDeleteCompileInfo(boolean enableDeleteCompileInfo) {
        this.enableDeleteCompileInfo = enableDeleteCompileInfo;
    }

    public int getJunkLevel() {
        return junkLevel;
    }

    public void setJunkLevel(int junkLevel) {
        this.junkLevel = junkLevel;
    }

    public int getMaxJunkOneClass() {
        return maxJunkOneClass;
    }

    public void setMaxJunkOneClass(int maxJunkOneClass) {
        this.maxJunkOneClass = maxJunkOneClass;
    }

    public String[] getObfuscateChars() {
        return obfuscateChars != null ? obfuscateChars : new String[0];
    }

    public void setObfuscateChars(String[] obfuscateChars) {
        this.obfuscateChars = obfuscateChars;
    }
}
