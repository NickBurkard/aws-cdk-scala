package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBuildProps {

  def apply(
    name: Option[String] = None,
    storageLocation: Option[software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty] = None,
    operatingSystem: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnBuildProps =
    (new software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder)
      .name(name.orNull)
      .storageLocation(storageLocation.orNull)
      .operatingSystem(operatingSystem.orNull)
      .version(version.orNull)
      .build()
}
