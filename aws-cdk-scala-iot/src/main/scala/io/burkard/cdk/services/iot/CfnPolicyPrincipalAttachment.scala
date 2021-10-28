package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPolicyPrincipalAttachment {

  def apply(
    internalResourceId: String,
    policyName: Option[String] = None,
    principal: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment =
    software.amazon.awscdk.services.iot.CfnPolicyPrincipalAttachment.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName.orNull)
      .principal(principal.orNull)
      .build()
}
