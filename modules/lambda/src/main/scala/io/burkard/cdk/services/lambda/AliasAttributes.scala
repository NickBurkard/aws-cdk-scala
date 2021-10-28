package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AliasAttributes {

  def apply(
    aliasVersion: Option[software.amazon.awscdk.services.lambda.IVersion] = None,
    aliasName: Option[String] = None
  ): software.amazon.awscdk.services.lambda.AliasAttributes =
    (new software.amazon.awscdk.services.lambda.AliasAttributes.Builder)
      .aliasVersion(aliasVersion.orNull)
      .aliasName(aliasName.orNull)
      .build()
}