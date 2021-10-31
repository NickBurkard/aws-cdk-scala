package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasAttributes {

  def apply(
    aliasName: Option[String] = None,
    aliasTargetKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.kms.AliasAttributes =
    (new software.amazon.awscdk.services.kms.AliasAttributes.Builder)
      .aliasName(aliasName.orNull)
      .aliasTargetKey(aliasTargetKey.orNull)
      .build()
}
