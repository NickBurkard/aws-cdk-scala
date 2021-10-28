package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
