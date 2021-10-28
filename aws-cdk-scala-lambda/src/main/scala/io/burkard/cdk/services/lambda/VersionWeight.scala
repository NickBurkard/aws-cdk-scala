package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VersionWeight {

  def apply(
    weight: Option[Number] = None,
    version: Option[software.amazon.awscdk.services.lambda.IVersion] = None
  ): software.amazon.awscdk.services.lambda.VersionWeight =
    (new software.amazon.awscdk.services.lambda.VersionWeight.Builder)
      .weight(weight.orNull)
      .version(version.orNull)
      .build()
}
