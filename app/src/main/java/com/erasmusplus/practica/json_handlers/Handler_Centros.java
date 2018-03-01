package com.erasmusplus.practica.json_handlers;

import java.util.List;

public class Handler_Centros {

    /**
     * yf_INSTITUTION : [{"ID":"15","EMAIL":"orlandosol@gmail.com","NAME":"IES","STREET":"calle","CITY":"sevilla","COUNTRY":"Spain","TYPE":"1"},{"ID":"16","EMAIL":"","NAME":"","STREET":"","CITY":"","COUNTRY":"Afghanistan","TYPE":"1"},{"ID":"17","EMAIL":"angmatalv@gmail.com","NAME":"Casa Angel","STREET":"Sor Emilia 25","CITY":"Alcala de Guadaira","COUNTRY":"Spain","TYPE":"7"},{"ID":"18","EMAIL":"aaaaa@aaaa.com","NAME":"aaaaa","STREET":"aaaaa","CITY":"aaaaz","COUNTRY":"Spain","TYPE":"1"},{"ID":"19","EMAIL":"aaa","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"20","EMAIL":"aaa","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"21","EMAIL":"aaa","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"22","EMAIL":"","NAME":"","STREET":"","CITY":"","COUNTRY":"Spain","TYPE":"1"},{"ID":"23","EMAIL":"prueba@prueba.es","NAME":"Centro prueba","STREET":"calle prueba","CITY":"ciudad prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"24","EMAIL":"prueba@prueba.es","NAME":"Centro prueba","STREET":"calle prueba","CITY":"ciudad prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"25","EMAIL":"prueba@prueba.es","NAME":"Centro prueba","STREET":"calle prueba","CITY":"ciudad prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"26","EMAIL":"prueba","NAME":"prueba","STREET":"prueba","CITY":"prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"27","EMAIL":"prueba","NAME":"prueba","STREET":"prueba","CITY":"prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"28","EMAIL":"prueba","NAME":"prueba","STREET":"prueba","CITY":"prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"29","EMAIL":"prueba","NAME":"prueba","STREET":"prueba","CITY":"prueba","COUNTRY":"Spain","TYPE":"1"},{"ID":"30","EMAIL":"ppp","NAME":"ppp","STREET":"ppp","CITY":"ppp","COUNTRY":"Spain","TYPE":"1"},{"ID":"31","EMAIL":"","NAME":"ppp","STREET":"ppp","CITY":"ppp","COUNTRY":"Spain","TYPE":"1"},{"ID":"32","EMAIL":"0","NAME":"ppp","STREET":"ppp","CITY":"ppp","COUNTRY":"Spain","TYPE":"1"},{"ID":"33","EMAIL":"info@laboratorio.es","NAME":"Laboratorio Angel","STREET":"Calle Laboratorio","CITY":"Sevilla","COUNTRY":"Spain","TYPE":"6"},{"ID":"34","EMAIL":"info@estudio.es","NAME":"Estudio Angel","STREET":"Calle Estudio","CITY":"Sevilla","COUNTRY":"Spain","TYPE":"1"},{"ID":"35","EMAIL":"aaa@gm.com","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"36","EMAIL":"aaa@gm.com","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"37","EMAIL":"aaa@g.com","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"38","EMAIL":"pepe@gnail.com","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"39","EMAIL":"pepe@gnail.com","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"40","EMAIL":"pepe@gnail.co","NAME":"aaa","STREET":"aaa","CITY":"aaa","COUNTRY":"Spain","TYPE":"1"},{"ID":"41","EMAIL":"bbb@gmail","NAME":"bbb","STREET":"bbb","CITY":"bbb","COUNTRY":"Spain","TYPE":"1"},{"ID":"42","EMAIL":"bbb@gmail","NAME":"bbb","STREET":"bbb","CITY":"bbb","COUNTRY":"Spain","TYPE":"1"},{"ID":"43","EMAIL":"popo@gmail.com","NAME":"popo","STREET":"popo","CITY":"popo","COUNTRY":"Spain","TYPE":"1"},{"ID":"44","EMAIL":"pipo@gmail.com","NAME":"popo","STREET":"popo","CITY":"popo","COUNTRY":"Spain","TYPE":"1"},{"ID":"45","EMAIL":"titi@gmail.com","NAME":"titi","STREET":"titi","CITY":"titi","COUNTRY":"Spain","TYPE":"1"},{"ID":"46","EMAIL":"fff@fff","NAME":"fff","STREET":"fff","CITY":"fff","COUNTRY":"Spain","TYPE":"1"},{"ID":"47","EMAIL":"fff@fff","NAME":"fff","STREET":"fff","CITY":"fff","COUNTRY":"Spain","TYPE":"1"},{"ID":"48","EMAIL":"yyy","NAME":"yyy","STREET":"yyy","CITY":"yyy","COUNTRY":"Spain","TYPE":"1"},{"ID":"49","EMAIL":"hhh","NAME":"hhh","STREET":"hhh","CITY":"hhh","COUNTRY":"Spain","TYPE":"1"},{"ID":"50","EMAIL":"cccb","NAME":"ccc","STREET":"ccc","CITY":"ccc","COUNTRY":"Spain","TYPE":"1"},{"ID":"51","EMAIL":"nnn","NAME":"nnn","STREET":"nnn","CITY":"nnnn","COUNTRY":"Spain","TYPE":"1"},{"ID":"52","EMAIL":"dddb","NAME":"ddd","STREET":"ddd","CITY":"ddd","COUNTRY":"Spain","TYPE":"1"},{"ID":"53","EMAIL":"prueba@prueba.es ","NAME":"pruebas ","STREET":"pruebas ","CITY":"pruebas ","COUNTRY":"Spain","TYPE":"1"},{"ID":"54","EMAIL":"ggg","NAME":"ggg","STREET":"ggg","CITY":"ggg","COUNTRY":"Spain","TYPE":"1"},{"ID":"55","EMAIL":"final@final.com","NAME":"prueba final","STREET":"calle final","CITY":"ciudad final","COUNTRY":"Spain","TYPE":"1"},{"ID":"56","EMAIL":"definitiva@defi.com","NAME":"definitiva","STREET":"definitiva","CITY":"definitiva","COUNTRY":"Spain","TYPE":"1"},{"ID":"57","EMAIL":"caos@yo.es","NAME":"dolores","STREET":"de","CITY":"riñones","COUNTRY":"Spain","TYPE":"5"},{"ID":"58","EMAIL":"jjjjjjjjjj","NAME":"jjjjjjjjj","STREET":"jjjjjjjj","CITY":"jjjjjjjj","COUNTRY":"Spain","TYPE":"1"},{"ID":"59","EMAIL":"dddd","NAME":"?ddddddddd","STREET":"ddddddd","CITY":"dddddd","COUNTRY":"Spain","TYPE":"1"},{"ID":"60","EMAIL":"dddd","NAME":"?ddddddddd","STREET":"ddddddd","CITY":"dddddd","COUNTRY":"Spain","TYPE":"1"},{"ID":"61","EMAIL":"dddd","NAME":"?ddddddddd","STREET":"ddddddd","CITY":"dddddd","COUNTRY":"Spain","TYPE":"1"},{"ID":"62","EMAIL":"dddd","NAME":"?ddddddddd","STREET":"ddddddd","CITY":"dddddd","COUNTRY":"Spain","TYPE":"1"},{"ID":"63","EMAIL":"alberito@gmail.com","NAME":"Alberito","STREET":"Calle Albero","CITY":"Alcala","COUNTRY":"Spain","TYPE":"1"},{"ID":"64","EMAIL":"centro1@Centro.es","NAME":"centro1","STREET":"calle1","CITY":"ciudad1","COUNTRY":"Spain","TYPE":"1"},{"ID":"65","EMAIL":"centro1@Centro.es","NAME":"centro1","STREET":"calle1","CITY":"ciudad1","COUNTRY":"Spain","TYPE":"1"},{"ID":"66","EMAIL":"mmm","NAME":"mmm","STREET":"mmm","CITY":"mmm","COUNTRY":"Spain","TYPE":"1"},{"ID":"67","EMAIL":"correo2","NAME":"centro2","STREET":"calle2","CITY":"ciudad2","COUNTRY":"Spain","TYPE":"1"},{"ID":"68","EMAIL":"mio@mio.com","NAME":"centro3","STREET":"calle3","CITY":"ciudad3","COUNTRY":"Spain","TYPE":"1"},{"ID":"69","EMAIL":"lab@mate.es","NAME":"LabMate","STREET":"Sor Emilia","CITY":"Alcala","COUNTRY":"Spain","TYPE":"6"},{"ID":"70","EMAIL":"wwwww","NAME":"wwwwww","STREET":"wwwwww","CITY":"wwwwww","COUNTRY":"Spain","TYPE":"1"},{"ID":"71","EMAIL":"experimentos@angel.com","NAME":"Experimentos Angel","STREET":"Sor Emilia","CITY":"Sevilla","COUNTRY":"Spain","TYPE":"6"},{"ID":"72","EMAIL":"iiiiiiii","NAME":"íiiiii","STREET":"iiiii","CITY":"iiiii","COUNTRY":"Spain","TYPE":"1"},{"ID":"73","EMAIL":"casita@gmail.com","NAME":"Casita Angel","STREET":"Calle Sor Emilia","CITY":"Alcalá de Guadaíra","COUNTRY":"Spain","TYPE":"2"},{"ID":"74","EMAIL":"eeee","NAME":"eeee","STREET":"eeee","CITY":"eeeee","COUNTRY":"Spain","TYPE":"1"},{"ID":"75","EMAIL":"zzzz","NAME":"zzzz","STREET":"zzzz","CITY":"zzzz","COUNTRY":"Spain","TYPE":"1"},{"ID":"76","EMAIL":"adcenter@andrc.com","NAME":"Android center","STREET":"Doctor marañon s/n","CITY":"Sevilla","COUNTRY":"Spain","TYPE":"4"},{"ID":"77","EMAIL":"ultima","NAME":"ultima","STREET":"ultima","CITY":"ultima","COUNTRY":"Spain","TYPE":"1"},{"ID":"78","EMAIL":"h","NAME":"j","STREET":"h","CITY":"h","COUNTRY":"Spain","TYPE":"1"},{"ID":"79","EMAIL":"mata@mata.com","NAME":"mata","STREET":"mata","CITY":"mata","COUNTRY":"Spain","TYPE":"3"},{"ID":"80","EMAIL":"mata3@gmail.com","NAME":"mata2","STREET":"calle","CITY":"sev","COUNTRY":"Spain","TYPE":"1"},{"ID":"81","EMAIL":"mata2@gmail.com","NAME":"mata2","STREET":"mata2","CITY":"mata2","COUNTRY":"Spain","TYPE":"1"},{"ID":"82","EMAIL":"mata3@gmail.com","NAME":"mata2","STREET":"mata2","CITY":"1233","COUNTRY":"Spain","TYPE":"1"},{"ID":"83","EMAIL":"mata3@gmail.com","NAME":"mata3","STREET":"mata3","CITY":"mata4","COUNTRY":"Spain","TYPE":"1"},{"ID":"84","EMAIL":"mata3@gmail.com","NAME":"mata3","STREET":"mata32","CITY":"mata4","COUNTRY":"Spain","TYPE":"1"},{"ID":"85","EMAIL":"mata32@gmail.com","NAME":"mata3","STREET":"mata32","CITY":"mata4","COUNTRY":"Spain","TYPE":"1"},{"ID":"86","EMAIL":"mata32@gmail.com","NAME":"mata32","STREET":"mata32","CITY":"mata4","COUNTRY":"Spain","TYPE":"1"},{"ID":"87","EMAIL":"prueba@gmail.com","NAME":"a","STREET":"a","CITY":"a","COUNTRY":"Spain","TYPE":"1"},{"ID":"88","EMAIL":"m@m.com","NAME":"m","STREET":"m","CITY":"m","COUNTRY":"Spain","TYPE":"1"},{"ID":"89","EMAIL":"m@m.com","NAME":"m","STREET":"m","CITY":"m","COUNTRY":"Spain","TYPE":"1"},{"ID":"90","EMAIL":"m2@m.com","NAME":"m","STREET":"m","CITY":"m","COUNTRY":"Spain","TYPE":"1"},{"ID":"91","EMAIL":"jossezeq@gmail.com","NAME":"La gran prueba","STREET":"La gran prueba","CITY":"La gran prueba ","COUNTRY":"Spain","TYPE":"1"},{"ID":"92","EMAIL":"q@q.com","NAME":"mataa","STREET":"1","CITY":"1","COUNTRY":"Spain","TYPE":"1"},{"ID":"93","EMAIL":"bdjdbdbd","NAME":"jdjdhdhd","STREET":"bdhdhdhd","CITY":"bdbdbdbd","COUNTRY":"Spain","TYPE":"0"},{"ID":"94","EMAIL":"hdhdhdhd","NAME":"hdhdhd","STREET":"hdhdhd","CITY":"hdhdhd","COUNTRY":"Spain","TYPE":"0"},{"ID":"95","EMAIL":"hdhdhd","NAME":"hdhdvd","STREET":"hdhdhd","CITY":"hdhdhd","COUNTRY":"Spain","TYPE":"0"},{"ID":"96","EMAIL":"hdbd","NAME":"bdbd","STREET":"hdhdhd","CITY":"hdhdbd","COUNTRY":"Spain","TYPE":"0"},{"ID":"97","EMAIL":"bdbdbd","NAME":"jajsjs","STREET":"hdhdv","CITY":"bdvdvd","COUNTRY":"Spain","TYPE":"0"},{"ID":"98","EMAIL":"pepito@gmail.com","NAME":"Ordenador pepito","STREET":"calle pepito","CITY":"ciudad pepito","COUNTRY":"Afghanistan","TYPE":"4"},{"ID":"99","EMAIL":"blabla@gmail.com","NAME":"blablacar","STREET":"blablacar","CITY":"blablacar","COUNTRY":"Afghanistan","TYPE":"4"},{"ID":"100","EMAIL":"blabla","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"101","EMAIL":"2@2.com","NAME":"2","STREET":"2","CITY":"2","COUNTRY":"Spain","TYPE":"1"},{"ID":"102","EMAIL":"blabla","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"103","EMAIL":"jdjdhd","NAME":"bdhdbd","STREET":"bdhdbd","CITY":"hdhdhd","COUNTRY":"Spain","TYPE":"0"},{"ID":"104","EMAIL":"blablah","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"105","EMAIL":"blablah","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"106","EMAIL":"blablah","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"107","EMAIL":"blablah","NAME":"huhu","STREET":"c2","CITY":"c2","COUNTRY":"Spain","TYPE":"1"},{"ID":"108","EMAIL":"3@3.es","NAME":"3","STREET":"3","CITY":"3","COUNTRY":"Spain","TYPE":"1"},{"ID":"109","EMAIL":"c@c.com","NAME":"c1","STREET":"c1","CITY":"c1","COUNTRY":"Spain","TYPE":"1"},{"ID":"110","EMAIL":"bdbdhdhd","NAME":"hshshdhd","STREET":"hdhdhd","CITY":"hdhdbd","COUNTRY":"Spain","TYPE":"0"},{"ID":"111","EMAIL":"srk@gmail.com","NAME":"hdhdhd","STREET":"bdhdbd","CITY":"hdhdvd","COUNTRY":"Spain","TYPE":"0"},{"ID":"112","EMAIL":"srk@gmail.com","NAME":"hdhdhd","STREET":"bdhdbd","CITY":"hdhdvd","COUNTRY":"Spain","TYPE":"0"},{"ID":"113","EMAIL":"srk@gmail.com","NAME":"hdhdhd","STREET":"bdhdbd","CITY":"hdhdvd","COUNTRY":"Spain","TYPE":"0"},{"ID":"114","EMAIL":"cr@cr.es","NAME":"cristian","STREET":"cristian","CITY":"cristian","COUNTRY":"Spain","TYPE":"1"},{"ID":"115","EMAIL":"paco@paco.com","NAME":"paco","STREET":"paco","CITY":"paco","COUNTRY":"Spain","TYPE":"1"},{"ID":"116","EMAIL":"gb","NAME":"hv","STREET":"fg","CITY":"gv","COUNTRY":"Spain","TYPE":"7"}]
     * success : 1
     */

    private int success;
    private List<YfINSTITUTIONBean> yf_INSTITUTION;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public List<YfINSTITUTIONBean> getYf_INSTITUTION() {
        return yf_INSTITUTION;
    }

    public void setYf_INSTITUTION(List<YfINSTITUTIONBean> yf_INSTITUTION) {
        this.yf_INSTITUTION = yf_INSTITUTION;
    }

    public static class YfINSTITUTIONBean {
        /**
         * ID : 15
         * EMAIL : orlandosol@gmail.com
         * NAME : IES
         * STREET : calle
         * CITY : sevilla
         * COUNTRY : Spain
         * TYPE : 1
         */

        private String ID;
        private String EMAIL;
        private String NAME;
        private String STREET;
        private String CITY;
        private String COUNTRY;
        private String TYPE;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEMAIL() {
            return EMAIL;
        }

        public void setEMAIL(String EMAIL) {
            this.EMAIL = EMAIL;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public String getSTREET() {
            return STREET;
        }

        public void setSTREET(String STREET) {
            this.STREET = STREET;
        }

        public String getCITY() {
            return CITY;
        }

        public void setCITY(String CITY) {
            this.CITY = CITY;
        }

        public String getCOUNTRY() {
            return COUNTRY;
        }

        public void setCOUNTRY(String COUNTRY) {
            this.COUNTRY = COUNTRY;
        }

        public String getTYPE() {
            return TYPE;
        }

        public void setTYPE(String TYPE) {
            this.TYPE = TYPE;
        }

        @Override
        public String toString() {
            return NAME;
        }
    }
}
