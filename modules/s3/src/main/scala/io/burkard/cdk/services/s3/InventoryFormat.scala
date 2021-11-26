package io.burkard.cdk.services.s3

sealed abstract class InventoryFormat(val underlying: software.amazon.awscdk.services.s3.InventoryFormat)
  extends Product
    with Serializable

object InventoryFormat {
  implicit def toAws(value: InventoryFormat): software.amazon.awscdk.services.s3.InventoryFormat =
    Option(value).map(_.underlying).orNull

  case object Csv
    extends InventoryFormat(software.amazon.awscdk.services.s3.InventoryFormat.CSV)

  case object Orc
    extends InventoryFormat(software.amazon.awscdk.services.s3.InventoryFormat.ORC)

  case object Parquet
    extends InventoryFormat(software.amazon.awscdk.services.s3.InventoryFormat.PARQUET)
}
