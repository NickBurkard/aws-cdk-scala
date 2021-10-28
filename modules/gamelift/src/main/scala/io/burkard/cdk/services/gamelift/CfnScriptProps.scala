package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScriptProps {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None,
    storageLocation: Option[software.amazon.awscdk.services.gamelift.CfnScript.S3LocationProperty] = None
  ): software.amazon.awscdk.services.gamelift.CfnScriptProps =
    (new software.amazon.awscdk.services.gamelift.CfnScriptProps.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .storageLocation(storageLocation.orNull)
      .build()
}
