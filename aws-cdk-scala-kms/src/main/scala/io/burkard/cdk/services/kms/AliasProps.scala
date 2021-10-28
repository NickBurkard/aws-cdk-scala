package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AliasProps {

  def apply(
    targetKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    aliasName: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.kms.AliasProps =
    (new software.amazon.awscdk.services.kms.AliasProps.Builder)
      .targetKey(targetKey.orNull)
      .aliasName(aliasName.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
