package io.burkard.cdk.services.codebuild


sealed abstract class ComputeType(val underlying: software.amazon.awscdk.services.codebuild.ComputeType)
  extends Product
    with Serializable


object ComputeType {
  implicit def toAws(value: ComputeType): software.amazon.awscdk.services.codebuild.ComputeType =
    Option(value).map(_.underlying).orNull

  case object Small
    extends ComputeType(software.amazon.awscdk.services.codebuild.ComputeType.SMALL)

  case object Medium
    extends ComputeType(software.amazon.awscdk.services.codebuild.ComputeType.MEDIUM)

  case object Large
    extends ComputeType(software.amazon.awscdk.services.codebuild.ComputeType.LARGE)

  case object X2Large
    extends ComputeType(software.amazon.awscdk.services.codebuild.ComputeType.X2_LARGE)
}
