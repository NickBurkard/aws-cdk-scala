package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageConfig {

  def apply(
    imageUri: String
  ): software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig.Builder)
      .imageUri(imageUri)
      .build()
}
