пакет  Seminar05_Phonebook_mvc ;

        импортировать  java . ио . FileWriter ;
        импортировать  java . ио . IOException ;
        импортировать  java . полезно . список массивов ;
        импортировать  java . полезно . Список ;

        модели открытого класса  расширяет телефонную книгу {

public  void  addContact ( Контактный  контакт ) {
        // сюда переписать -> добавить, если нету
        телефонная книга . добавить ( контакт );
        Система . вне . println ( телефонная книга.toString ( ));

        }
        общедоступный  список < контакт > проверка ( найти строку  ){
        Список < Контакт > tocheck = новый  ArrayList <>();
        для ( Контактный  контакт : телефонная книга ) {
        если ( контакт . getFirstname (). равно ( найти ) ||
        контакт . получить фамилию (). равно ( найти ) || контакт . получить номер телефона (). равно ( найти )){
        проверить . добавить ( контакт );

        }

        }
        вернуться  к проверке ;
        }
public  void  deleteContact ( String  phone ) {

        Контакт  для удаления = null ;
        для ( Контактный  контакт : телефонная книга ) {
        если ( контакт . getPhonenumber (). равно ( телефон )) {
        удалить = контакт ;
        }

        }
        телефонная книга . удалить ( удалить );
        }

        публичная  пустота  printAll () {
        Система . вне . println ( телефонная книга.toString ( ));
        }

        общественное  недействительное  saveAll () {
        try ( FileWriter  Writer = новый  FileWriter ( "base.txt" , false )) {
        for ( int  i = 0 ; i < phonebook . size (); i ++) {
        Контакт  контакт = телефонная книга . получить ( я );
        писатель . append ( String .format ( contact .getFirstname ()) + " " ) ;
        писатель . append ( String .format ( contact .getLastname ()) + " " ) ;
        писатель . append ( String . format ( contact . getPhonenumber ()) + "\n" );
        }
        писатель . смыть ();
        писатель . закрыть ();
        } поймать ( IOException  ex ) {
        Система . вне . println ( например , getMessage ());
        }
        }

public  void  changeContact ( String  phonenum , List < String > newdata ) {

        для ( Контактный  контакт : телефонная книга ) {

        если ( контакт . getPhonenumber (). равно ( phonenum )) {
        Строковое  поле = новые данные . получить ( 0 );
        переключатель ( поле ) {
        случай  "1" :
        контакт . setFirstname ( newdata.get ( 1 ) ) ;
        перерыв ;
        случай  "2" :
        контакт . setLastname ( newdata.get ( 1 ) ) ;
        перерыв ;
        случай  "3" :
        контакт . setPhonenumber ( newdata.get ( 1 ) ) ;
        перерыв ;
        };
        }
        }
        }

        }