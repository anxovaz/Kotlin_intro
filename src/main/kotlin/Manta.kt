class Manta: PezAcuario(), AccionesPez {
    override var color:String = "gris";
    override fun comer() {
        print("El pez está comiendo")
    }
}