package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicyPrincipalAttachment {

  def apply(
    internalResourceId: String,
    policyName: String,
    principal: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment =
    software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName)
      .principal(principal)
      .build()
}
