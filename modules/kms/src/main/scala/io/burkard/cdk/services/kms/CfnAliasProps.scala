package io.burkard.cdk.services.kms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAliasProps {

  def apply(
    targetKeyId: Option[String] = None,
    aliasName: Option[String] = None
  ): software.amazon.awscdk.services.kms.CfnAliasProps =
    (new software.amazon.awscdk.services.kms.CfnAliasProps.Builder)
      .targetKeyId(targetKeyId.orNull)
      .aliasName(aliasName.orNull)
      .build()
}
