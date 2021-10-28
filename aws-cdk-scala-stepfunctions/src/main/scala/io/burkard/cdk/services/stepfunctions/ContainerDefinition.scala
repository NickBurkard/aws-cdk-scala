package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerDefinition {

  def apply(
    modelS3Location: Option[software.amazon.awscdk.services.stepfunctions.tasks.S3Location] = None,
    image: Option[software.amazon.awscdk.services.stepfunctions.tasks.DockerImage] = None,
    environmentVariables: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    modelPackageName: Option[String] = None,
    mode: Option[software.amazon.awscdk.services.stepfunctions.tasks.Mode] = None,
    containerHostName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition =
    software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition.Builder
      .create()
      .modelS3Location(modelS3Location.orNull)
      .image(image.orNull)
      .environmentVariables(environmentVariables.orNull)
      .modelPackageName(modelPackageName.orNull)
      .mode(mode.orNull)
      .containerHostName(containerHostName.orNull)
      .build()
}
