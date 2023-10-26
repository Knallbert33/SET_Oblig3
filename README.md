# SET_Oblig3
Jeg startet med å opprette et nytt prosjekt i Intellij, og huket av for "add git repository". Dermed kopierte jeg over all koden fra oblig 2 over til det nye prosjektet (oblig 3).
Deretter la jeg til .yml og continuous integration ved hjelp av denne linken: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven. 
Jeg autogenererte .yml filen og workflows-mappen ved å bruke configure Java with Maven i Actions i repositoriet. 
Helt til slutt la jeg til apache plugin i pom.xml, og følgende jobb i .yml filen for at Github actions skal kjøre testene mine: - name: Maven test    run: mvn test

Etter dette ser alt ut til å fungere som forventet :) 
