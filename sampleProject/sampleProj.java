package sampleProject;

public class sampleProj {

    public static String IMPORTANT_MESSAGE;

    private static class User {
        private static String FILLER_NAME = "John";
        private static String FILLER_SURNAME = "Doe";
        private String name;
        private String surname;

        public User() {
            this( FILLER_NAME, FILLER_SURNAME );
        }

        public User( String name ) {
            this( name, FILLER_SURNAME );
        }

        public User( String name, String surname ) {
            this.setName( name );
            this.setSurname( surname );
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setName( String name ) 
        {
            //Auto capitalizes the first letter of the name
            char outChar = name.charAt( 0 );
            int firstLetter = (int)outChar;
            
            if (( firstLetter >= 97 ) && ( firstLetter <= 122 )) {
                outChar = (char)( firstLetter - 32 );
            }
            this.name = outChar + name.substring( 1 );
        }

        @Override
        public String toString() {
            return String.format( "Name: %s\nSurname: %s", this.name, this.surname );
        }
    }

    public static void main(String[] args) {
        final String[] arrNames = new String[] { "Jaco", "Jane", "Jermy", "Jaden", "Julian", "Justin", "Jordan", "Jorge", "Johan", "Jaco", "Jan", "John" };
        int index = 0;
        User[] arrUsers = new User[arrNames.length];
        for ( String nameElm: arrNames) {
            arrUsers[index] = new User( nameElm );
            index++;
        }
        printUserArray(arrUsers);
    }

    public static void printGlobal() {
        System.out.println( IMPORTANT_MESSAGE );
    }

    public static void printUserArray( User... arrUsers){
        StringBuilder out = new StringBuilder( "{" );
        for ( User user : arrUsers ){
            out.append( user.toString() + ",\n");
        }
        out.append( "}" );
        System.out.println(out);
    }
}