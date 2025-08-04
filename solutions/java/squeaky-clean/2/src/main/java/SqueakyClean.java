class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.length() == 0) return "";

        char nextToHyphenChar = identifier.charAt(identifier.indexOf("-") + 1);
        String nextToHyphenStr = Character.toString(nextToHyphenChar);
        
        return 
            identifier.replaceAll(" ", "_")
                .replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t")
                .replace("-" + nextToHyphenStr, nextToHyphenStr.toUpperCase())     
                .replaceAll("[^a-zA-Z_]", "");
    }
}
