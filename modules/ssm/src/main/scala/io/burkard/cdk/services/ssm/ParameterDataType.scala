package io.burkard.cdk.services.ssm


sealed abstract class ParameterDataType(val underlying: software.amazon.awscdk.services.ssm.ParameterDataType)
  extends Product
    with Serializable


object ParameterDataType {
  implicit def toAws(value: ParameterDataType): software.amazon.awscdk.services.ssm.ParameterDataType =
    Option(value).map(_.underlying).orNull

  case object Text
    extends ParameterDataType(software.amazon.awscdk.services.ssm.ParameterDataType.TEXT)

  case object AwsEc2Image
    extends ParameterDataType(software.amazon.awscdk.services.ssm.ParameterDataType.AWS_EC2_IMAGE)
}
