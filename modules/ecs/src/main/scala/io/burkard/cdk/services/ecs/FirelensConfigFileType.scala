package io.burkard.cdk.services.ecs

sealed abstract class FirelensConfigFileType(val underlying: software.amazon.awscdk.services.ecs.FirelensConfigFileType)
  extends Product
    with Serializable

object FirelensConfigFileType {
  implicit def toAws(value: FirelensConfigFileType): software.amazon.awscdk.services.ecs.FirelensConfigFileType =
    Option(value).map(_.underlying).orNull

  case object File
    extends FirelensConfigFileType(software.amazon.awscdk.services.ecs.FirelensConfigFileType.FILE)

  case object S3
    extends FirelensConfigFileType(software.amazon.awscdk.services.ecs.FirelensConfigFileType.S3)
}
