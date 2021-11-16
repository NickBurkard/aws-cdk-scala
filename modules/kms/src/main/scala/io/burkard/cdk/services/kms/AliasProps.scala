package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasProps {

  def apply(
    targetKey: software.amazon.awscdk.services.kms.IKey,
    aliasName: String,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.kms.AliasProps =
    (new software.amazon.awscdk.services.kms.AliasProps.Builder)
      .targetKey(targetKey)
      .aliasName(aliasName)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
