package br.org.bytespace.hello.groovy

class Developer {
    
    String firstName
    String lastName
    String email
    String github
    
    List<String> languages = []
    
    Developer(String firstName, String lastName, String email, String github, List<String> languages) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
        this.github = github
        this.languages = languages
    }
    
}