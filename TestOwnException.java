class OwnException extends Exception {
    OwnException(String s) {
        // super(s);
        System.out.println(s + "t");
    }

}

class TestOwnException {
    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18)
                throw new OwnException("OwnException thrown");
        } catch (OwnException e) {
            System.out.println("fghdfgh");
        }
    }
}
