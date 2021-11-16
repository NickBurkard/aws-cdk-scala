package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegistryPolicy {

  def apply(
    internalResourceId: String,
    policyText: AnyRef
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.CfnRegistryPolicy =
    software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyText(policyText)
      .build()
}
