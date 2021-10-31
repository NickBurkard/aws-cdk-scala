package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourcePolicyProps {

  def apply(
    policyName: Option[String] = None,
    policyDocument: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnResourcePolicyProps =
    (new software.amazon.awscdk.services.logs.CfnResourcePolicyProps.Builder)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
