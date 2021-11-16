package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EnvironmentFileConfig {

  def apply(
    s3Location: software.amazon.awscdk.services.s3.Location,
    fileType: software.amazon.awscdk.services.ecs.EnvironmentFileType
  ): software.amazon.awscdk.services.ecs.EnvironmentFileConfig =
    (new software.amazon.awscdk.services.ecs.EnvironmentFileConfig.Builder)
      .s3Location(s3Location)
      .fileType(fileType)
      .build()
}
