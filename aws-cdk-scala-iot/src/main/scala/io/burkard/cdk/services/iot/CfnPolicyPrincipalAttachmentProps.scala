package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPolicyPrincipalAttachmentProps {

  def apply(
    policyName: Option[String] = None,
    principal: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps =
    (new software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder)
      .policyName(policyName.orNull)
      .principal(principal.orNull)
      .build()
}
