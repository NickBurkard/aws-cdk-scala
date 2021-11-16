package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScriptProps {

  def apply(
    storageLocation: software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty,
    name: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnScriptProps =
    (new software.amazon.awscdk.services.gamelift.CfnScriptProps.Builder)
      .storageLocation(storageLocation)
      .name(name.orNull)
      .version(version.orNull)
      .build()
}
