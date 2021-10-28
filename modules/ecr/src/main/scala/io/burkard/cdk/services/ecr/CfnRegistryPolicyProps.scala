package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegistryPolicyProps {

  def apply(
    policyText: Option[AnyRef] = None
  ): software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps =
    (new software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.Builder)
      .policyText(policyText.orNull)
      .build()
}
