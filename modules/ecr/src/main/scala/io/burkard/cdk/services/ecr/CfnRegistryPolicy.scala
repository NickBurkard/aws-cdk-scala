package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegistryPolicy {

  def apply(
    internalResourceId: String,
    policyText: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.CfnRegistryPolicy =
    software.amazon.awscdk.services.ecr.CfnRegistryPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyText(policyText.orNull)
      .build()
}