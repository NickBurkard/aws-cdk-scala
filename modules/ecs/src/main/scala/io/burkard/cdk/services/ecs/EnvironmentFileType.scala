package io.burkard.cdk.services.ecs

sealed abstract class EnvironmentFileType(val underlying: software.amazon.awscdk.services.ecs.EnvironmentFileType)
  extends Product
    with Serializable

object EnvironmentFileType {
  implicit def toAws(value: EnvironmentFileType): software.amazon.awscdk.services.ecs.EnvironmentFileType =
    Option(value).map(_.underlying).orNull

  case object S3
    extends EnvironmentFileType(software.amazon.awscdk.services.ecs.EnvironmentFileType.S3)
}
