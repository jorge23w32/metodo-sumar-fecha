import java.text.SimpleDateFormat

static void main(String[] args) {
  OperacionesFecha operacionesFecha = new OperacionesFecha()
  def fechaInicio = "20-12-2024"
  def fechaFin = "27-12-2024"
  SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy")
  fechaInicio = format.parse(fechaInicio)
  fechaFin = format.parse(fechaFin)
  println(fechaFin.getClass())
  operacionesFecha.iterarFechaInicio(fechaInicio, fechaFin).forEach {
    println(format.format(it))
  }

}