package io.burkard.cdk.services.stepfunctions


sealed abstract class CompressionType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.CompressionType)
  extends Product
    with Serializable


object CompressionType {
  implicit def toAws(value: CompressionType): software.amazon.awscdk.services.stepfunctions.tasks.CompressionType =
    Option(value).map(_.underlying).orNull

  case object None
    extends CompressionType(software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.NONE)

  case object Gzip
    extends CompressionType(software.amazon.awscdk.services.stepfunctions.tasks.CompressionType.GZIP)
}
