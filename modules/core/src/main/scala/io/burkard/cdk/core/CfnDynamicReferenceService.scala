package io.burkard.cdk.core


sealed abstract class CfnDynamicReferenceService(val underlying: software.amazon.awscdk.CfnDynamicReferenceService)
  extends Product
    with Serializable


object CfnDynamicReferenceService {
  implicit def toAws(value: CfnDynamicReferenceService): software.amazon.awscdk.CfnDynamicReferenceService =
    Option(value).map(_.underlying).orNull

  case object Ssm
    extends CfnDynamicReferenceService(software.amazon.awscdk.CfnDynamicReferenceService.SSM)

  case object SsmSecure
    extends CfnDynamicReferenceService(software.amazon.awscdk.CfnDynamicReferenceService.SSM_SECURE)

  case object SecretsManager
    extends CfnDynamicReferenceService(software.amazon.awscdk.CfnDynamicReferenceService.SECRETS_MANAGER)
}
