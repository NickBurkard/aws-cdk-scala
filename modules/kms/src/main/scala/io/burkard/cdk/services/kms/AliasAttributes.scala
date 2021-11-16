package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasAttributes {

  def apply(
    aliasName: String,
    aliasTargetKey: software.amazon.awscdk.services.kms.IKey
  ): software.amazon.awscdk.services.kms.AliasAttributes =
    (new software.amazon.awscdk.services.kms.AliasAttributes.Builder)
      .aliasName(aliasName)
      .aliasTargetKey(aliasTargetKey)
      .build()
}
