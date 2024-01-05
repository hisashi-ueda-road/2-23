package language;

import person.Person;

public class Language extends Person{

    public Language(String name, String language) {
        super(name, language);
    }
    
    public void studyLanguage() {
        System.out.println( getName() + "は、" + getLanguage() + "を学んでいます。");
    }
}