package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
