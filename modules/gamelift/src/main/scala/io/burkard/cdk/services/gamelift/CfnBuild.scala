package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBuild {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    storageLocation: Option[software.amazon.awscdk.services.gamelift.CfnBuild.S3LocationProperty] = None,
    operatingSystem: Option[String] = None,
    version: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnBuild =
    software.amazon.awscdk.services.gamelift.CfnBuild.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .storageLocation(storageLocation.orNull)
      .operatingSystem(operatingSystem.orNull)
      .version(version.orNull)
      .build()
}
