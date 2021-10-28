package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerImageConfig {

  def apply(
    imageUri: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig.Builder)
      .imageUri(imageUri.orNull)
      .build()
}
