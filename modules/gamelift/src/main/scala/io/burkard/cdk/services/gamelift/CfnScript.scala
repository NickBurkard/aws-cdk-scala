package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScript {

  def apply(
    internalResourceId: String,
    storageLocation: software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty,
    name: Option[String] = None,
    version: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnScript =
    software.amazon.awscdk.services.gamelift.CfnScript.Builder
      .create(stackCtx, internalResourceId)
      .storageLocation(storageLocation)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
