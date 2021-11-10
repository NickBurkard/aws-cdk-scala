package io.burkard.cdk.services.rds


sealed abstract class StorageType(val underlying: software.amazon.awscdk.services.rds.StorageType)
  extends Product
    with Serializable


object StorageType {
  implicit def toAws(value: StorageType): software.amazon.awscdk.services.rds.StorageType =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends StorageType(software.amazon.awscdk.services.rds.StorageType.STANDARD)

  case object Gp2
    extends StorageType(software.amazon.awscdk.services.rds.StorageType.GP2)

  case object Io1
    extends StorageType(software.amazon.awscdk.services.rds.StorageType.IO1)
}
