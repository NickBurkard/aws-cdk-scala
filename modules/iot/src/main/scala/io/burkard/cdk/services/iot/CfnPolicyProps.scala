package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicyProps {

  def apply(
    policyDocument: AnyRef,
    policyName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnPolicyProps =
    (new software.amazon.awscdk.services.iot.CfnPolicyProps.Builder)
      .policyDocument(policyDocument)
      .policyName(policyName.orNull)
      .build()
}
