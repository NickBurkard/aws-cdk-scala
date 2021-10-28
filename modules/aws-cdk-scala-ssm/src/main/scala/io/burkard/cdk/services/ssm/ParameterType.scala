package io.burkard.cdk.services.ssm

sealed abstract class ParameterType(val underlying: software.amazon.awscdk.services.ssm.ParameterType)
  extends Product
    with Serializable

object ParameterType {
  implicit def toAws(value: ParameterType): software.amazon.awscdk.services.ssm.ParameterType =
    Option(value).map(_.underlying).orNull

  case object String
    extends ParameterType(software.amazon.awscdk.services.ssm.ParameterType.STRING)

  case object SecureString
    extends ParameterType(software.amazon.awscdk.services.ssm.ParameterType.SECURE_STRING)

  case object StringList
    extends ParameterType(software.amazon.awscdk.services.ssm.ParameterType.STRING_LIST)

  case object AwsEc2ImageId
    extends ParameterType(software.amazon.awscdk.services.ssm.ParameterType.AWS_EC2_IMAGE_ID)
}
