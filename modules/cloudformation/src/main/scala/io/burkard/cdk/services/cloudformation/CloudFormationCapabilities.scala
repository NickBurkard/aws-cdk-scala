package io.burkard.cdk.services.cloudformation

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class CloudFormationCapabilities(val underlying: software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object CloudFormationCapabilities {
  implicit def toAws(value: CloudFormationCapabilities): software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities =
    Option(value).map(_.underlying).orNull

  case object None
    extends CloudFormationCapabilities(software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities.NONE)

  case object AnonymousIam
    extends CloudFormationCapabilities(software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities.ANONYMOUS_IAM)

  case object NamedIam
    extends CloudFormationCapabilities(software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities.NAMED_IAM)

  case object AutoExpand
    extends CloudFormationCapabilities(software.amazon.awscdk.services.cloudformation.CloudFormationCapabilities.AUTO_EXPAND)
}
