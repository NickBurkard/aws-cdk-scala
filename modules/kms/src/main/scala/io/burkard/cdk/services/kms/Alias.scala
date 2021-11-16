package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Alias {

  def apply(
    internalResourceId: String,
    targetKey: software.amazon.awscdk.services.kms.IKey,
    aliasName: String,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.Alias =
    software.amazon.awscdk.services.kms.Alias.Builder
      .create(stackCtx, internalResourceId)
      .targetKey(targetKey)
      .aliasName(aliasName)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
