package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScript {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    version: Option[String] = None,
    storageLocation: Option[software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnScript =
    software.amazon.awscdk.services.gamelift.CfnScript.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .version(version.orNull)
      .storageLocation(storageLocation.orNull)
      .build()
}
