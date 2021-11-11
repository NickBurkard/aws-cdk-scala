package io.burkard.cdk.services.s3

sealed abstract class InventoryFrequency(val underlying: software.amazon.awscdk.services.s3.InventoryFrequency)
  extends Product
    with Serializable

object InventoryFrequency {
  implicit def toAws(value: InventoryFrequency): software.amazon.awscdk.services.s3.InventoryFrequency =
    Option(value).map(_.underlying).orNull

  case object Daily
    extends InventoryFrequency(software.amazon.awscdk.services.s3.InventoryFrequency.DAILY)

  case object Weekly
    extends InventoryFrequency(software.amazon.awscdk.services.s3.InventoryFrequency.WEEKLY)
}
