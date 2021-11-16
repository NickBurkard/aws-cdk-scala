package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegistryPolicyProps {

  def apply(
    policyText: AnyRef
  ): software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps =
    (new software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps.Builder)
      .policyText(policyText)
      .build()
}
