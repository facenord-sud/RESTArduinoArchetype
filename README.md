# RESTArduinoArchetype
> Archétype [Maven](http://maven.apache.org) pour la création d'applications RESTful adaptées au Web des Objets

## Description
Un archétype est une fonctionnalité de Maven qui permet de générer un projet avec un certain nombre de fichiers et de dossiers déjà existant. Ainsi, pour chaque même type de projet, il n’est plus nécessaire de repartir de zéro. Une application RESTful du Web des Objets est quelque peu différente d’une application classique, c'est pour cette raison que nous avons défini notre propre archétype Maven.

## Motivation
Définir un archétype permet deux choses. Premièrement, cela offre un gain de temps appréciable en fournissant une application prête à être utilisée. Aucune dépendance ne doit être ajoutée dans le POM, la configuration est déjà faite et des fichiers d’exemples sont déjà là, qui peuvent être utilisés comme source d’inspiration. Deuxièmement, cela offre une structure adaptée pour le type d’application à réaliser.

## Structure
Dans notre cas, l’archétype que nous avons créé propose une structure quelque peu modifiée. En plus des classes JAXB et des classes de ressources que l’on trouve dans presque toute application Jersey, nous avons ajouté :

* le package `notifications` dans lequel se situent les classes faisant partie du pattern builder des notifications de la bibliothèque [ArduinoCommunication](https://github.com/facenord-sud/ArduinoCommunication). Une classe faisant office de Factory pour les différents types de notification est déjà créée.
* le package `mapper` est censé accueillir toutes les classes effectuant la transformation entre une classe représentant un composant Arduino en une classe JAXB.
* la classe `Listener` du paquet `monitoring.listener` qui gère la connexion à l’Arduino, ou la simulation de l’Arduino. Cette classe implémente un observateur appelé juste avant que le serveur ait fini de démarrer.
* Le fichier `pom.xml` contient toutes les dépendances et plugins Maven nécessaires à l’application. De même que toute la configuration standard est déjà effectuée.
* Pour chaque élément de l’application (classe de ressource, JAXB, notification, etc) un exemple est donné
Nous n’avons pas inclus de package pour les classes représentant un composant de l’Arduino, car nous partons du principe que ces classes devraient se trouver dans la dépendance [ArduinoComponents](https://github.com/facenord-sud/ArduinoComponents).

## Utilisation
La création d'un projet Maven avec cet archétype et la génération des classe de ressources et des classes JAXB se fait en cinq étapes:

* Lancer la commande pour créer un nouveau projet avec un des archétype développé:
```
mvn archetype:generate -DarchetypeCatalog=http://diufpc46.unifr.ch/artifactory/ext-release-local
```
Attention! Il est important de ne pas ajouter un slash à la fin de l'URL et il est requis d'utiliser le VPN ou d'être connecté au réseau de l'université de Fribourg.
* Deux archétypes sont proposés, choisir le premier (RESTArduino-archetype)
* Fournir les informations demandées. Uniquement `groupId` (le nom de base des packages) et `artifactId` (le nom du projet) sont obligatoires
* Dans le dossier `nom-du-projet/src/main/resources/WADL` remplacer le fichier `application.wadl` par celui obtenu grâce à la modélisation et son propre fichier XSD.
* Lancer la commande:
```
mvn clean compile package
```
* Copier les classes de ressources et les classes JAXB depuis `nom-du-projet/target/generated-sources` respectivement vers les paquets finissant par `ressources` et `jaxb` situés dans le dossier `nom-du-projet/src`

Et voilà, il ne reste plus qu'à développer l'application.
Typiquement, le développement d’une ressource d’une application se déroule comme suit :

1. Implémenter une ou plusieurs classes dans le package `mapper` pour transformer une classe de `ArduinoComponents` vers une classe JAXB et inversement.
2. Implémenter les différentes méthodes de la ressource. Cela consiste généralement à interagir avec l’Arduino et est souvent très similaire à l’exemple fournit dans ce [projet](https://github.com/facenord-sud/FirstXwot). De plus, il est recommandé d’écrire des tests d’intégration utilisant la simulation de l’Arduino.
3. Implémenter les méthodes du publisher, à nouveau il est possible de s’inspirer de l’exemple correspondant et il est recommandé d’écrire des tests d’intégration.
4. Implémenter les méthodes `hasNotification` et `jaxbToStringEntity` d’une nouvelle classe étendant de `NotificationBuilder` afin de créer une nouvelle notification.
5. Ajouter une méthode à la classe `Factory` du package `notifications`, afin de pouvoir utiliser toujours la même instance de la classe précédemment créée.

Voilà. Une nouvelle ressource avec publisher et envoi de notifications est créée.
