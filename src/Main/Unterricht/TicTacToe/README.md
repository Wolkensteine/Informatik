# Tic Tac Toe
Wir wollen ein Java Tic-Tac-Toe-Spiel programmieren, welches einen Online Modus ueber Firebase, einen lokalen Modus Über das Local Area Network (LAN) und einen Offline-Modus mit einer Tic-Tac-Toe-KI beinhaltet. Dabei wollen wir auf ein nutzerfreundliches Layout und nette Grafiken achten. <br>
Einen Chat fuer den Online- und lokalen Modus und ein Ranking System für jeden, der seine Spiele veroeffentlicht (nur im Online-Modus verfuegbar). <br>
(Die Datenspeicherung wird mit Hilfe von Firebase vonstattengehen. - scrubbed hendrik didn't get it to work) <br>
Wir wollen auch mehrere Versionen von Tic-Tac-Toe einbauen. <br>

## Dokumentation des Arbeitens

<table>
  <thead>
    <tr>
      <th>Datum</th>
      <th>Person</th>
      <th>Aktion</th>
    </tr>
  </thead>
  <tbody>
  	<tr>
      <td>vor 28.9.2022</td>
      <td>Jakob</td>
      <td>Generelle Einrichtung des Projektes</td>
    </tr>
    <tr>
      <td>29+30.9.2022</td>
      <td>Jakob</td>
      <td>Kleine Aenderungen und das Einrichten eines Maven projects, so dass Hendrik Bibliotheken einbinden kann</td>
    </tr>
    <tr>
      <td>1.10.2022</td>
      <td>Jakob</td>
      <td>Kleine Aenderungen am Logger und den READMEs sowie einzelne Tests</td>
    </tr>
    <tr>
      <td>9.10.2022</td>
      <td>Jakob</td>
      <td>Erstellung Game Class</td>
    </tr>
    <tr>
      <td>12.10.2022</td>
      <td>Jakob</td>
      <td>Weiterarbeiten an game class</td>
    </tr>
    <tr>
      <td>12.10.2022</td>
      <td>Hendrik</td>
      <td>Arbeit mit dependencies</td>
    </tr>
    <tr>
      <td>13.10.2022</td>
      <td>!Achtung!</td>
      <td>Staging errors auf Hendriks Laptop und dem SchulPC geplantes debugging am 13.10.2022</td>
    </tr>
    <tr>
      <td>05.11.2022</td>
      <td>Jakob</td>
      <td>Settings & Assets</td>
    </tr>
    <tr>
      <td>09.11.2022</td>
      <td>Jakob</td>
      <td>Fixing bugs</td>
    </tr>
    <tr>
      <td>09.11.2022</td>
      <td>Hendrik</td>
      <td>More firebase shit</td>
    </tr>
    <tr>
      <td>10.11.2022</td>
      <td>Jakob</td>
      <td>Chat styling + scroll'pane'</td>
    </tr>
    <tr>
      <td>10.11.2022</td>
      <td>Hendrik</td>
      <td>Still trying to implement Firebase</td>
    </tr>
    <tr>
      <td>17.11.2022</td>
      <td>Jakob</td>
      <td>organisation + umstrukturierung + entfernen von Firebase dependencies</td>
    </tr>
    <tr>
      <td>17.11.2022</td>
      <td>Hendrik</td>
      <td>Gibt firebase auf - wird frontend Uebernehmen</td>
    </tr>
    <tr>
      <td>24.11.2022</td>
      <td>Jakob</td>
      <td>Klausur + Botlogic</td>
    </tr>
    <tr>
      <td>24.11.2022</td>
      <td>Hendrik</td>
      <td>Klausur</td>
    </tr>
    <tr>
      <td>1.12.2022</td>
      <td>Jakob</td>
      <td>GitHub Praesi, die sehr viel zu sagen hatte + Git Einrichtung in Eclipse Anleitung auf GitHub</td>
    </tr>
    <tr>
      <td>1.12.2022</td>
      <td>Hendrik</td>
      <td>Zuhoeren</td>
    </tr>
    <tr>
      <td>15.12.2022</td>
      <td>Jakob</td>
      <td>Settings & comments & form & logic fixes</td>
    </tr>
    <tr>
      <td>15.12.2022</td>
      <td>Hendrik</td>
      <td>Zeichnen und anderen helfen</td>
    </tr>
    <tr>
      <td>Ferien</td>
      <td>Jakob</td>
      <td>Hangman mit ASCII art</td>
    </tr>
    <tr>
      <td>11.1.2023</td>
      <td>Jakob</td>
      <td>logik f?r Gewinn/Unentschieden sowie platzierung</td>
    </tr>
    <tr>
      <td>12.1.2023</td>
      <td>Jakob</td>
      <td>Gewinnbedingungspr?fung & Settings | Hendrik mit GitHub helfen</td>
    </tr>
    <tr>
      <td>12.1.2023</td>
      <td>hendrik</td>
      <td>Gestalten der Grafiken (Symbole und Linien) & Bestehende Malerei upload</td>
    </tr>
  </tbody>
</table>

### Hinweise fuer das Programmieren
Zum Loggen von Dingen bitte immer Logger.log("Pfad", "Aktion"); verwenden!<br>
Please don't upload Logs to the repository outside from issues
