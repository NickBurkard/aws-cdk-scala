package io.burkard.cdk.services.codeguruprofiler


sealed abstract class ComputePlatform(val underlying: software.amazon.awscdk.services.codeguruprofiler.ComputePlatform)
  extends Product
    with Serializable


object ComputePlatform {
  implicit def toAws(value: ComputePlatform): software.amazon.awscdk.services.codeguruprofiler.ComputePlatform =
    Option(value).map(_.underlying).orNull

  case object AwsLambda
    extends ComputePlatform(software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.AWS_LAMBDA)

  case object Default
    extends ComputePlatform(software.amazon.awscdk.services.codeguruprofiler.ComputePlatform.DEFAULT)
}
