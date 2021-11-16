package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersionWeight {

  def apply(
    weight: Number,
    version: software.amazon.awscdk.services.lambda.IVersion
  ): software.amazon.awscdk.services.lambda.VersionWeight =
    (new software.amazon.awscdk.services.lambda.VersionWeight.Builder)
      .weight(weight)
      .version(version)
      .build()
}
