package com.example.jsonobject;

public class Three {

        private String Urdu;

        private String english;

        private String Hindi;

        public String getUrdu ()
        {
            return Urdu;
        }

        public void setUrdu (String Urdu)
        {
            this.Urdu = Urdu;
        }

        public String getEnglish ()
        {
            return english;
        }

        public void setEnglish (String english)
        {
            this.english = english;
        }

        public String getHindi ()
        {
            return Hindi;
        }

        public void setHindi (String Hindi)
        {
            this.Hindi = Hindi;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [Urdu = "+Urdu+", english = "+english+", Hindi = "+Hindi+"]";
        }
    }