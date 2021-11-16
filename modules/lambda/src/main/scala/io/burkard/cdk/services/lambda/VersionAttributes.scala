package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersionAttributes {

  def apply(
    lambda: software.amazon.awscdk.services.lambda.IFunction,
    version: String
  ): software.amazon.awscdk.services.lambda.VersionAttributes =
    (new software.amazon.awscdk.services.lambda.VersionAttributes.Builder)
      .lambda(lambda)
      .version(version)
      .build()
}
