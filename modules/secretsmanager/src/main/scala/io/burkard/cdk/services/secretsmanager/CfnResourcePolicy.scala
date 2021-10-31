package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourcePolicy {

  def apply(
    internalResourceId: String,
    secretId: Option[String] = None,
    blockPublicPolicy: Option[Boolean] = None,
    resourcePolicy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy =
    software.amazon.awscdk.services.secretsmanager.CfnResourcePolicy.Builder
      .create(stackCtx, internalResourceId)
      .secretId(secretId.orNull)
      .blockPublicPolicy(blockPublicPolicy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourcePolicy(resourcePolicy.orNull)
      .build()
}
