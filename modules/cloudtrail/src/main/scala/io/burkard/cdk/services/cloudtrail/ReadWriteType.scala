package io.burkard.cdk.services.cloudtrail


sealed abstract class ReadWriteType(val underlying: software.amazon.awscdk.services.cloudtrail.ReadWriteType)
  extends Product
    with Serializable


object ReadWriteType {
  implicit def toAws(value: ReadWriteType): software.amazon.awscdk.services.cloudtrail.ReadWriteType =
    Option(value).map(_.underlying).orNull

  case object ReadOnly
    extends ReadWriteType(software.amazon.awscdk.services.cloudtrail.ReadWriteType.READ_ONLY)

  case object WriteOnly
    extends ReadWriteType(software.amazon.awscdk.services.cloudtrail.ReadWriteType.WRITE_ONLY)

  case object All
    extends ReadWriteType(software.amazon.awscdk.services.cloudtrail.ReadWriteType.ALL)

  case object None
    extends ReadWriteType(software.amazon.awscdk.services.cloudtrail.ReadWriteType.NONE)
}
