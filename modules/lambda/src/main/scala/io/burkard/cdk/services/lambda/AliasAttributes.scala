package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AliasAttributes {

  def apply(
    aliasVersion: software.amazon.awscdk.services.lambda.IVersion,
    aliasName: String
  ): software.amazon.awscdk.services.lambda.AliasAttributes =
    (new software.amazon.awscdk.services.lambda.AliasAttributes.Builder)
      .aliasVersion(aliasVersion)
      .aliasName(aliasName)
      .build()
}
