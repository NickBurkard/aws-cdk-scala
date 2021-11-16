package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicyPrincipalAttachmentProps {

  def apply(
    policyName: String,
    principal: String
  ): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps =
    (new software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachmentProps.Builder)
      .policyName(policyName)
      .principal(principal)
      .build()
}
