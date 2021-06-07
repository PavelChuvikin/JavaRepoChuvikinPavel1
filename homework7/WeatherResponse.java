import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "weatherresponse")
class WeatherResponse {
// Класс Weatherresponce имеет 2 вложенных класса
        WeatherResponse(){};

        private Temperature temperature;

        public Temperature gettemperature() {
                return temperature;
        }

        public void settemperature(Temperature temperature) {
                this.temperature = temperature;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonRootName(value = "temperature")
        static class Temperature{

                Temperature(){};


                private Metric metric;

                public Metric getmetric() {
                        return metric;
                }

                public void setmetric(Metric metric) {
                        this.metric = metric;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                @JsonRootName(value = "metric")
                static  class Metric{
                        private String value;
                        private String unit;


                        Metric(){};

                        public String getvalue() {
                                return value;
                        }

                        public String getunit() {
                                return unit;
                        }


                        public void setvalue(String value) {
                                this.value = value;
                        }

                        public void setunit(String unit) {
                                this.unit = unit;
                        }


                        @Override
                        public String toString() {
                                return "Metric{" +
                                        "value='" + value + '\'' +
                                        ", unit='" + unit + '\'' +
                                        '}';
                        }
                }

                @Override
                public String toString() {
                        return "Temperature{" +
                                "metric=" + metric +
                                '}';
                }
        }

        @Override
        public String toString() {
                return "Datalist{" +
                        "temperature=" + temperature +
                        '}';
        }
}
