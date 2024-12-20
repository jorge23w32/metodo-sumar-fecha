import java.text.SimpleDateFormat

class OperacionesFecha {

    public List<Date> iterarFechaInicio(Date fI, Date fF){

        if(!fI || !fF){
            throw new RuntimeException("Alguna de las dos fechas esta vacia o es nula")
        }
        //Metodo con Date
        def diferenciaDias = fF - fI //Se obtienen los dias que hay de diferencia
        List<Date> fechas = [] //Lista para almacenar las fechas
        for (i in 0..diferenciaDias) { //cCilo que empieza en 0 hasta el numero de diferencia de dias que hay
            fechas.add(fI +  i) //Se agrega la fecha a la lista, a este se le suma o resta el valor de i
        }
        return fechas //Devuelve fechas

        //Metodo con Calendar
//        def patron = new SimpleDateFormat("dd-MM-yyyy")
//        def calendar = Calendar.getInstance()
//        def diferenciaDias = fF - fI
//        def dia = diferenciaDias>0 ? 1:-1
//        List<Date> fechas =[]
//        calendar.setTime(fI)
//        fechas.add(fI)
//        for (i in 0..<diferenciaDias) {
//            calendar.add(Calendar.DAY_OF_YEAR, dia)
//            fechas.add(patron.parse(calendar.format("dd-MM-yyyy")))
//        }
//        return fechas



    }
}
