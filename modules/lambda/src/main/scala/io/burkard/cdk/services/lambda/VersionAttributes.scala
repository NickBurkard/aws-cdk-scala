package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
