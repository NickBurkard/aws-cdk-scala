package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicy {

  def apply(
    internalResourceId: String,
    policyName: Option[String] = None,
    policyDocument: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnPolicy =
    software.amazon.awscdk.services.iot.CfnPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
