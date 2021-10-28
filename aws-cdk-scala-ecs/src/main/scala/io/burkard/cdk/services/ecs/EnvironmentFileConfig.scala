package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EnvironmentFileConfig {

  def apply(
    s3Location: Option[software.amazon.awscdk.services.s3.Location] = None,
    fileType: Option[software.amazon.awscdk.services.ecs.EnvironmentFileType] = None
  ): software.amazon.awscdk.services.ecs.EnvironmentFileConfig =
    (new software.amazon.awscdk.services.ecs.EnvironmentFileConfig.Builder)
      .s3Location(s3Location.orNull)
      .fileType(fileType.orNull)
      .build()
}
