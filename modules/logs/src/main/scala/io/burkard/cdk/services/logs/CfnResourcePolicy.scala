package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourcePolicy {

  def apply(
    internalResourceId: String,
    policyName: Option[String] = None,
    policyDocument: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnResourcePolicy =
    software.amazon.awscdk.services.logs.CfnResourcePolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName.orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
