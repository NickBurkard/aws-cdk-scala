package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersionAttributes {

  def apply(
    lambda: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.lambda.VersionAttributes =
    (new software.amazon.awscdk.services.lambda.VersionAttributes.Builder)
      .lambda(lambda.orNull)
      .version(version.orNull)
      .build()
}
