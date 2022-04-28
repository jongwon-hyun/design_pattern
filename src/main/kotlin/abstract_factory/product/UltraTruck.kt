package abstract_factory.product

import abstract_factory.product.part.VehiclePartFactory

class UltraTruck(private val vehiclePartFactory: VehiclePartFactory) : Vehicle() {
    override var name = NAME

    override fun assembly() {
        engine = vehiclePartFactory.createEngine()
        tire = vehiclePartFactory.createTire()
        options = listOf()
    }


    companion object {
        const val NAME: String = "Ultra Truck"
    }
}