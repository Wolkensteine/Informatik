# Eclipse und Git
Eclipse hat einen eingebauten GitManager. Dieser implementiert die Funktionen des Git-Command-Line-Tool direkt in der popul�ren open source Java IDE. Ich m�chte euch hier einmal erkl�ren, wie man Git mit Eclipse nutzen kann.<br><br>
Zun�chst m�sst ihr einen Access key f�r euren GitHub Account einrichten. Diesen ben�tigt ihr zur Authentifizierung von Eclipse.<br><br>
i: Ich habe Github und meinen Browser auf Englisch eingestellt.<br>
 1. �ffnet [github.com](https://github.com)<br>
 2. Klickt oben rechts auf euer Profil Icon.<br>
 3. W�hle Settings/Einstellungen<br>
 4. Gehe auf den letzten Punkt (Developer Settings)<br>
 5. Gehe hier auf den untersten Reiter (Personal access tokens)<br>
 6. W�hle "Tokens (Classic)"<br>
 7. W�hle die Option "Generate new token" aus.<br>
 8. Dort w�hlst du die classische Token Version.<br>
 9. Best�tige nun dein Passwort<br>
 10. Gebe einen Namen f�r den Token unter "Note" ein.<br>
 11. Setze nun ein Ablaufsdatum. Ich empfehle es auf 30 Tagen zu belassen, wenn man viel mit seinem Account macht. <br>
 12. Wenn du dir nicht sicher bist, was f�r Rechte du sp�ter vielleicht benutzen wirst w�hle alles aus. Ansonsten w�hle am besten nur das, was du ben�tigst.<br>
 13. Dr�cke "Generate token"<br>
 14. Lasse den Tab ge�ffnet und starte Eclipse.<br>
 15. Wenn Eclipse gestartet wurde gehe oben Links auf den Tab "Window".<br>
 16. W�hle "Show view"<br>
 17. Dr�cke auf "Other..."<br>
 18. W�hle unter dem Punkt Git "Git repositories" und "Git Staging".<br>
 19. Links unten siehst du nun einen Bereich "Git repositories".<br>
 20. Dort kannst du die Option "clone git repository" w�hlen, um ein bestehendes Repository auf GitHub zu clonen. Sp�ter kannst du das selbe mit einem Rechtsklick und der gleichnamigen untermenu Wahl erreichen.<br>
 21. Kopiere den .git Link, den du bei einem Repositorie unter dem Punkt "Code" kopieren kannst. <br>
 22. Diesen f�gst du in Eclipse in das Fach "URI" ein.<br>
 23. Nun gibst du deinen Nutzernamen (unter Username) und den vorher generierten Schl�ssel (unter Password) an.<br>
 24. Dr�cke "next".<br>
 25. Dr�cke "next".<br>
 26. Dr�cke Finish.<br>
 27. Jetzt siehst du dein Repository unten links in Eclipse. Mache einen Rechtsklick.<br>
 28. W�hle import projects, um das Repository als Java Projekt zu importieren.<br>
 29. W�hle "fetch from main" um deine Lokale Kopie des Repositories zu updaten.<br>
 30. Nun kannst du beginnen Dinge zu bearbeiten. Unter git Staging kannst du �nderungen commiten und pushen.<br><br><br>
 
## Du willst ein bereits bestehendes Projekt auf GitHub hochladen?
 1. Zun�chst erstelle ein lehres Repository in der GitHub WebUI.
 2. Dort l�dst du dein bestehendes Projekt hoch.
     1. Mache einen Rechtsklick auf dein lokales Projekt.
     2. W�hle "Properties"
     3. Dort findest du den Ort, wo das Projekt gespeichert ist. �ffne diesen Ort im File-Explorer.
     4. Drag and drop den Inhalt des Projektordners (Du musst diesen zun�chst betreten) in dein GitHub Repository.
     5. Commite die Dateien.
     6. Update deine Kopie des GitHub Repositories.
 3. Importiere nun wie oben beschrieben dein neues Repository.
 