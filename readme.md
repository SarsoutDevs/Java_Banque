- Les concepts de programmes orienté objets :
-> Classes
-> Objets
-> Héritage
-> Encapsulation
-> Polymorphisme

- JVM (Java Virtual Machine) : couche machine virtuel

- L'objectif c'est développer une application web et **gestion de comptes bancaires** :
-> `Compte` : titulaire, solde, 2 constructeurs, getters et setters , créditer et débiter
-> `CompteEpargne` : benefice
-> `Banque` : nom, listCompte et ajouterCompte
-> `SoldeInsuffisantException` : pour gérer le cas ou le montant à retirer est > au solde disponible
-> `TestGestionBanque` : contient la méthode main pour tester ces classes
