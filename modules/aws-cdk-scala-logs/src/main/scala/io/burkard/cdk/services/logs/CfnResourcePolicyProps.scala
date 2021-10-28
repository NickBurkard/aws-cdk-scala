package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
