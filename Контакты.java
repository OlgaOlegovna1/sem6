пакет  Seminar05_Phonebook_mvc ;

        контакт общественного класса  {
        Строковое  имя ;
        Строковая  фамилия ;
        Строка  номер телефона ;

        общественный  контакт () {
        }

        публичная  строка  getFirstname () {
        вернуть  имя ;
        }

public  void  setFirstname ( Строковое  имя ) {
        это . имя = имя ;
        }

        публичная  строка  getLastname () {
        вернуть  фамилию ;
        }

public  void  setLastname ( String  lastname ) {
        это . фамилия = фамилия ;
        }

        общедоступная  строка  getPhonenumber () {
        вернуть  номер телефона ;
        }

public  void  setPhonenumber ( String  phonenumber ) {
        это . номер телефона = номер телефона ;
        }

        общедоступный  контакт ( имя  строки , фамилия строки  , номер телефона строки ) {
        это . имя = имя ;
        это . фамилия = фамилия ;
        это . номер телефона = номер телефона ;
        }

@ Переопределить
    общедоступная  строка  toString () {
            вернуть  "Контакт{" +
            "имя='" + имя + '\'' +
            ", фамилия='" + фамилия + '\'' +
            ", номер телефона = '" + номер телефона + '\'' +
            '}' ;
            }
            }