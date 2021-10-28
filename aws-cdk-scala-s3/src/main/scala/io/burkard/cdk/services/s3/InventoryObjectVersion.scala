package io.burkard.cdk.services.s3

sealed abstract class InventoryObjectVersion(val underlying: software.amazon.awscdk.services.s3.InventoryObjectVersion)
  extends Product
    with Serializable

object InventoryObjectVersion {
  implicit def toAws(value: InventoryObjectVersion): software.amazon.awscdk.services.s3.InventoryObjectVersion =
    Option(value).map(_.underlying).orNull

  case object All
    extends InventoryObjectVersion(software.amazon.awscdk.services.s3.InventoryObjectVersion.ALL)

  case object Current
    extends InventoryObjectVersion(software.amazon.awscdk.services.s3.InventoryObjectVersion.CURRENT)
}
