# Eclipse und Git
Eclipse hat einen eingebauten GitManager. Dieser implementiert die Funktionen des Git-Command-Line-Tool direkt in der populären open source Java IDE. Ich möchte euch hier einmal erklären, wie man Git mit Eclipse nutzen kann.<br><br>
Zunächst müsst ihr einen Access key für euren GitHub Account einrichten. Diesen benötigt ihr zur Authentifizierung von Eclipse.<br><br>
i: Ich habe Github und meinen Browser auf Englisch eingestellt.<br>
 1. Öffnet [github.com](https://github.com)<br>
 2. Klickt oben rechts auf euer Profil Icon.<br>
 3. Wähle Settings/Einstellungen<br>
 4. Gehe auf den letzten Punkt (Developer Settings)<br>
 5. Gehe hier auf den untersten Reiter (Personal access tokens)<br>
 6. Wähle "Tokens (Classic)"<br>
 7. Wähle die Option "Generate new token" aus.<br>
 8. Dort wählst du die classische Token Version.<br>
 9. Bestätige nun dein Passwort<br>
 10. Gebe einen Namen für den Token unter "Note" ein.<br>
 11. Setze nun ein Ablaufsdatum. Ich empfehle es auf 30 Tagen zu belassen, wenn man viel mit seinem Account macht. <br>
 12. Wenn du dir nicht sicher bist, was für Rechte du später vielleicht benutzen wirst wähle alles aus. Ansonsten wähle am besten nur das, was du benötigst.<br>
 13. Drücke "Generate token"<br>
 14. Lasse den Tab geöffnet und starte Eclipse.<br>
 15. Wenn Eclipse gestartet wurde gehe oben Links auf den Tab "Window".<br>
 16. Wähle "Show view"<br>
 17. Drücke auf "Other..."<br>
 18. Wähle unter dem Punkt Git "Git repositories" und "Git Staging".<br>
 19. Links unten siehst du nun einen Bereich "Git repositories".<br>
 20. Dort kannst du die Option "clone git repository" wählen, um ein bestehendes Repository auf GitHub zu clonen. Später kannst du das selbe mit einem Rechtsklick und der gleichnamigen untermenu Wahl erreichen.<br>
 21. Kopiere den .git Link, den du bei einem Repositorie unter dem Punkt "Code" kopieren kannst. <br>
 22. Diesen fügst du in Eclipse in das Fach "URI" ein.<br>
 23. Nun gibst du deinen Nutzernamen (unter Username) und den vorher generierten Schlüssel (unter Password) an.<br>
 24. Drücke "next".<br>
 25. Drücke "next".<br>
 26. Drücke Finish.<br>
 27. Jetzt siehst du dein Repository unten links in Eclipse. Mache einen Rechtsklick.<br>
 28. Wähle import projects, um das Repository als Java Projekt zu importieren.<br>
 29. Wähle "fetch from main" um deine Lokale Kopie des Repositories zu updaten.<br>
 30. Nun kannst du beginnen Dinge zu bearbeiten. Unter git Staging kannst du Änderungen commiten und pushen.<br><br><br>
 
## Du willst ein bereits bestehendes Projekt auf GitHub hochladen?
 1. Zunächst erstelle ein lehres Repository in der GitHub WebUI.
 2. Dort lädst du dein bestehendes Projekt hoch.
     1. Mache einen Rechtsklick auf dein lokales Projekt.
     2. Wähle "Properties"
     3. Dort findest du den Ort, wo das Projekt gespeichert ist. Öffne diesen Ort im File-Explorer.
     4. Drag and drop den Inhalt des Projektordners (Du musst diesen zunächst betreten) in dein GitHub Repository.
     5. Commite die Dateien.
     6. Update deine Kopie des GitHub Repositories.
 3. Importiere nun wie oben beschrieben dein neues Repository.
 