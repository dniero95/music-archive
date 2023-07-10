# music-archive
Esercitazione in vista dell'esame finale per il diploma di FinTech Software Developer erogato da ITS ICT Piemonte


## Requisiti

Un sito musicale contiene l’archivio dei brani musicali presenti negli album pubblicati negli ultimi anni.

Si vuole realizzare un’interfaccia di ricerca per i brani stessi, basati su un insieme di tag indicati dagli utenti. Si ipotizzi che un brano possa appartenere ad un solo album, e che tutti i brani dello stesso album abbiano lo stesso autore. Ogni brano può essere associato a più tag diversi, ciascuno dei quali con un “peso” (intero) che indica quanti utenti hanno trovato utile/appropriato quel tag associato a quel brano.

Si supponga che il sito si basi su un database così organizzato:

 * Brano(<ins>id</ins>, titoloBrano, durata, idAlbum)
 * Album(<ins>id</ins>, titoloAlbum, anno, cantante)
 * Tag(<ins>idBrano</ins>, tag, peso)

Si vuole realizzare in tecnologia JSP una porzione del sito musicale, che comprenda le seguenti funzionalità:

1. Una pagina contenente l’elenco di tutti i tag più popolari all’interno dell’intero database. La pagina deve visualizzare (al massimo) i 100 tag più utilizzati (identificati dalla somma dei pesi su tutti i brani del database), ordinati in ordine alfabetico, ed affiancati ciascuno dal numero di brani diversi a cui sono associati. La selezione di uno di questi tag deve portare alla successiva pagina.
2. Una pagina che visualizzi, per il tag scelto dall’utente nella pagina precedente, l’elenco di tutti i brani associati a tale tag. L’elenco deve essere in ordine descrescente di peso, e ciascuna voce dell’elenco deve indicare i dati salienti del brano e dell’album che lo contiene, oltre all’elenco dei 5 tag più rilevanti per tale brano.

In particolare, si richiede di:

 * identificare, a partire dalle specifiche precedenti, le componenti necessarie (pagine jsp, servlet, bean, ...) a realizzare le funzionalità sopra descritte secondo il paradigma MVC
 * implementare tali pagine e classi.

Nella redazione dell’elaborato, si punti a scrivere la parte essenziale del codice, rinunciando a curare l’aspetto grafico. È permesso allegare stampe del codice di pagine sviluppate in precedenza. Non è richiesta la realizzazione grafica mediante CSS né lo sviluppo di componenti dinamiche lato client.

