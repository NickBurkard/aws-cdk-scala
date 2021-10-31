package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Alias {

  def apply(
    internalResourceId: String,
    targetKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    aliasName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.Alias =
    software.amazon.awscdk.services.kms.Alias.Builder
      .create(stackCtx, internalResourceId)
      .targetKey(targetKey.orNull)
      .aliasName(aliasName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
