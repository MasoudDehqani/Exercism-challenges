class SqueakyClean {
    static String clean(String identifier) {
        String f = identifier.replaceAll(" ", "_")
                    .replace("4", "a")
                    .replace("3", "e")
                    .replace("0", "o")
                    .replace("1", "l")
                    .replace("7", "t");
        
        if (identifier.length() > 0) {
            String nextToHyphen = Character.toString(identifier.charAt(identifier.indexOf("-") + 1));
            f = f.replace("-" + nextToHyphen, nextToHyphen.toUpperCase());
        }

        return f.replaceAll("[^a-zA-Z_]", "");
    }
}
